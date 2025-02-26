/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Success12Icon } from '@oxide/design-system/icons/react'

import { Badge } from '~/ui/lib/Badge'

export const DefaultPoolCell = ({ isDefault }: { isDefault: boolean }) =>
  isDefault ? (
    <>
      <Success12Icon className="mr-1 text-accent" />
      <Badge>default</Badge>
    </>
  ) : null
