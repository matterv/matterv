/* eslint-disable */

/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */

import type { FetchParams } from "./http-client";
import { HttpClient, toQueryString } from "./http-client";

export type {
  ApiConfig,
  ApiResult,
  ErrorBody,
  ErrorResult,
} from "./http-client";

export type User = { name: string };

export type UploadFileReq = { data: string; offset: number; filePath: string };

export type CreateFileReq = {
  path: string;
  name: string;
  /** Type of the item */
  type: "file" | "directory";
};

export type Disk = {
  id: number;
  uuid: string;
  size: number;
  storageId: string;
};

export type Disks = { items: Disk[] };

export type DiskController = {
  id: number;
  type: "IDE" | "SCSI";
  model: "LSI" | "PVSCSI";
};

export type DiskRequest = {
  id: number;
  size: number;
  storageId: string;
  storageName: string;
  controllerId: number;
};

export type NetworkRequest = {
  id: number;
  networkId: string;
  connected: boolean;
};

export type OsType = "Windows" | "Linux";

export type OsInfo = { osType: OsType };

export type CreateVirtualMachineOnHostRequest = {
  name: string;
  cpu: number;
  memory: number;
  diskControllers: DiskController[];
  disks: DiskRequest[];
  networks: NetworkRequest[];
  hostId: string;
  osInfo: OsInfo;
  cdrom?: { storageId: string; isoPath: string; connected: boolean };
};

export type AddHostRequest = {
  description?: string;
  hostName: string;
  port: number;
};

export type AddNetworkRequest = { networkId: string };

export type StorageType = "NFS" | "LOCAL";

export type AddStorageRequest = {
  type: StorageType;
  name: string;
  path?: string;
  server?: string;
  port?: number;
};

export type VMStatus =
  | "CREATING"
  | "STARTING"
  | "RUNNING"
  | "STOPPING"
  | "STOPPED"
  | "REBOOTING"
  | "FAILED"
  | "DESTROYED";

export type IpAddressType = "IPV4" | "IPV6";

export type IpAddress = { ip: string; type: IpAddressType };

export type Vnc = { port?: number; host?: string; vmId: string };

export type VirtualMachine = {
  name: string;
  status: VMStatus;
  id: string;
  uuid: string;
  cpu: number;
  memory: number;
  ipAddresses?: IpAddress[];
  vnc?: Vnc;
  hostId: string;
  vmConfig: string;
};

export type CreateVirtualMachineResponse = {
  vm: VirtualMachine;
  jobId: string;
};

export type File = {
  /** Name of the file or directory (may contain spaces and special characters) */
  name: string;
  /** URL-encoded name for use in subsequent API calls */
  encodedName?: string;
  /** Type of the item */
  type: "file" | "directory";
  /** Size of the file in bytes (null for directories) */
  size: number;
  /** Last modification date and time */
  modifiedAt: Date;
};

export type StorageStatus = "Initial" | "READY";

export type Storage = {
  id: string;
  name: string;
  mountPoint: string;
  storageType: StorageType;
  status: StorageStatus;
  capacityInBytes?: number;
  freeInBytes?: number;
  hostId: string;
};

export type NetworkType = "PHYSICAL" | "BRIDGE";

export type Network = { id: string; name: string; type: NetworkType };

export type HostStatus = "READY" | "UNINITIALIZED" | "MAINTENANCE";

export type HostStats = {
  usedCpu: number;
  usedMemory: number;
  usedStorages: number;
};

export type Host = {
  name: string;
  cpu: number;
  memory: number;
  storage: number;
  vmStorages?: Storage[];
  vmNetwork?: Network;
  localStorages?: Storage[];
  physicalNetworks?: Network[];
  status: HostStatus;
  hostStats: HostStats;
  id: string;
};

export type ListFilesResponse = { items: File[]; nextPage?: string };

export type LoginRequest = {
  /** The user's username */
  username: string;
  /** The user's password */
  password: string;
};

export type LoginResponse = { sessionId?: string; errorMessage?: string };

