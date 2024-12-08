/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { filesize } from "filesize";
import { useMemo } from "react";
import { type LoaderFunctionArgs } from "react-router-dom";

import { apiQueryClient, Host, usePrefetchedApiQuery } from "@oxide/api";
import { Instances24Icon } from "@oxide/design-system/icons/react";

import { instanceTransitioning } from "~/api/util";
import { MoreActionsMenu } from "~/components/MoreActionsMenu";
import { RefreshButton } from "~/components/RefreshButton";
import { RouteTabs, Tab } from "~/components/RouteTabs.tsx";
import { InstanceStateBadge } from "~/components/StateBadge";
import { getInstanceSelector, useInstanceSelector } from "~/hooks/use-params";
import { PageHeader, PageTitle } from "~/ui/lib/PageHeader";
import { PropertiesTable } from "~/ui/lib/PropertiesTable";
import { Spinner } from "~/ui/lib/Spinner";
import { Tooltip } from "~/ui/lib/Tooltip";
import { ALL_ISH } from "~/util/consts.ts";
import { pb } from "~/util/path-builder";

import { useMakeInstanceActions } from "./actions";

// this is meant to cover everything that we fetch in the page
async function refreshData() {
  await Promise.all([apiQueryClient.invalidateQueries("getVm")]);
}

InstancePage.loader = async ({ params }: LoaderFunctionArgs) => {
  const { vmId } = getInstanceSelector(params);
  await Promise.all([
    apiQueryClient.prefetchQuery("getVm", {
      path: { vmId },
    }),
    apiQueryClient.prefetchQuery("getHosts", { query: { limit: ALL_ISH } }),
  ]);
  return null;
};

const POLL_INTERVAL = 1000;

export function InstancePage() {
  const instanceSelector = useInstanceSelector();

  const { data: hosts } = usePrefetchedApiQuery("getHosts", {
    query: { limit: ALL_ISH },
  });

  const { data: instance } = usePrefetchedApiQuery(
    "getVm",
    {
      path: { vmId: instanceSelector.vmId },
    },
    {
      refetchInterval: ({ state: { data: instance } }) =>
        instance && instanceTransitioning(instance) ? POLL_INTERVAL : false,
    },
  );

  const polling = instanceTransitioning(instance);

  const vmHost = useMemo(
    () => hosts.items.find((h) => h.id === instance.hostId),
    [hosts, instance],
  );

  const makeActions = useMakeInstanceActions({
    onSuccess: refreshData,
    host: vmHost as Host,
  });
  const actions = useMemo(
    () => [...makeActions(instance)],
    [instance, makeActions],
  );

  const memory = filesize(instance.memory, { output: "object", base: 2 });

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Instances24Icon />}>{instance.name}</PageTitle>
        <div className="inline-flex gap-2">
          <RefreshButton onClick={refreshData} />
          <MoreActionsMenu label="Instance actions" actions={actions} />
        </div>
      </PageHeader>
      <PropertiesTable.Group className="-mt-8 mb-16">
        <PropertiesTable>
          <PropertiesTable.Row label="cpu">
            <span className="text-secondary">{instance.cpu}</span>
            <span className="ml-1 text-quaternary"> vCPUs</span>
          </PropertiesTable.Row>
          <PropertiesTable.Row label="memory">
            <span className="text-secondary">{memory.value}</span>
            <span className="ml-1 text-quaternary"> {memory.unit}</span>
          </PropertiesTable.Row>
          <PropertiesTable.Row label="status">
            <div className="flex">
              <InstanceStateBadge state={instance.status} />
              {polling && (
                <Tooltip
                  content="Auto-refreshing while state changes"
                  delay={150}
                >
                  <button type="button">
                    <Spinner className="ml-2" />
                  </button>
                </Tooltip>
              )}
            </div>
          </PropertiesTable.Row>
          <PropertiesTable.Row label="id">
            <span className="overflow-hidden text-ellipsis whitespace-nowrap text-secondary">
              {instance.id}
            </span>
          </PropertiesTable.Row>
          <PropertiesTable.Row label="ip">
            <span className="overflow-hidden text-ellipsis whitespace-nowrap text-secondary">
              {instance.ipAddresses?.map((ip) => ip.ip).join(", ")}
            </span>
          </PropertiesTable.Row>
          <PropertiesTable.Row label="host">
            <span className="overflow-hidden text-ellipsis whitespace-nowrap text-secondary">
              {hosts.items.find((host) => host.id === instance.hostId)?.name}
            </span>
          </PropertiesTable.Row>
        </PropertiesTable>
      </PropertiesTable.Group>
      <RouteTabs fullWidth>
        <Tab to={pb.instanceStorage(instanceSelector.vmId)}>Storage</Tab>
      </RouteTabs>
    </>
  );
}
