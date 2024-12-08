/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import type { HostStatus, VMStatus } from "@oxide/api";

import { Badge, type BadgeProps } from "~/ui/lib/Badge";

const INSTANCE_COLORS: Record<
  VMStatus,
  Pick<BadgeProps, "color" | "variant">
> = {
  CREATING: { color: "purple", variant: "solid" },
  RUNNING: { color: "default" },
  STOPPED: { color: "neutral", variant: "solid" },
  STARTING: { color: "purple" },
  STOPPING: { color: "purple" },
  REBOOTING: { color: "purple" },
  FAILED: { color: "purple" },
  DESTROYED: { color: "purple" },
};

export const InstanceStateBadge = (props: {
  state: VMStatus;
  className?: string;
}) => (
  <Badge {...INSTANCE_COLORS[props.state]} className={props.className}>
    {props.state}
  </Badge>
);

const HOST_COLORS: Record<HostStatus, Pick<BadgeProps, "color" | "variant">> = {
  READY: { color: "purple", variant: "solid" },
  UNINITIALIZED: { color: "purple" },
  MAINTENANCE: { color: "purple" },
};

export const HostStateBadge = (props: {
  state: HostStatus;
  className?: string;
}) => (
  <Badge {...HOST_COLORS[props.state]} className={props.className}>
    {props.state}
  </Badge>
);
