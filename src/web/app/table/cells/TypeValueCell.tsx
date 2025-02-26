/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import { Badge } from '~/ui/lib/Badge'

export type TypeValue = {
  type: string
  value: string
}

export const TypeValueCell = ({ type, value }: TypeValue) => (
  <div className="space-x-0.5">
    <Badge>{type}</Badge>
    <Badge variant="solid" className="!normal-case">
      {value}
    </Badge>
  </div>
)
