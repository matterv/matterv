/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import type { LoaderFunctionArgs } from 'react-router-dom'

import { apiQueryClient, usePrefetchedApiQuery } from '@oxide/api'
import { Ssd16Icon, Storage24Icon } from '@oxide/design-system/icons/react'

import { CapacityBar } from '~/components/CapacityBar.tsx'
import { RouteTabs, Tab } from '~/components/RouteTabs.tsx'
import { requiredStorageParams, useStorageParams } from '~/hooks/use-params'
import { PageHeader, PageTitle } from '~/ui/lib/PageHeader'
import { pb } from '~/util/path-builder.ts'
import { bytesToTiB } from '~/util/units.ts'

StoragePage.loader = async ({ params }: LoaderFunctionArgs) => {
  const { storageId } = requiredStorageParams(params)
  await apiQueryClient.prefetchQuery('getStorage', {
    path: { storageId },
  })
  return null
}

export function StoragePage() {
  const { storageId } = useStorageParams()
  const { data: storage } = usePrefetchedApiQuery('getStorage', { path: { storageId } })

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Storage24Icon />}>{storage.name}</PageTitle>
      </PageHeader>

      <div className="mb-12 flex min-w-min flex-col gap-3 lg+:flex-row">
        <CapacityBar
          icon={<Ssd16Icon />}
          title="STORAGE"
          unit="TiB"
          provisioned={bytesToTiB(storage.capacityInBytes! - storage.freeInBytes!)}
          capacity={bytesToTiB(storage.capacityInBytes!)}
          capacityLabel="Quota (Total)"
        />
      </div>
      <RouteTabs fullWidth>
        <Tab to={pb.storageFiles(storageId)}>Files</Tab>
      </RouteTabs>
    </>
  )
}
