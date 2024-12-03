/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { subHours } from 'date-fns'
// Works without the .js for dev server and prod build in MSW mode, but
// playwright wants the .js. No idea why, let's just add the .js.


import { json, type Json } from '~/api/__generated__/msw-handlers'

interface PaginateOptions {
  limit?: number
  pageToken?: string
}
export interface ResultsPage<I extends { id: string }> {
  items: I[]
  nextPage: string | null
}

export const paginated = <P extends PaginateOptions, I extends { id: string }>(
  params: P,
  items: I[]
) => {
  const { limit = 100, pageToken } = params || {}
  let startIndex = pageToken ? items.findIndex((i) => i.id === pageToken) : 0
  startIndex = startIndex < 0 ? 0 : startIndex

  if (startIndex > items.length) {
    return {
      items: [],
      nextPage: null,
    }
  }

  if (limit + startIndex >= items.length) {
    return {
      items: items.slice(startIndex),
      nextPage: null,
    }
  }

  return {
    items: items.slice(startIndex, startIndex + limit),
    nextPage: `${items[startIndex + limit].id}`,
  }
}

// make a bunch of copies of an object with different names and IDs. useful for
// testing pagination
export const repeat = <T extends { id: string; name: string }>(obj: T, n: number): T[] =>
  new Array(n).fill(0).map((_, i) => ({ ...obj, id: obj.id + i, name: obj.name + i }))

export function getStartAndEndTime(params: { startTime?: Date; endTime?: Date }) {
  // if no start time or end time, give the last 24 hours. in this case the
  // API will give all data available for the metric (paginated of course),
  // so essentially we're pretending the last 24 hours just happens to be
  // all the data. if we have an end time but no start time, same deal, pretend
  // 24 hours before the given end time is where it starts
  const now = new Date()
  const { endTime = now, startTime = subHours(endTime, 24) } = params

  return { startTime, endTime }
}

export const forbiddenErr = () =>
  json({ error_code: 'Forbidden', request_id: 'fake-id' }, { status: 403 })

export const unavailableErr = () =>
  json({ error_code: 'ServiceUnavailable', request_id: 'fake-id' }, { status: 503 })

export const NotImplemented = () => {
  // This doesn't just return the response because it broadens the type to be usable
  // directly as a handler
  throw json({ error_code: 'NotImplemented' }, { status: 501 })
}

export const internalError = (message: string) =>
  json({ error_code: 'InternalError', message }, { status: 500 })

export const errIfExists = <T extends Record<string, unknown>>(
  collection: T[],
  match: Partial<{ [key in keyof T]: T[key] }>,
  resourceLabel = 'resource'
) => {
  if (
    collection.some((item) =>
      Object.entries(match).every(([key, value]) => item[key] === value)
    )
  ) {
    const name =
      'name' in match && match.name
        ? match.name
        : 'id' in match && match.id
          ? match.id
          : '<resource>'
    throw json(
      {
        error_code: 'ObjectAlreadyExists',
        message: `already exists: ${resourceLabel} "${name.toString()}"`,
      },
      { status: 400 }
    )
  }
}


export const MSW_USER_COOKIE = 'msw-user'

/**
 * Look up user by display name in cookie. Return the first user if cookie empty
 * or name not found. We're using display name to make it easier to set the
 * cookie by hand, because there is no way yet to pick a user through the UI.
 *
 * If cookie is empty or name is not found, return the first user in the list,
 * who has admin on everything.
 */

