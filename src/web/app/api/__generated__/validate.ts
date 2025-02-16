/* eslint-disable */

/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */

import { z, ZodType } from "zod";
import { processResponseBody, uniqueItems } from "./util";

/**
 * Zod only supports string enums at the moment. A previous issue was opened
 * and closed as stale but it provided a hint on how to implement it.
 *
 * @see https://github.com/colinhacks/zod/issues/1118
 * TODO: PR an update for zod to support other native enum types
 */
const IntEnum = <T extends readonly number[]>(values: T) =>
  z.number().refine((v) => values.includes(v)) as ZodType<T[number]>;

/** Helper to ensure booleans provided as strings end up with the correct value */
const SafeBoolean = z.preprocess(
  (v) => (v === "false" ? false : v),
  z.coerce.boolean(),
);

export const User = z.preprocess(
  processResponseBody,
  z.object({ name: z.string() }),
);

export const UploadFileReq = z.preprocess(
  processResponseBody,
  z.object({ data: z.string(), offset: z.number(), filePath: z.string() }),
);

export const CreateFileReq = z.preprocess(
  processResponseBody,
  z.object({
    path: z.string(),
    name: z.string(),
    type: z.enum(["file", "directory"]),
  }),
);

export const Disk = z.preprocess(
  processResponseBody,
  z.object({
    id: z.number(),
    uuid: z.string(),
    size: z.number(),
    storageId: z.string(),
  }),
);

export const Disks = z.preprocess(
  processResponseBody,
  z.object({ items: Disk.array() }),
);

export const DiskController = z.preprocess(
  processResponseBody,
  z.object({
    id: z.number(),
    type: z.enum(["IDE", "SCSI"]),
    model: z.enum(["LSI", "PVSCSI"]),
  }),
);

export const DiskRequest = z.preprocess(
  processResponseBody,
  z.object({
    id: z.number(),
    size: z.number(),
    storageId: z.string(),
    storageName: z.string(),
    controllerId: z.number(),
  }),
);

export const NetworkRequest = z.preprocess(
  processResponseBody,
  z.object({ id: z.number(), networkId: z.string(), connected: SafeBoolean }),
);

export const OsType = z.preprocess(
  processResponseBody,
  z.enum(["Windows", "Linux"]),
);

export const OsInfo = z.preprocess(
  processResponseBody,
  z.object({ osType: OsType }),
);

export const CreateVirtualMachineOnHostRequest = z.preprocess(
  processResponseBody,
  z.object({
    name: z.string(),
    cpu: z.number(),
    memory: z.number(),
    diskControllers: DiskController.array(),
    disks: DiskRequest.array(),
    networks: NetworkRequest.array(),
    hostId: z.string(),
    osInfo: OsInfo,
    cdrom: z
      .object({
        storageId: z.string(),
        isoPath: z.string(),
        connected: SafeBoolean,
      })
      .optional(),
  }),
);

export const AddHostRequest = z.preprocess(
  processResponseBody,
  z.object({
    description: z.string().optional(),
    hostName: z.string(),
    port: z.number(),
  }),
);

export const AddNetworkRequest = z.preprocess(
  processResponseBody,
  z.object({ networkId: z.string() }),
);

export const StorageType = z.preprocess(
  processResponseBody,
  z.enum(["NFS", "LOCAL"]),
);

export const AddStorageRequest = z.preprocess(
  processResponseBody,
  z.object({
    type: StorageType,
    name: z.string(),
    path: z.string().optional(),
    server: z.string().optional(),
    port: z.number().optional(),
  }),
);

export const VMStatus = z.preprocess(
  processResponseBody,
  z.enum([
    "CREATING",
    "STARTING",
    "RUNNING",
    "STOPPING",
    "STOPPED",
    "REBOOTING",
    "FAILED",
    "DESTROYED",
  ]),
);

export const IpAddressType = z.preprocess(
  processResponseBody,
  z.enum(["IPV4", "IPV6"]),
);

export const IpAddress = z.preprocess(
  processResponseBody,
  z.object({ ip: z.string(), type: IpAddressType }),
);

export const Vnc = z.preprocess(
  processResponseBody,
  z.object({
    port: z.number().optional(),
    host: z.string().optional(),
    vmId: z.string(),
  }),
);

export const VirtualMachine = z.preprocess(
  processResponseBody,
  z.object({
    name: z.string(),
    status: VMStatus,
    id: z.string(),
    uuid: z.string().uuid(),
    cpu: z.number(),
    memory: z.number(),
    ipAddresses: IpAddress.array().optional(),
    vnc: Vnc.optional(),
    hostId: z.string(),
    vmConfig: z.string(),
  }),
);

