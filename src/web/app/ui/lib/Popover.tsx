/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import {
  DismissButton,
  Overlay,
  usePopover,
  type AriaPopoverProps,
} from '@react-aria/overlays'
import { useRef, type ReactNode } from 'react'
import type { OverlayTriggerState } from 'react-stately'

interface PopoverProps extends Omit<AriaPopoverProps, 'popoverRef'> {
  state: OverlayTriggerState
  children: ReactNode
}

export function Popover(props: PopoverProps) {
  const ref = useRef<HTMLDivElement>(null)
  const { state, children } = props

  const { popoverProps, underlayProps } = usePopover(
    {
      ...props,
      popoverRef: ref,
    },
    state
  )

  // Add a hidden <DismissButton> component at the end of the popover
  // to allow screen reader users to dismiss the popup easily.
  return (
    <Overlay>
      <div {...underlayProps} className="fixed inset-0" />
      <div
        {...popoverProps}
        ref={ref}
        className="rounded-md absolute top-full z-popover mt-2 rounded-lg border bg-raise border-secondary elevation-2"
      >
        <DismissButton onDismiss={state.close} />
        {children}
        <DismissButton onDismiss={state.close} />
      </div>
    </Overlay>
  )
}
