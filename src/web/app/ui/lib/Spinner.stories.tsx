/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Spinner, spinnerSizes, spinnerVariants } from './Spinner'

export const Default = () => (
  <div className="space-y-2">
    {spinnerSizes.map((size) => (
      <div key={size} className="flex flex-row flex-wrap space-x-2">
        {spinnerVariants.map((variant) => (
          <Spinner key={size + variant} size={size} variant={variant} />
        ))}
      </div>
    ))}
  </div>
)
