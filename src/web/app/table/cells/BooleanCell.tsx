/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

/* eslint-disable jsx-a11y/aria-proptypes */
// there seems to be a bug in the linter. it doesn't want you to use the string
// "true" because it insists it's a boolean
import { Disabled12Icon, Success12Icon } from '@oxide/design-system/icons/react'

export const BooleanCell = ({ isTrue }: { isTrue: boolean }) =>
  isTrue ? (
    <Success12Icon className="mr-1 text-accent" aria-label="true" />
  ) : (
    <Disabled12Icon className="mr-1 text-notice" aria-label="false" />
  )
