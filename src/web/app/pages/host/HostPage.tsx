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

import {apiQueryClient, Host, useApiMutation, usePrefetchedApiQuery, type VirtualMachine} from '@oxide/api'
import {
  Cpu16Icon,
  Ram16Icon,
  Servers24Icon,
  Ssd16Icon,
} from '@oxide/design-system/icons/react'

import { CapacityBar } from '~/components/CapacityBar.tsx'
import { QueryParamTabs } from '~/components/QueryParamTabs.tsx'
import { requiredHostParams, useHostParams } from '~/hooks/use-params'
import { PageHeader, PageTitle } from '~/ui/lib/PageHeader'
import { Tabs } from '~/ui/lib/Tabs'
import { bytesToGiB, bytesToTiB } from '~/util/units.ts'

import { HostInstancesTab } from './HostInstancesTab.tsx'
import { HostStorageTab } from './HostStorageTab.tsx'
import {RefreshButton} from "~/components/RefreshButton.tsx";
import type {MakeActions} from "~/table/columns/action-col.tsx";
import {useCallback, useMemo} from "react";
import {addToast} from "~/stores/toast.ts";
import {MoreActionsMenu} from "~/components/MoreActionsMenu.tsx";
import {HostNetworkTab} from "~/pages/host/HostNetworkTab.tsx";

const useMakeHostActions = (
): MakeActions<Host> => {
  const { mutate: refreshHost } = useApiMutation('refreshHost')

  return useCallback(
      (host) => {
        const instanceParams = { path: { hostId: host.id } }
        return [
          {
            label: 'Refresh',
            onActivate() {
              refreshHost(instanceParams, {
                onSuccess: () => addToast({ title: `Refreshing host '${host.name}'` }),
                onError: (error) =>
                    addToast({
                      variant: 'error',
                      title: `Error refresh host '${host.name}'`,
                      content: error.message,
                    }),
              })
            },
          },

        ]
      },
      [refreshHost]
  )
}

HostPage.loader = async ({ params }: LoaderFunctionArgs) => {
  const { hostId } = requiredHostParams(params)
  await apiQueryClient.prefetchQuery('getHost', {
    path: { hostId },
  })
  return null
}
async function refreshData() {
  await Promise.all([apiQueryClient.invalidateQueries('getHost')])
}

export function HostPage() {
  const { hostId } = useHostParams()
  const { data: host } = usePrefetchedApiQuery('getHost', { path: { hostId } })
  const makeActions = useMakeHostActions()
  const actions = useMemo(() => [...makeActions(host)], [host, makeActions])

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Servers24Icon/>}>{host.name}</PageTitle>
        <div className="inline-flex gap-2">
          <RefreshButton onClick={refreshData}/>
          <MoreActionsMenu label="Host actions" actions={actions} />
        </div>
      </PageHeader>

      <div className="mb-12 flex min-w-min flex-col gap-3 lg+:flex-row">
        <CapacityBar
            icon={<Cpu16Icon/>}
            title="CPU"
            unit="vCPUs"
            provisioned={host.hostStats.usedCpu}
          capacity={host.cpu}
          includeUnit={false}
          capacityLabel="Quota (Total)"
        />
        <CapacityBar
          icon={<Ram16Icon />}
          title="MEMORY"
          unit="GiB"
          provisioned={bytesToGiB(host.hostStats.usedMemory)}
          capacity={bytesToGiB(host.memory)}
          capacityLabel="Quota (Total)"
        />
        <CapacityBar
          icon={<Ssd16Icon />}
          title="STORAGE"
          unit="TiB"
          provisioned={bytesToTiB(host.hostStats.usedStorages)}
          capacity={bytesToTiB(host.storage)}
          capacityLabel="Quota (Total)"
        />
      </div>

      <QueryParamTabs className="full-width" defaultValue="vms">
        <Tabs.List>
          <Tabs.Trigger value="vms">Vms</Tabs.Trigger>
          <Tabs.Trigger value="storages">Storages</Tabs.Trigger>
          <Tabs.Trigger value="networks">Networks</Tabs.Trigger>
        </Tabs.List>
        <Tabs.Content value="vms">
          <HostInstancesTab />
        </Tabs.Content>
        <Tabs.Content value="storages">
          <HostStorageTab />
        </Tabs.Content>
        <Tabs.Content value="networks">
          <HostNetworkTab />
        </Tabs.Content>
      </QueryParamTabs>
    </>
  )
}
