#!/bin/bash
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, you can obtain one at https://mozilla.org/MPL/2.0/.
#  
# Copyright Oxide Computer Company

set -o errexit # exit if anything fails
set -o pipefail
set -o xtrace

OMICRON_SHA=$(head -n 1 OMICRON_VERSION)
GEN_DIR="$PWD/app/api/__generated__"

SPEC_URL="./merged.yaml"

openapi-merger -i ../server/api/src/main/resources/matterverse-api.yaml -o $SPEC_URL
sed -i 's|/v1/|/api/v1/|g' $SPEC_URL
# use versions of these packages specified in dev deps
npm run openapi-gen-ts -- $SPEC_URL $GEN_DIR --features msw
npm run prettier -- --write --log-level error "$GEN_DIR"
sed -i 's/snakeify(body)/body/g' app/api/__generated__/http-client.ts
rm -rf $SPEC_URL

