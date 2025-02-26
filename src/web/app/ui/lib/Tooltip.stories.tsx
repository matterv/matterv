/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Filter12Icon } from '@oxide/design-system/icons/react'

import { Tooltip } from './Tooltip'

export const Default = () => (
  <>
    <Tooltip content="Filter">
      <button type="button">
        <Filter12Icon />
      </button>
    </Tooltip>
  </>
)
