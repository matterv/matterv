/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import cn from 'classnames'
import type { ReactNode } from 'react'

import { Badge } from '~/ui/lib/Badge'
import { isOneOf } from '~/util/children'
import { invariant } from '~/util/invariant'

export interface PropertiesTableProps {
  className?: string
  children: ReactNode
}

export function PropertiesTable({ className, children }: PropertiesTableProps) {
  invariant(
    isOneOf(children, [PropertiesTable.Row]),
    'PropertiesTable can only have PropertiesTable.Row as a child'
  )
  return (
    <div
      className={cn(
        className,
        'properties-table grid min-w-min basis-6/12 divide-y rounded-lg border border-default children:pl-3 children:pr-6 children:border-secondary'
      )}
    >
      {children}
    </div>
  )
}

interface PropertiesTableRowProps {
  label: string
  children: ReactNode
}
PropertiesTable.Row = ({ label, children }: PropertiesTableRowProps) => (
  <>
    <span className="flex items-center">
      <Badge>{label}</Badge>
    </span>
    <div className="flex h-11 items-center overflow-hidden whitespace-nowrap pr-4 text-sans-md text-secondary">
      {children}
    </div>
  </>
)

interface PropertiesTableGroupProps {
  children: ReactNode
  className?: string
}

PropertiesTable.Group = ({ children, className }: PropertiesTableGroupProps) => {
  invariant(
    isOneOf(children, [PropertiesTable]),
    'PropertiesTable can only have PropertiesTable as a child'
  )
  return (
    <div
      className={cn(
        className,
        'flex min-w-min md-:flex-col md-:first:children:rounded-b-none md-:first:children:border-b-secondary md-:last:children:rounded-t-none md-:last:children:border-t-0 lg+:gap-x-4'
      )}
    >
      {children}
    </div>
  )
}
