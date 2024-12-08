/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { createColumnHelper } from '@tanstack/react-table'
import { useMemo, useState } from 'react'

import { apiQueryClient, usePrefetchedApiQuery, type Storage } from '@oxide/api'
import { Instances24Icon, Storage24Icon } from '@oxide/design-system/icons/react'

import { AddStorageModal } from '~/pages/storage/AddStorageModal.tsx'
import { LinkCell } from '~/table/cells/LinkCell.tsx'
import { PAGE_SIZE, useQueryTable } from '~/table/QueryTable'
import { Button } from '~/ui/lib/Button.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage.tsx'
import { PageHeader, PageTitle } from '~/ui/lib/PageHeader'
import { TableActions } from '~/ui/lib/Table.tsx'
import { pb } from '~/util/path-builder.ts'

const colHelper = createColumnHelper<Storage>()

const EmptyState = () => (
  <EmptyMessage
    icon={<Instances24Icon />}
    title="No storages"
  />
)

StoragesPage.loader = async () => {
  await apiQueryClient.prefetchQuery('getStorages', { query: { limit: PAGE_SIZE } })
  await apiQueryClient.prefetchQuery('getHosts', { query: { limit: PAGE_SIZE } })

  return null
}

export function StoragesPage() {
  const [showAddStorage, setAddStorage] = useState(false)
  const { data: hosts } = usePrefetchedApiQuery('getHosts', { query: { limit: PAGE_SIZE } })

  const { Table } = useQueryTable(
    'getStorages',
    { query: { limit: PAGE_SIZE } },
    { placeholderData: (x) => x }
  )

  const columns = useMemo(
    () => [
      colHelper.accessor('name', {
        cell: (info) => {
          const id = info.row.original.id
          return <LinkCell to={pb.storage(id)}>{info.getValue()}</LinkCell>
        },
      }),
      colHelper.accessor('mountPoint', {
        header: 'Path',
        cell: (info) => <>{info.getValue()}</>,
      }),
      colHelper.accessor('storageType', {
        cell: (info) => <>{info.getValue()}</>,
      }),
      colHelper.accessor('hostId', {
        header: 'host',
        cell: (info) => <>{info.getValue()}</>,
      }),
    ],
    []
  )

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Storage24Icon />}>Storages</PageTitle>
      </PageHeader>

      <TableActions className="!-mt-6 !justify-between">
        <Button
          size="sm"
          onClick={() => setAddStorage(true)}
          disabled={hosts.items.length === 0}
        >
          Add storage
        </Button>
      </TableActions>
      <Table columns={columns} emptyState={<EmptyState />} />
      {showAddStorage && <AddStorageModal onDismiss={() => setAddStorage(false)} />}
    </>
  )
}
