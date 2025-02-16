#!/bin/bash

VERSION=0.7.0

usage() {
    echo "Usage: $0 -l binary path"
    echo "  -l: MatterV host binary path"
    exit 1
}

LOCAL_BINARY=""

while getopts "l:" opt; do
    case $opt in
        l) LOCAL_BINARY="$OPTARG" ;;
        ?) usage ;;
    esac
done

load_kvm_modules() {
  # Reload the KVM module with enable_vmware_backdoor=Y
  echo "Reloading KVM module with enable_vmware_backdoor=Y..."
  sudo modprobe kvm enable_vmware_backdoor=1

  if [ $? -eq 0 ]; then
    echo "KVM module successfully reloaded with enable_vmware_backdoor=Y."
  else
    echo "Failed to reload the KVM module. You may need root privileges."
    exit 1
  fi
  sudo modprobe kvm_amd kvm_intel
}

enable_vmware() {
  PARAM_FILE="/sys/module/kvm/parameters/enable_vmware_backdoor"
  if [ ! -f "$PARAM_FILE" ]; then
    load_kvm_modules
    return
  fi

  # Read the current value
  CURRENT_VALUE=$(cat "$PARAM_FILE")

  # Check if the current value is not 'Y'
  if [ "$CURRENT_VALUE" == "Y" ]; then
    echo "kvm has vmware enabled already"
    return
  fi

  echo "Checking for running qemu-kvm processes..."
  QEMU_PROCESSES=$(pgrep qemu-kvm)

  if [ -n "$QEMU_PROCESSES" ]; then
      echo "Found running qemu-kvm processes. Killing them..."
      sudo kill -9 $QEMU_PROCESSES
      if [ $? -eq 0 ]; then
          echo "All qemu-kvm processes have been terminated."
      else
          echo "Failed to kill qemu-kvm processes. You may need root privileges."
          exit 1
      fi
  else
      echo "No qemu-kvm processes are running."
  fi

  # Check if the KVM module is loaded
  if lsmod | grep -q "kvm"; then
      echo "KVM module is loaded. Unloading it..."

      # Unload the KVM module
      sudo modprobe -r kvm_intel kvm_amd kvm
      if [ $? -eq 0 ]; then
          echo "KVM module successfully unloaded."
      else
          echo "Failed to unload the KVM module. You may need root privileges or there may be dependencies."
          exit 1
      fi
  else
      echo "KVM module is not loaded."
  fi

  load_kvm_modules
}

BINARY=""
BINARY_NAME=""
refresh_install() {
  echo "Refresh install"
  mkdir -p /opt/matterv
  mkdir -p /var/log/matterv-host
  mkdir -p /var/run/matterv-host/vms
  tar -xf $BINARY -C /opt/matterv
  ln -s /opt/matterv/$BINARY_NAME /opt/matterv/host
  cp /opt/matterv/host/matterv-host.service /etc/systemd/system/
  chmod 644 /etc/systemd/system/matterv-host.service
  firewall-cmd --zone=public --add-port=8442/tcp --permanent
  firewall-cmd --zone=public --add-port=8443/tcp --permanent
  firewall-cmd --reload
  java -jar /opt/matterv/host/host.jar db migrate /opt/matterv/host/app.yaml &> /dev/null
  systemctl daemon-reload
  systemctl enable matterv-host
  systemctl start matterv-host
}

upgrade() {
  echo "Upgrade"
  systemctl stop matterv-host
  tar -xf $BINARY -C /opt/matterv
  cp /opt/matterv/host/db/data.db /opt/matterv/$BINARY_NAME/db/
  ln -sfn /opt/matterv/$BINARY_NAME /opt/matterv/host
  java -jar /opt/matterv/host/host.jar db migrate /opt/matterv/host/app.yaml &> /dev/null
  systemctl daemon-reload
  systemctl start matterv-host
}

install() {
  refresh_install
}

install_from_network() {
  echo "install from network"

  if [ ! -d "/opt/matterv/" ]; then
    mkdir -p /opt/matterv
  fi

  rm -rf /opt/matterv/matterv-host-${VERSION}*

  curl -L https://github.com/matterv/matterv/releases/download/v${VERSION}/matterv-host-${VERSION}.tar.xz -o /opt/matterv/matterv-host-${VERSION}.tar.xz
  tar -xf /opt/matterv/matterv-host-${VERSION}.tar.xz -C /opt/matterv/
  BINARY=/opt/matterv/matterv-host-${VERSION}.tar.xz
  BINARY_NAME=$(basename $BINARY .tar.xz)
  install
}

dnf install tar xz java-21-openjdk qemu-kvm -y

if [ -n "$LOCAL_BINARY" ]; then
  echo "install from $LOCAL_BINARY"
  BINARY=$LOCAL_BINARY
  BINARY_NAME=$(basename $LOCAL_BINARY .tar.xz)
  install
else
  install_from_network
fi

