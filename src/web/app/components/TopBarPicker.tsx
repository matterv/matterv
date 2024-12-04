/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Link } from "react-router-dom";

import * as DropdownMenu from "~/ui/lib/DropdownMenu";
import { Wrap } from "~/ui/util/wrap";
import { pb } from "~/util/path-builder";

type TopBarPickerItem = {
  label: string;
  to: string;
};

type TopBarPickerProps = {
  "aria-label": string;
  category: string;
  /** Text displayed below the category. Defaults to `current` if not provided. */
  display?: string;
  /** The actively selected option. Used as display if display isn't present. */
  current: string | null | undefined;
  items?: TopBarPickerItem[];
  noItemsText?: string;
  icon?: React.ReactElement;
  to?: string;
};

const TopBarPicker = (props: TopBarPickerProps) => {
  return (
    <DropdownMenu.Root>
      <div
        // Important trick: we never want the separator to show up after the top
        // left corner picker. The separator starts from the leftmost of "other
        // pickers". But the leftmost corner one is in its own container and
        // therefore always last-of-type, so it will never get one.
        className="after:text-mono-lg flex w-full items-center justify-between after:mx-4 after:content-['/'] after:text-quinary last-of-type:after:content-none"
      >
        {props.current ? (
          <Wrap
            when={props.to}
            with={
              <Link
                to={props.to!}
                className="-m-1 grow rounded-lg p-1 hover:bg-hover"
              />
            }
          >
            <div className="flex min-w-[120px] max-w-[185px] items-center pr-2">
              <div className="w-full overflow-hidden text-ellipsis whitespace-nowrap text-center text-sans-md text-secondary">
                {props.display ?? props.current}
              </div>
            </div>
          </Wrap>
        ) : (
          <DropdownMenu.Trigger
            className="group -m-1 flex items-center overflow-hidden rounded-lg p-1 text-left hover:bg-hover"
            aria-hidden // avoid doubling up on the select project trigger for screen readers
          >
            {props.icon ? (
              <div className="mr-2 flex items-center">{props.icon}</div>
            ) : null}

            <div className="min-w-[5rem] text-mono-xs text-quaternary">
              Select
              <br />
              {props.category}
            </div>
          </DropdownMenu.Trigger>
        )}
      </div>
    </DropdownMenu.Root>
  );
};

/**
 * Choose between System and Silo-scoped route trees, or if the user doesn't
 * have access to system routes (i.e., if systemPolicyView 403s) show the
 * current silo.
 */
export function SiloSystemPicker({ value }: { value: "silo" | "system" }) {
  const commonProps = {
    items: [
      { label: "System", to: pb.silos() },
      { label: "Silo", to: pb.projects() },
    ],
    "aria-label": "Switch between system and silo",
  };

  return (
    <TopBarPicker
      {...commonProps}
      category="System"
      current="System"
      display="MatterV"
      to={pb.root()}
    />
  );
}
