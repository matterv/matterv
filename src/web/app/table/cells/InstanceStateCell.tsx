/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import type { VMStatus } from '@oxide/api'

import { InstanceStateBadge } from '~/components/StateBadge'

type Props = { value: VMStatus }

export const InstanceStateCell = ({ value }: Props) => {
  return (
    <div className="flex items-center gap-1.5">
      <InstanceStateBadge state={value} />
    </div>
  )
}
