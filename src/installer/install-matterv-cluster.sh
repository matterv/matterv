#!/bin/bash

VERSION=0.7.0

usage() {
    echo "Usage: $0 -l binary path"
    echo "  -l: MatterV cluster binary path"
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
  mkdir -p /var/log/matterv-cluster
  tar -xf $BINARY -C /opt/matterv
  ln -s /opt/matterv/$BINARY_NAME /opt/matterv/cluster
  cp /opt/matterv/cluster/matterv-cluster.service /etc/systemd/system/
  chmod 644 /etc/systemd/system/matterv-cluster.service
  java -jar /opt/matterv/cluster/cluster.jar db migrate /opt/matterv/cluster/app.yaml &> /dev/null
  firewall-cmd --zone=public --add-port=8543/tcp --permanent
  firewall-cmd --reload
  systemctl daemon-reload
  systemctl enable matterv-cluster
  systemctl start matterv-cluster
}

upgrade() {
  echo "Upgrade"
  systemctl stop matterv-cluster
  tar -xf $BINARY -C /opt/matterv
  cp /opt/matterv/cluster/db/data.db /opt/matterv/$BINARY_NAME/db/
  ln -sfn /opt/matterv/$BINARY_NAME /opt/matterv/cluster
  java -jar /opt/matterv/cluster/cluster.jar db migrate /opt/matterv/cluster/app.yaml &> /dev/null
  systemctl daemon-reload
  systemctl start matterv-cluster
}

install() {
  refresh_install
}

install_from_network() {
  echo "install from network"

  if [ ! -d "/opt/matterv/" ]; then
    mkdir -p /opt/matterv
  fi

  rm -rf /opt/matterv/matterv-cluster-${VERSION}*

  curl -L https://github.com/matterv/matterv/releases/download/v${VERSION}/matterv-cluster-${VERSION}.tar.xz -o /opt/matterv/matterv-cluster-${VERSION}.tar.xz
  tar -xf /opt/matterv/matterv-cluster-${VERSION}.tar.xz -C /opt/matterv/
  BINARY=/opt/matterv/matterv-cluster-${VERSION}.tar.xz
  BINARY_NAME=$(basename $BINARY .tar.xz)
  install
}

dnf install tar xz java-21-openjdk -y

if [ -n "$LOCAL_BINARY" ]; then
  echo "install from $LOCAL_BINARY"
  BINARY=$LOCAL_BINARY
  BINARY_NAME=$(basename $LOCAL_BINARY .tar.xz)
  install
else
  install_from_network
fi

