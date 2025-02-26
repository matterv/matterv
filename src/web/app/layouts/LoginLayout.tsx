/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Outlet } from "react-router-dom";

export function LoginLayout() {
  return (
    <main
      className="relative h-screen"
      style={{
        background:
          "radial-gradient(200% 100% at 50% 100%, var(--surface-default) 0%, #161B1D 100%)",
      }}
    >
      <div className="z-10 flex h-full items-center justify-center">
        <Outlet />
      </div>
    </main>
  );
}
