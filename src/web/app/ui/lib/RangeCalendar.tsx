/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { createCalendar, type DateValue } from '@internationalized/date'
import cn from 'classnames'
import { useRef, type ReactNode } from 'react'
import {
  useLocale,
  useRangeCalendar,
  type AriaButtonProps,
  type RangeCalendarProps,
} from 'react-aria'
import {
  useRangeCalendarState,
  type CalendarState,
  type RangeCalendarState,
} from 'react-stately'

import { DirectionLeftIcon, DirectionRightIcon } from '@oxide/design-system/icons/react'

import { CalendarGrid } from './CalendarGrid'

export function RangeCalendar(props: RangeCalendarProps<DateValue>) {
  const { locale } = useLocale()
  const state = useRangeCalendarState({
    ...props,
    locale,
    createCalendar,
  })

  const ref = useRef<HTMLDivElement>(null)
  const { calendarProps, prevButtonProps, nextButtonProps, title } = useRangeCalendar(
    props,
    state,
    ref
  )

  return (
    <div {...calendarProps} ref={ref}>
      <CalendarHeader
        state={state}
        title={title}
        prevButtonProps={prevButtonProps}
        nextButtonProps={nextButtonProps}
      />
      <CalendarGrid state={state} />
    </div>
  )
}

// TODO: use useButton here too?
export const CalendarButton = ({
  handleClick,
  children,
  isDisabled,
}: {
  handleClick: () => void
  children: ReactNode
  isDisabled: boolean
}) => (
  <button
    type="button"
    onClick={handleClick}
    disabled={isDisabled}
    className={cn(
      'flex h-8 w-10 items-center justify-center rounded outline-none text-tertiary',
      isDisabled ? 'text-disabled' : 'hover:bg-tertiary'
    )}
  >
    {children}
  </button>
)

export const CalendarHeader = ({
  state,
  title,
  prevButtonProps,
  nextButtonProps,
}: {
  state: RangeCalendarState | CalendarState
  title: string
  prevButtonProps: AriaButtonProps<'button'>
  nextButtonProps: AriaButtonProps<'button'>
}) => (
  <div className="flex items-center p-4">
    <CalendarButton
      handleClick={state.focusPreviousPage}
      isDisabled={prevButtonProps.isDisabled || false}
    >
      <DirectionLeftIcon />
    </CalendarButton>
    <h2 className="ml-2 flex-1 text-center text-sans-md">{title}</h2>
    <CalendarButton
      handleClick={state.focusNextPage}
      isDisabled={nextButtonProps.isDisabled || false}
    >
      <DirectionRightIcon />
    </CalendarButton>
  </div>
)
