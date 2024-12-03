/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { Outlet } from 'react-router-dom'

import { apiQueryClient } from '@oxide/api'

import { QuickActions } from '~/hooks/use-quick-actions'

/**
 * We use `shouldRevalidate={() => true}` to force this to re-run on every nav,
 * but the longer-than-default `staleTime` avoids fetching too much.
 */
AuthenticatedLayout.loader = async () => {
  await Promise.all([
    apiQueryClient.prefetchQuery('getUser', {}),
  ])
  return null
}

/** Wraps all authenticated routes. */
export function AuthenticatedLayout() {
  return (
    <>
      <QuickActions />
      <Outlet />
    </>
  )
}

/**
 * Access all the data fetched by the loader. Because of the `shouldRevalidate`
 * trick, that loader runs on every authenticated page, which means callers do
 * not have to worry about hitting these endpoints themselves in their own
 * loaders.
 */
export function useCurrentUser() {

  return { }
}
