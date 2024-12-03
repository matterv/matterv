/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { createColumnHelper } from '@tanstack/react-table'
import { filesize } from 'filesize'
import type { LoaderFunctionArgs } from 'react-router-dom'
import * as R from 'remeda'

import { apiQueryClient, type VirtualMachine } from '@oxide/api'
import { Instances24Icon } from '@oxide/design-system/icons/react'

import { InstanceStateBadge } from '~/components/StateBadge'
import { requiredHostParams, useHostParams } from '~/hooks/use-params'
import { LinkCell } from '~/table/cells/LinkCell.tsx'
import { PAGE_SIZE, useQueryTable } from '~/table/QueryTable'
import { CreateLink } from '~/ui/lib/CreateButton.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'
import { pb } from '~/util/path-builder.ts'

const EmptyState = () => {
  return (
    <EmptyMessage
      icon={<Instances24Icon />}
      title="No instances found"
      body="Instances running on the host will be shown here"
    />
  )
}

HostInstancesTab.loader = async ({ params }: LoaderFunctionArgs) => {
  const { hostId } = requiredHostParams(params)
  await apiQueryClient.prefetchQuery('getVmsOnHost', {
    path: { hostId },
    query: { limit: PAGE_SIZE },
  })
  return null
}

const colHelper = createColumnHelper<VirtualMachine>()
const staticCols = [
  colHelper.accessor((i) => R.pick(i, ['name', 'id']), {
    header: 'name',
    cell: (info) => {
      const value = info.getValue()
      return <LinkCell to={pb.instance(value.id)}>{value.name}</LinkCell>
    },
  }),
  // we don't show run state last update time like on project instances because
  // it's not in this response
  colHelper.accessor('status', {
    header: 'Status',
    cell: (info) => <InstanceStateBadge state={info.getValue()} />,
  }),
  colHelper.accessor('cpu', {
    header: 'cpu',
    cell: (info) => (
      <>
        {info.getValue()} <span className="ml-1 text-quaternary">vCPU</span>
      </>
    ),
  }),
  colHelper.accessor('memory', {
    header: 'memory',
    cell: (info) => {
      const memory = filesize(info.getValue(), { output: 'object', base: 2 })
      return (
        <>
          {memory.value} <span className="ml-1 text-quaternary">{memory.unit}</span>
        </>
      )
    },
  }),
]

export function HostInstancesTab() {
  const { hostId } = useHostParams()
  const { Table } = useQueryTable(
    'getVmsOnHost',
    { path: { hostId }, query: { limit: PAGE_SIZE } },
    { placeholderData: (x) => x }
  )

  return (
    <>
      <div className="mb-3 flex justify-end space-x-2">
        <CreateLink to={pb.hostVmNew(hostId)}>New VM</CreateLink>
      </div>
      <Table columns={staticCols} emptyState={<EmptyState />} rowHeight="large" />
    </>
  )
}
