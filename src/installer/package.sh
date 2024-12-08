#!/bin/bash
set -E
set -e

usage() {
    echo "Usage: $0 -t <target-directory> [-s]"
    echo "  -t: Target directory (required)"
    echo "  -v: Build version (required)"
    echo "  -s: Skip build"
    exit 1
}

TARGET_DIR=""
VERSION=""
SKIP=false
while getopts "t:v:s" opt; do
    case $opt in
        t) TARGET_DIR="$OPTARG" ;;
        v) VERSION="$OPTARG" ;;
        s) SKIP=true ;;
        ?) usage ;;
    esac
done

if [ -z "$TARGET_DIR" ] || [ -z "$VERSION" ]; then
    echo "Error: Both target directory and version are required"
    usage
fi

SCRIPT_DIR="$(dirname "$(realpath "$0")")"
PROJECT_DIR="${SCRIPT_DIR}/../.."

export PATH=$PROJECT_DIR/bin/apache-maven-3.9.9/bin:$PATH
rm -rf $TARGET_DIR/matterv*/
cleanup() {
    echo "Cleaning up..."
    rm -rf $TARGET_DIR/matterv*/
    popd >/dev/null 2>&1
}

trap cleanup ERR

build_src() {
	echo "build src"
	pushd $PROJECT_DIR/src/server;
	mvn package -DskipTests;
  popd

  pushd $PROJECT_DIR/src/web;
  npm install . && npm run build
  popd
}

HOST_DIR=$TARGET_DIR/matterv-host-$VERSION
package_host() {
  mkdir -p $HOST_DIR/{certs,db,edk2,qemu-kvm,web,scripts}
  cp -ap $PROJECT_DIR/bin/edk2/* $HOST_DIR/edk2/
  cp -ap $PROJECT_DIR/bin/qemu-kvm/* $HOST_DIR/qemu-kvm/
  cp $PROJECT_DIR/src/server/agent/config/certs/host.jks $HOST_DIR/certs/
  cp $PROJECT_DIR/src/server/agent/config/certs/truststore.jks $HOST_DIR/certs/
  cp $PROJECT_DIR/src/web/dist/app/pages/vnc/index.html $HOST_DIR/web/
  cp -ap $PROJECT_DIR/src/web/dist/assets $HOST_DIR/web/
  cp $PROJECT_DIR/src/server/agent/target/agent-1.0-SNAPSHOT.jar $HOST_DIR/host.jar
  cp $PROJECT_DIR/src/server/agent/app.yaml $HOST_DIR/
  cp $SCRIPT_DIR/matterv-host.service $HOST_DIR/
  cp $SCRIPT_DIR/uninstall-matterv-host.sh $HOST_DIR/
  cp $PROJECT_DIR/src/server/scripts/setup_bridge.sh $HOST_DIR/scripts/
}

CLUSTER_DIR=$TARGET_DIR/matterv-cluster-$VERSION
package_cluster() {
  mkdir -p $CLUSTER_DIR/{certs,db,web}
  cp $PROJECT_DIR/src/server/cluster/config/certs/matterverse.jks $CLUSTER_DIR/certs/
  cp $PROJECT_DIR/src/server/cluster/config/certs/truststore.jks $CLUSTER_DIR/certs/
  cp -ap $PROJECT_DIR/src/web/dist/assets $CLUSTER_DIR/web/
  cp $PROJECT_DIR/src/web/dist/index.html $CLUSTER_DIR/web/
  cp $PROJECT_DIR/src/server/cluster/target/cluster-1.0-SNAPSHOT.jar $CLUSTER_DIR/cluster.jar
  cp $PROJECT_DIR/src/server/cluster/app.yaml $CLUSTER_DIR/
  cp $SCRIPT_DIR/matterv-cluster.service $CLUSTER_DIR/
  cp $SCRIPT_DIR/uninstall-matterv-cluster.sh $CLUSTER_DIR/
}

package_src() {
  package_host
  package_cluster
}

if [ "$SKIP" = false ]; then
  build_src
fi

package_src

rm -rf $TARGET_DIR/matterv-*$VERSION.tar.xz

tar -cJf $TARGET_DIR/matterv-cluster-$VERSION.tar.xz -C $TARGET_DIR matterv-cluster-$VERSION
tar -cJf $TARGET_DIR/matterv-host-$VERSION.tar.xz -C $TARGET_DIR matterv-host-$VERSION
rm -rf $TARGET_DIR/matterv*/