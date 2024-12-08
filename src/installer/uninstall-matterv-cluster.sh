#!/bin/bash

systemctl stop matterv-cluster
systemctl disable matterv-cluster
rm -f /etc/systemd/system/matterv-cluster.service
systemctl daemon-reload
TARGET_DIR=$(readlink -f /opt/matterv/cluster)
rm -rf /var/log/matterv-cluster
rm -rf $TARGET_DIR && rm -rf /opt/matterv/cluster