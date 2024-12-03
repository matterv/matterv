/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import {createColumnHelper, getCoreRowModel,  useReactTable} from '@tanstack/react-table'
import {useMemo, useState} from 'react'
import type { LoaderFunctionArgs } from 'react-router-dom'

import {apiQueryClient,  Network, usePrefetchedApiQuery} from '@oxide/api'
import { Networking24Icon } from '@oxide/design-system/icons/react'

import { requiredHostParams, useHostParams } from '~/hooks/use-params'
import { Button } from '~/ui/lib/Button.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'

import {Table} from "~/table/Table.tsx";
import {AddNetworkModal} from "~/pages/host/AddNetworkModal.tsx";

const EmptyState = () => {
  return (
    <EmptyMessage
      icon={<Networking24Icon />}
      title="No network found"
      body="Networks attached the host will be shown here"
    />
  )
}

HostNetworkTab.loader = async ({ params }: LoaderFunctionArgs) => {
  const { hostId } = requiredHostParams(params)
  await apiQueryClient.prefetchQuery('getHost', {
    path: { hostId },
  })
  return null
}

const colHelper = createColumnHelper<Network>()
const staticCols = [
  colHelper.accessor('name', {
    header: 'name',
    cell: (info) => <>{info.getValue()}</>,
  }),
  // we don't show run state last update time like on project instances because
  // it's not in this response
  colHelper.accessor('type', {
    header: 'type',
    cell: (info) => <>{info.getValue()}</>,
  }),
]

export function HostNetworkTab() {
  const [showAddNetwork, setAddNetwork] = useState(false)

  const { hostId } = useHostParams()
  const { data: host } = usePrefetchedApiQuery('getHost', { path: { hostId } })


  const rows = useMemo(() => (host.vmNetwork ? [host.vmNetwork] : []).map((network) => ({ ...network })), [host])

  const table = useReactTable({
    columns: staticCols,
    data: rows,
    getCoreRowModel: getCoreRowModel(),
  })

  return (
    <>
      {
          !host.vmNetwork && (<div className="mb-3 flex justify-end space-x-2">
            <Button size="sm" onClick={() => setAddNetwork(true)}>
              Add a network
            </Button>
          </div>)
      }

      {!host.vmNetwork ? <EmptyState/> : <Table table={table} rowHeight="large"/>}
      {showAddNetwork && (
          <AddNetworkModal
              onDismiss={() => {
            setAddNetwork(false)
          }}
        />
      )}
    </>
  )
}
