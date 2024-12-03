#!/bin/bash

usage() {
    echo "Usage: $0 -b bridge name -p physical network name"
    echo "  -b: bridge name (required)"
    echo "  -p: physical network device name (required)"
    exit 1
}

BRIDGE_NAME=""
PHYSICAL_NIC=""

while getopts "b:p:h" opt; do
    case $opt in
        b) BRIDGE_NAME="$OPTARG" ;;
        p) PHYSICAL_NIC="$OPTARG" ;;
        h) usage ;;
        ?) usage ;;
    esac
done

if [ -z "$BRIDGE_NAME" ] || [ -z "$PHYSICAL_NIC" ]; then
    echo "Error: Both bridge name and physical nic are required"
    usage
fi

if [ "$EUID" -ne 0 ]; then
  echo "Please run as root"
  exit 1
fi


# Verify physical NIC exists
if ! nmcli device show "$PHYSICAL_NIC" &> /dev/null; then
    echo "Error: Physical NIC $PHYSICAL_NIC does not exist."
    exit 1
fi

# Get the current connection name for the physical NIC
PHYSICAL_CON=$(nmcli -g NAME con show --active | grep "$PHYSICAL_NIC")

if [ -z "$PHYSICAL_CON" ]; then
    echo "Error: No active connection found for $PHYSICAL_NIC"
    exit 1
fi

# Determine if the current connection uses DHCP or static IP
IP_METHOD=$(nmcli -g ipv4.method con show "$PHYSICAL_CON")

# Function to get IP settings
get_ip_settings() {
    local con_name=$1
    local ip_address=$(nmcli -g ipv4.addresses con show "$con_name" | cut -d'/' -f1)
    local subnet_mask=$(nmcli -g ipv4.addresses con show "$con_name" | cut -d'/' -f2)
    local gateway=$(nmcli -g ipv4.gateway con show "$con_name")
    local dns=$(nmcli -g ipv4.dns con show "$con_name" | sed 's/,/ /g')
    echo "$ip_address $subnet_mask $gateway $dns"
}

# Create bridge
nmcli con add type bridge con-name $BRIDGE_NAME ifname $BRIDGE_NAME

# Add physical NIC to bridge
nmcli con add type bridge-slave con-name "bridge-slave-$PHYSICAL_NIC" ifname $PHYSICAL_NIC master $BRIDGE_NAME

# Configure IP settings for the bridge
if [ "$IP_METHOD" == "auto" ]; then
    echo "Configuring bridge to use DHCP..."
    nmcli con modify $BRIDGE_NAME ipv4.method auto
else
    echo "Configuring bridge with static IP settings..."
    read ip_address subnet_mask gateway dns <<< $(get_ip_settings "$PHYSICAL_CON")
    nmcli con modify $BRIDGE_NAME ipv4.addresses "$ip_address/$subnet_mask"
    nmcli con modify $BRIDGE_NAME ipv4.gateway "$gateway"
    nmcli con modify $BRIDGE_NAME ipv4.dns "$dns"
    nmcli con modify $BRIDGE_NAME ipv4.method manual
fi

# Ensure bridge and slave connections auto-connect
nmcli con modify $BRIDGE_NAME connection.autoconnect yes
nmcli con modify "bridge-slave-$PHYSICAL_NIC" connection.autoconnect yes

# Disable auto-connect for the original physical NIC connection
nmcli con modify "$PHYSICAL_CON" connection.autoconnect no

# Bring down physical NIC connection
nmcli con down "$PHYSICAL_CON"

# Bring up bridge connection
nmcli con up $BRIDGE_NAME