export const CreateVirtualMachineResponse = z.preprocess(
  processResponseBody,
  z.object({ vm: VirtualMachine, jobId: z.string() }),
);

export const File = z.preprocess(
  processResponseBody,
  z.object({
    name: z.string(),
    encodedName: z.string().optional(),
    type: z.enum(["file", "directory"]),
    size: z.number(),
    modifiedAt: z.coerce.date(),
  }),
);

export const StorageStatus = z.preprocess(
  processResponseBody,
  z.enum(["Initial", "READY"]),
);

export const Storage = z.preprocess(
  processResponseBody,
  z.object({
    id: z.string(),
    name: z.string(),
    mountPoint: z.string(),
    storageType: StorageType,
    status: StorageStatus,
    capacityInBytes: z.number().optional(),
    freeInBytes: z.number().optional(),
    hostId: z.string(),
  }),
);

export const NetworkType = z.preprocess(
  processResponseBody,
  z.enum(["PHYSICAL", "BRIDGE"]),
);

export const Network = z.preprocess(
  processResponseBody,
  z.object({ id: z.string(), name: z.string(), type: NetworkType }),
);

export const HostStatus = z.preprocess(
  processResponseBody,
  z.enum(["READY", "UNINITIALIZED", "MAINTENANCE"]),
);

export const HostStats = z.preprocess(
  processResponseBody,
  z.object({
    usedCpu: z.number(),
    usedMemory: z.number(),
    usedStorages: z.number(),
  }),
);

export const Host = z.preprocess(
  processResponseBody,
  z.object({
    name: z.string(),
    cpu: z.number(),
    memory: z.number(),
    storage: z.number(),
    vmStorages: Storage.array().optional(),
    vmNetwork: Network.optional(),
    localStorages: Storage.array().optional(),
    physicalNetworks: Network.array().optional(),
    status: HostStatus,
    hostStats: HostStats,
    id: z.string(),
  }),
);

export const ListFilesResponse = z.preprocess(
  processResponseBody,
  z.object({ items: File.array(), nextPage: z.string().optional() }),
);

export const LoginRequest = z.preprocess(
  processResponseBody,
  z.object({ username: z.string(), password: z.string() }),
);

export const LoginResponse = z.preprocess(
  processResponseBody,
  z.object({
    sessionId: z.string().optional(),
    errorMessage: z.string().optional(),
  }),
);

export const PaginatedHostResponse = z.preprocess(
  processResponseBody,
  z.object({ items: Host.array(), nextPage: z.string().optional() }),
);

export const PaginatedStorageResponse = z.preprocess(
  processResponseBody,
  z.object({ items: Storage.array(), nextPage: z.string().optional() }),
);

export const PaginatedVMResponse = z.preprocess(
  processResponseBody,
  z.object({ items: VirtualMachine.array(), nextPage: z.string().optional() }),
);

export const RefreshHostResponse = z.preprocess(
  processResponseBody,
  z.object({ jobId: z.string() }),
);

export const GetUserParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({}),
  }),
);

export const LoginParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({}),
  }),
);

export const LogoutParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({}),
  }),
);

export const GetHostsParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({
      limit: z.number().optional(),
      page: z.number().optional(),
    }),
  }),
);

export const AddHostParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({}),
  }),
);

export const GetHostParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const GetVmsOnHostParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({
      limit: z.number().optional(),
      page: z.number().optional(),
    }),
  }),
);

export const AddNetworkParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const GetStoragesOnHostParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({
      limit: z.number().optional(),
      page: z.number().optional(),
    }),
  }),
);

export const AddStorageParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const RefreshHostParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      hostId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const GetVmsParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({
      limit: z.number().optional(),
      page: z.number().optional(),
    }),
  }),
);

export const CreateVmParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({}),
  }),
);

export const GetVmParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      vmId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const GetVmDisksParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      vmId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const PowerOffVmParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      vmId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const PowerOnVmParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      vmId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const ResetVmParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      vmId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const GetStoragesParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({}),
    query: z.object({
      limit: z.number().optional(),
      page: z.number().optional(),
    }),
  }),
);

export const GetStorageParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      storageId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const UploadFileParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      storageId: z.string(),
    }),
    query: z.object({}),
  }),
);

export const ListFilesParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      storageId: z.string(),
    }),
    query: z.object({
      path: z.string().default("/").optional(),
      limit: z.number().optional(),
      page: z.string().optional(),
    }),
  }),
);

export const CreateFileParams = z.preprocess(
  processResponseBody,
  z.object({
    path: z.object({
      storageId: z.string(),
    }),
    query: z.object({}),
  }),
);
