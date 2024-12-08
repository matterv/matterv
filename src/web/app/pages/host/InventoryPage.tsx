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
import { filesize } from 'filesize'
import { useMemo, useState } from 'react'
import { useNavigate } from 'react-router-dom'

import {
  apiQueryClient,
  useApiMutation,
  useApiQueryClient,
  type Host,
  type HostStatus,
} from '@oxide/api'
import { Instances24Icon, Servers24Icon } from '@oxide/design-system/icons/react'

import { HostStateBadge } from '~/components/StateBadge.tsx'
import { CreateHostModalForm } from '~/pages/host/AddHostModal.tsx'
import { addToast } from '~/stores/toast.ts'
import { LinkCell } from '~/table/cells/LinkCell.tsx'
import { PAGE_SIZE, useQueryTable } from '~/table/QueryTable'
import { Button } from '~/ui/lib/Button.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage.tsx'
import { PageHeader, PageTitle } from '~/ui/lib/PageHeader'
import { TableActions } from '~/ui/lib/Table.tsx'
import { pb } from '~/util/path-builder.ts'

const colHelper = createColumnHelper<Host>()

const EmptyState = () => (
  <EmptyMessage
    icon={<Instances24Icon />}
    title="No hosts"
  />
)

InventoryPage.loader = async () => {
  await apiQueryClient.prefetchQuery('getHosts', { query: { limit: PAGE_SIZE } })
  return null
}

const HostStateCell = ({ value }: { value: HostStatus }) => {
  return (
    <div className="flex items-center gap-1.5">
      <HostStateBadge state={value} />
    </div>
  )
}

export function InventoryPage() {
  const [showHostCreate, setHostCreate] = useState(false)
  const queryClient = useApiQueryClient()
  const navigate = useNavigate()
  const addHost = useApiMutation('addHost', {
    onSuccess(host) {
      queryClient.invalidateQueries('getHosts')
      addToast({ content: 'Host has been added' })
      navigate(pb.host(host.id))
    },
    onError: (err) => {
      addToast({ title: 'Error', content: err.message, variant: 'error' })
    },
  })

  const { Table } = useQueryTable(
    'getHosts',
    { query: { limit: PAGE_SIZE } },
    { placeholderData: (x) => x }
  )

  const columns = useMemo(
    () => [
      colHelper.accessor('name', {
        cell: (info) => {
          const id = info.row.original.id
          return <LinkCell to={pb.host(id)}>{info.getValue()}</LinkCell>
        },
      }),
      colHelper.accessor('cpu', {
        header: 'CPU',
        cell: (info) => (
          <>
            {info.getValue()} <span className="ml-1 text-quaternary">vCPU</span>
          </>
        ),
      }),
      colHelper.accessor('memory', {
        cell: (info) => {
          const memory = filesize(info.getValue(), { output: 'object', base: 2 })
          return (
            <>
              {memory.value} <span className="ml-1 text-quaternary">{memory.unit}</span>
            </>
          )
        },
      }),
      colHelper.accessor('status', {
        header: 'status',
        cell: (info) => <HostStateCell value={info.getValue()} />,
      }),
    ],
    []
  )

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Servers24Icon />}>Hosts</PageTitle>
      </PageHeader>

      <TableActions className="!-mt-6 !justify-between">
        <Button size="sm" onClick={() => setHostCreate(true)}>
          Add a host
        </Button>
      </TableActions>
      <Table columns={columns} emptyState={<EmptyState />} />
      {showHostCreate && (
        <CreateHostModalForm
          onSubmit={async (values) => {
            setHostCreate(false)
            await addHost.mutateAsync({
              body: { ...values },
            })
          }}
          onDismiss={() => setHostCreate(false)}
        />
      )}
    </>
  )
}
