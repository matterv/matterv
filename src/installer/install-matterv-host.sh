#!/bin/bash

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
  if [ ! -d "/opt/matterv" ] || { [ ! -L "/opt/matterv/host" ] || [ ! -d "/opt/matterv/host" ]; }; then
    refresh_install
  else
    upgrade
  fi
}

install_from_network() {
  echo "install from network"

  if [ ! -d "/opt/matterv/" ]; then
    mkdir -p /opt/matterv
  fi

  rm -rf /opt/matterv/matterv-host-0.6*

  curl -L https://github.com/matterv/matterv/releases/download/v0.6.0/matterv-host-0.6.tar.xz -o /opt/matterv/matterv-host-0.6.tar.xz
  tar -xf /opt/matterv/matterv-host-0.6.tar.xz -C /opt/matterv/
  BINARY=/opt/matterv/matterv-host-0.6.tar.xz
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

