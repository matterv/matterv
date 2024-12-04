/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { createRoutesFromElements, Navigate, Route } from "react-router-dom";

import { HostPage } from "~/pages/host/HostPage.tsx";
import { InventoryPage } from "~/pages/host/InventoryPage.tsx";
import { StorageFilesTab } from "~/pages/storage/StorageFilesTab.tsx";
import { StoragePage } from "~/pages/storage/StoragePage.tsx";
import { StoragesPage } from "~/pages/storage/StoragesPage.tsx";
import { CreateVm } from "~/pages/vm/CreateVm.tsx";
import { InstancePage } from "~/pages/vm/InstancePage.tsx";
import { StorageTab } from "~/pages/vm/StorageTab.tsx";
import { pb } from "~/util/path-builder.ts";

import { RouterDataErrorBoundary } from "./components/ErrorBoundary";
import { NotFound } from "./components/ErrorPage";
import { CreateInstanceForm } from "./forms/instance-create";
import { AdminLayout } from "./layouts/AdminLayout.tsx";
import { AuthenticatedLayout } from "./layouts/AuthenticatedLayout";
import { LoginLayout } from "./layouts/LoginLayout";
import { RootLayout } from "./layouts/RootLayout";
import { LoginPage } from "./pages/LoginPage";
import { InstancesPage } from "./pages/vm/InstancesPage.tsx";

export const routes = createRoutesFromElements(
  <Route element={<RootLayout />}>
    <Route path="*" element={<NotFound />} />
    <Route element={<LoginLayout />}>
      <Route path="login" element={<LoginPage />} />
    </Route>

    {/* This wraps all routes that are supposed to be authenticated */}
    <Route
      element={<AuthenticatedLayout />}
      loader={AuthenticatedLayout.loader}
      errorElement={<RouterDataErrorBoundary />}
      // very important. see `currentUserLoader` and `useCurrentUser`
      shouldRevalidate={() => true}
    >
      <Route index element={<Navigate to={pb.instances()} replace />} />
      <Route path="/" element={<AdminLayout />}>
        <Route
          path={pb.instancesNew()}
          element={<CreateVm />}
          loader={CreateVm.loader}
          handle={{ crumb: "New instance" }}
        />
        <Route path={pb.instances()} handle={{ crumb: "Instances" }}>
          <Route
            index
            element={<InstancesPage />}
            loader={InstancesPage.loader}
          />
          <Route path=":vmId">
            <Route index element={<Navigate to="storage" replace />} />
            <Route element={<InstancePage />} loader={InstancePage.loader}>
              <Route
                path="storage"
                element={<StorageTab />}
                loader={StorageTab.loader}
                handle={{ crumb: "Storage" }}
              />
            </Route>
          </Route>
        </Route>
        <Route path={pb.hosts()} handle={{ crumb: "Inventory" }}>
          <Route
            index
            element={<InventoryPage />}
            loader={InventoryPage.loader}
          />
          <Route path=":hostId">
            <Route index element={<HostPage />} loader={HostPage.loader} />
            <Route
              path="vm-new"
              element={<CreateVm />}
              loader={CreateVm.loader}
              handle={{ crumb: "New instance" }}
            />
          </Route>
        </Route>
        <Route path={pb.storages()} handle={{ crumb: "Storage" }}>
          <Route
            index
            element={<StoragesPage />}
            loader={StoragesPage.loader}
          />
          <Route path=":storageId">
            <Route index element={<Navigate to="files" replace />} />
            <Route element={<StoragePage />} loader={StoragePage.loader}>
              <Route
                path="files"
                element={<StorageFilesTab />}
                loader={StorageFilesTab.loader}
                handle={{ crumb: "Storage" }}
              />
            </Route>
            <Route
              path="vm-new"
              element={<CreateInstanceForm />}
              loader={CreateInstanceForm.loader}
              handle={{ crumb: "New instance" }}
            />
          </Route>
        </Route>
      </Route>
    </Route>
  </Route>,
);
