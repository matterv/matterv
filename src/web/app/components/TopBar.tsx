/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import cn from "classnames";
import React from "react";

import {
  DirectionDownIcon,
  Profile16Icon,
} from "@oxide/design-system/icons/react";

import { buttonStyle } from "~/ui/lib/Button";
import * as DropdownMenu from "~/ui/lib/DropdownMenu";
import { navToLogin, useApiMutation, usePrefetchedApiQuery } from "~/api";

export function TopBar({ children }: { children: React.ReactNode }) {
  const logout = useApiMutation("logout", {
    onSuccess: () => navToLogin({ includeCurrent: false }),
  });
  const { data: user } = usePrefetchedApiQuery("getUser", {});
  // toArray filters out nulls, which is essential because the silo/system
  // picker is going to come in null when the user isn't supposed to see it
  const [cornerPicker, ...otherPickers] = React.Children.toArray(children);

  // The height of this component is governed by the `PageContainer`
  // It's important that this component returns two distinct elements (wrapped in a fragment).
  // Each element will occupy one of the top column slots provided by `PageContainer`.
  return (
    <>
      <div className="flex items-center border-b border-r px-3 border-secondary">
        {cornerPicker}
      </div>
      {/* Height is governed by PageContainer grid */}
      {/* shrink-0 is needed to prevent getting squished by body content */}
      <div className="z-topBar border-b bg-default border-secondary">
        <div className="mx-3 flex h-[60px] shrink-0 items-center justify-between">
          <div className="flex items-center">{otherPickers}</div>
          <div className="flex items-center gap-2">
            <DropdownMenu.Root>
              <DropdownMenu.Trigger
                className={cn(
                  buttonStyle({ size: "sm", variant: "secondary" }),
                  "flex items-center gap-2",
                )}
                aria-label="User menu"
              >
                <Profile16Icon className="text-quaternary" />
                <span className="normal-case text-sans-md text-secondary">
                  {user.name}
                </span>
                <DirectionDownIcon className="!w-2.5" />
              </DropdownMenu.Trigger>
              <DropdownMenu.Content gap={8} className="!z-topBarPopover">
                <DropdownMenu.Item
                  onSelect={() => {
                    logout.mutate({});
                  }}
                >
                  Sign out
                </DropdownMenu.Item>
              </DropdownMenu.Content>
            </DropdownMenu.Root>
          </div>
        </div>
      </div>
    </>
  );
}