export type PaginatedHostResponse = { items: Host[]; nextPage?: string };

export type PaginatedStorageResponse = { items: Storage[]; nextPage?: string };

export type PaginatedVMResponse = {
  items: VirtualMachine[];
  nextPage?: string;
};

export type RefreshHostResponse = { jobId: string };

export interface GetHostsQueryParams {
  limit?: number;
  page?: number;
}

export interface GetHostPathParams {
  hostId: string;
}

export interface GetVmsOnHostPathParams {
  hostId: string;
}

export interface GetVmsOnHostQueryParams {
  limit?: number;
  page?: number;
}

export interface AddNetworkPathParams {
  hostId: string;
}

export interface GetStoragesOnHostPathParams {
  hostId: string;
}

export interface GetStoragesOnHostQueryParams {
  limit?: number;
  page?: number;
}

export interface AddStoragePathParams {
  hostId: string;
}

export interface RefreshHostPathParams {
  hostId: string;
}

export interface GetVmsQueryParams {
  limit?: number;
  page?: number;
}

export interface GetVmPathParams {
  vmId: string;
}

export interface GetVmDisksPathParams {
  vmId: string;
}

export interface PowerOffVmPathParams {
  vmId: string;
}

export interface PowerOnVmPathParams {
  vmId: string;
}

export interface ResetVmPathParams {
  vmId: string;
}

export interface GetStoragesQueryParams {
  limit?: number;
  page?: number;
}

export interface GetStoragePathParams {
  storageId: string;
}

export interface UploadFilePathParams {
  storageId: string;
}

export interface ListFilesPathParams {
  storageId: string;
}

export interface ListFilesQueryParams {
  path?: string;
  limit?: number;
  page?: string;
}

export interface CreateFilePathParams {
  storageId: string;
}

