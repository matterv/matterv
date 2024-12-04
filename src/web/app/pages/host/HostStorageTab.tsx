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
import { useState } from 'react'
import type { LoaderFunctionArgs } from 'react-router-dom'

import { apiQueryClient, type Storage } from '@oxide/api'
import { Storage24Icon } from '@oxide/design-system/icons/react'

import { requiredHostParams, useHostParams } from '~/hooks/use-params'
import { PAGE_SIZE, useQueryTable } from '~/table/QueryTable'
import { Button } from '~/ui/lib/Button.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'

import { AddStorageModal } from './AddStorageModal.tsx'

const EmptyState = () => {
  return (
    <EmptyMessage
      icon={<Storage24Icon />}
      title="No storage found"
      body="Storages attached the host will be shown here"
    />
  )
}

HostStorageTab.loader = async ({ params }: LoaderFunctionArgs) => {
  const { hostId } = requiredHostParams(params)
  await apiQueryClient.prefetchQuery('getStoragesOnHost', {
    path: { hostId },
    query: { limit: PAGE_SIZE },
  })
  return null
}

const colHelper = createColumnHelper<Storage>()
const staticCols = [
  colHelper.accessor('name', {
    header: 'name',
    cell: (info) => <>{info.getValue()}</>,
  }),
  // we don't show run state last update time like on project instances because
  // it's not in this response
  colHelper.accessor('mountPoint', {
    header: 'Path',
    cell: (info) => <>{info.getValue()}</>,
  }),
  colHelper.accessor('storageType', {
    header: 'Type',
    cell: (info) => <>{info.getValue()}</>,
  }),
]

export function HostStorageTab() {
  const [showAddStorage, setAddStorage] = useState(false)

  const { hostId } = useHostParams()
  const { Table } = useQueryTable(
    'getStoragesOnHost',
    { path: { hostId }, query: { limit: PAGE_SIZE } },
    { placeholderData: (x) => x }
  )

  return (
    <>
      <div className="mb-3 flex justify-end space-x-2">
        <Button size="sm" onClick={() => setAddStorage(true)}>
          Add a storage
        </Button>
      </div>
      <Table columns={staticCols} emptyState={<EmptyState />} rowHeight="large" />
      {showAddStorage && (
        <AddStorageModal
          onDismiss={() => {
            setAddStorage(false)
          }}
        />
      )}
    </>
  )
}
