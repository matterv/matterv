/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { createColumnHelper, getCoreRowModel, useReactTable } from '@tanstack/react-table'
import { useMemo } from 'react'
import type { LoaderFunctionArgs } from 'react-router-dom'

import { apiQueryClient, usePrefetchedApiQuery, type Disk } from '@oxide/api'
import { Storage24Icon } from '@oxide/design-system/icons/react'

import { getInstanceSelector, useInstanceSelector } from '~/hooks/use-params'
import { SizeCell } from '~/table/columns/common'
import { Table } from '~/table/Table'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'
import { TableEmptyBox } from '~/ui/lib/Table'
import { ALL_ISH } from '~/util/consts.ts'

const EmptyState = () => (
  <TableEmptyBox>
    <EmptyMessage
      icon={<Storage24Icon />}
      title="No disks"
      body="Attach a disk to this instance to see it here"
    />
  </TableEmptyBox>
)

StorageTab.loader = async ({ params }: LoaderFunctionArgs) => {
  const { vmId } = getInstanceSelector(params)
  const selector = { path: { vmId } }
  await Promise.all([
    // don't bother with page size because this will never paginate. max disks
    // per instance is 8
    // https://github.com/oxidecomputer/omicron/blob/40fc3835/nexus/db-queries/src/db/queries/disk.rs#L16-L21
    apiQueryClient.prefetchQuery('getVmDisks', selector),
    // This is covered by the InstancePage loader but there's no downside to
    // being redundant. If it were removed there, we'd still want it here.
    apiQueryClient.prefetchQuery('getVm', selector),
    apiQueryClient.prefetchQuery('getStorages', { query: { limit: ALL_ISH } }),
  ])
  return null
}

const colHelper = createColumnHelper<Disk>()

export function StorageTab() {
  const { vmId } = useInstanceSelector()
  const instancePathQuery = useMemo(() => ({ path: { vmId } }), [vmId])

  const { data: disks } = usePrefetchedApiQuery('getVmDisks', instancePathQuery)
  const { data: storages } = usePrefetchedApiQuery('getStorages', {
    query: { limit: ALL_ISH },
  })

  const rows = useMemo(() => disks.items.map((disk) => ({ ...disk })), [disks.items])

  const columns = useMemo(
    () => [
      colHelper.accessor('id', { header: 'Disk Id' }),
      colHelper.accessor('size', { cell: SizeCell, header: 'Size' }),
      colHelper.accessor('storageId', {
        header: 'Storage',
        cell: (info) => {
          const storageId = info.row.original.storageId
          return storages.items.find((storage) => storage.id === storageId)?.name
        },
      }),
    ],
    [storages]
  )
  const table = useReactTable({
    columns: columns,
    data: rows,
    getCoreRowModel: getCoreRowModel(),
  })

  return <>{disks.items.length > 0 ? <Table table={table} /> : <EmptyState />}</>
}