type EmptyObj = Record<string, never>;
export class Api extends HttpClient {
  methods = {
    /**
     * Get user info
     */
    getUser: (_: EmptyObj, params: FetchParams = {}) => {
      return this.request<User>({
        path: `/api/v1/user`,
        method: "GET",
        ...params,
      });
    },
    /**
     * Login
     */
    login: ({ body }: { body: LoginRequest }, params: FetchParams = {}) => {
      return this.request<LoginResponse>({
        path: `/api/v1/login`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * Login
     */
    logout: (_: EmptyObj, params: FetchParams = {}) => {
      return this.request<void>({
        path: `/api/v1/logout`,
        method: "POST",
        ...params,
      });
    },
    /**
     * Get hosts.
     */
    getHosts: (
      { query = {} }: { query?: GetHostsQueryParams },
      params: FetchParams = {},
    ) => {
      return this.request<PaginatedHostResponse>({
        path: `/api/v1/host`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Add Host.
     */
    addHost: ({ body }: { body: AddHostRequest }, params: FetchParams = {}) => {
      return this.request<Host>({
        path: `/api/v1/host`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * Get host.
     */
    getHost: (
      { path }: { path: GetHostPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<Host>({
        path: `/api/v1/host/${path.hostId}`,
        method: "GET",
        ...params,
      });
    },
    /**
     * Get vms for a host.
     */
    getVmsOnHost: (
      {
        path,
        query = {},
      }: { path: GetVmsOnHostPathParams; query?: GetVmsOnHostQueryParams },
      params: FetchParams = {},
    ) => {
      return this.request<PaginatedVMResponse>({
        path: `/api/v1/host/${path.hostId}/vm`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Add a network to a host
     */
    addNetwork: (
      { path, body }: { path: AddNetworkPathParams; body: AddNetworkRequest },
      params: FetchParams = {},
    ) => {
      return this.request<Network>({
        path: `/api/v1/host/${path.hostId}/network`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * Get vms for a host.
     */
    getStoragesOnHost: (
      {
        path,
        query = {},
      }: {
        path: GetStoragesOnHostPathParams;
        query?: GetStoragesOnHostQueryParams;
      },
      params: FetchParams = {},
    ) => {
      return this.request<PaginatedStorageResponse>({
        path: `/api/v1/host/${path.hostId}/storage`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Add a storage to a host
     */
    addStorage: (
      { path, body }: { path: AddStoragePathParams; body: AddStorageRequest },
      params: FetchParams = {},
    ) => {
      return this.request<Storage>({
        path: `/api/v1/host/${path.hostId}/storage`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * Refresh host.
     */
    refreshHost: (
      { path }: { path: RefreshHostPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<RefreshHostResponse>({
        path: `/api/v1/host/${path.hostId}/refresh`,
        method: "POST",
        ...params,
      });
    },
    /**
     * Get a list of virtual machines.
     */
    GetVms: (
      { query = {} }: { query?: GetVmsQueryParams },
      params: FetchParams = {},
    ) => {
      return this.request<PaginatedVMResponse>({
        path: `/api/v1/vm`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Create a virtual machine.
     */
    createVm: (
      { body }: { body: CreateVirtualMachineOnHostRequest },
      params: FetchParams = {},
    ) => {
      return this.request<CreateVirtualMachineResponse>({
        path: `/api/v1/vm`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * Get vm by vm id
     */
    getVm: ({ path }: { path: GetVmPathParams }, params: FetchParams = {}) => {
      return this.request<VirtualMachine>({
        path: `/api/v1/vm/${path.vmId}`,
        method: "GET",
        ...params,
      });
    },
    /**
     * Get disks for a vm
     */
    getVmDisks: (
      { path }: { path: GetVmDisksPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<Disks>({
        path: `/api/v1/vm/${path.vmId}/disk`,
        method: "GET",
        ...params,
      });
    },
    /**
     * Power off a virtual machine.
     */
    powerOffVm: (
      { path }: { path: PowerOffVmPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<VirtualMachine>({
        path: `/api/v1/vm/${path.vmId}/poweroff`,
        method: "POST",
        ...params,
      });
    },
    /**
     * Power on a virtual machine.
     */
    powerOnVm: (
      { path }: { path: PowerOnVmPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<VirtualMachine>({
        path: `/api/v1/vm/${path.vmId}/poweron`,
        method: "POST",
        ...params,
      });
    },
    /**
     * Reset a virtual machine.
     */
    resetVm: (
      { path }: { path: ResetVmPathParams },
      params: FetchParams = {},
    ) => {
      return this.request<VirtualMachine>({
        path: `/api/v1/vm/${path.vmId}/reset`,
        method: "POST",
        ...params,
      });
    },
    /**
     * Get a list of storages.
     */
    getStorages: (
      { query = {} }: { query?: GetStoragesQueryParams },
      params: FetchParams = {},
    ) => {
      return this.request<PaginatedStorageResponse>({
        path: `/api/v1/storage`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Get storage.
     */
    getStorage: (
      { path }: { path: GetStoragePathParams },
      params: FetchParams = {},
    ) => {
      return this.request<Storage>({
        path: `/api/v1/storage/${path.storageId}`,
        method: "GET",
        ...params,
      });
    },
    /**
     * Upload a file
     */
    uploadFile: (
      { path, body }: { path: UploadFilePathParams; body: UploadFileReq },
      params: FetchParams = {},
    ) => {
      return this.request<void>({
        path: `/api/v1/storage/${path.storageId}/upload`,
        method: "POST",
        body,
        ...params,
      });
    },
    /**
     * List files and directories
     */
    listFiles: (
      {
        path,
        query = {},
      }: { path: ListFilesPathParams; query?: ListFilesQueryParams },
      params: FetchParams = {},
    ) => {
      return this.request<ListFilesResponse>({
        path: `/api/v1/storage/${path.storageId}/files`,
        method: "GET",
        query,
        ...params,
      });
    },
    /**
     * Create directory or file
     */
    createFile: (
      { path, body }: { path: CreateFilePathParams; body: CreateFileReq },
      params: FetchParams = {},
    ) => {
      return this.request<void>({
        path: `/api/v1/storage/${path.storageId}/files`,
        method: "POST",
        body,
        ...params,
      });
    },
  };
  ws = {};
}

export default Api;
