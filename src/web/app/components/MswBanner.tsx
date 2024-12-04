/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import { Info16Icon } from "@oxide/design-system/icons/react";

export function MswBanner() {
  return (
    <>
      <label className="absolute z-topBar flex h-10 w-full items-center justify-center text-sans-md text-info-secondary bg-info-secondary [&+*]:pt-10">
        <Info16Icon className="mr-2" /> Technical Preview: This demo contains
        simulated data for illustration purposes only.
      </label>
    </>
  );
}
