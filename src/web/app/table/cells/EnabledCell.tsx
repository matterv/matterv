/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import type { VpcFirewallRuleStatus } from '@oxide/api'
import { Disabled12Icon, Success12Icon } from '@oxide/design-system/icons/react'

import { Badge } from '~/ui/lib/Badge'

export const EnabledCell = ({ value }: { value: VpcFirewallRuleStatus }) =>
  value === 'enabled' ? (
    <>
      <Success12Icon className="mr-1 text-accent" />
      <Badge>Enabled</Badge>
    </>
  ) : (
    <>
      <Disabled12Icon className="mr-1 text-notice" />
      <Badge color="notice">Disabled</Badge>
    </>
  )
