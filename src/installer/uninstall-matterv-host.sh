#!/bin/bash

systemctl stop matterv-host
systemctl disable matterv-host
rm -f /etc/systemd/system/matterv-host.service
systemctl daemon-reload
TARGET_DIR=$(readlink -f /opt/matterv/host)
pkill -9 qemu-kvm
rm -rf /var/log/matterv-host
rm -rf /var/run/matterv-host
rm -rf $TARGET_DIR && rm -rf /opt/matterv/host