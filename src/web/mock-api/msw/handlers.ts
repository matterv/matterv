/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */

import { v4 as uuid } from "uuid";

import {
  addStorage,
  createFile,
  listFiles,
  type DiskWithVmId,
} from "@oxide/api-mocks";

import {
  type Disk,
  type Host,
  type Storage,
  User,
  type VirtualMachine,
} from "~/api";
import {
  json,
  makeHandlers,
  type Json,
} from "~/api/__generated__/msw-handlers";
import { GiB, TiB } from "~/util/units.ts";

import { db, InvalidLoginErr, notFoundErr } from "./db";
import { NotImplemented, paginated } from "./util.ts";

// Note the *JSON types. Those represent actual API request and response bodies,
// the snake-cased objects coming straight from the API before the generated
// client camel-cases the keys and parses date fields. Inside the mock API everything
// is *JSON type.

export const handlers = makeHandlers({
  getUser() {
    const user: Json<User> = {
      name: "Admin",
    };
    return user;
  },
  addNetwork({ path, body }) {
    const hostId = path.hostId;
    const networkId = body.network_id;
    const host = db.hosts.find((h) => h.id === hostId);
    if (!host) {
      throw notFoundErr(`host '${hostId}'`);
    }
    const network = host.physical_networks?.find((n) => n.id === networkId);
    if (!network) {
      throw notFoundErr(`network '${networkId}'`);
    }

    host.vm_network = network;
    return network;
  },
  addStorage({ path, body }) {
    const storage: Json<Storage> = {
      id: uuid(),
      name: body.name,
      mount_point: body.path as string,
      storage_type: body.type,
      host_id: path.hostId,
      capacity_in_bytes: TiB,
      free_in_bytes: 900 * GiB,
      status: "READY",
    };
    db.storages.push(storage);
    addStorage(storage.id);
    const h = db.hosts.find((host) => host.id === path.hostId);
    h?.vm_storages?.push(storage);
    return storage;
  },
  getStoragesOnHost({ path, query }) {
    const storages = db.storages.filter(
      (storage) => storage.host_id === path.hostId,
    );
    return paginated(query, storages);
  },
  getVmsOnHost({ path, query }) {
    const vms = db.instances.filter((i) => i.host_id === path.hostId);
    return paginated(query, vms);
  },
  getHost({ path }) {
    const h = db.hosts.find((host) => host.id === path.hostId);
    if (!h) throw notFoundErr(`host '${path.hostId}'`);
    return h;
  },
  getStorages({ query }) {
    const storages = db.storages;
    return paginated(query, storages);
  },
  getStorage({ path }) {
    const storage = db.storages.find((s) => s.id === path.storageId);
    if (!storage) throw notFoundErr(`host '${path.storageId}'`);
    return storage;
  },
  addHost({ body }) {
    const host: Json<Host> = {
      id: uuid(),
      cpu: 16,
      name: body.host_name,
      memory: 256 * GiB,
      storage: 100 * TiB,
      vm_storages: [],
      status: "READY",
      host_stats: {
        used_cpu: 0,
        used_memory: 0,
        used_storages: 0,
      },
    };

    const storages: Json<Storage>[] = [
      {
        id: uuid(),
        name: "/opt",
        mount_point: "/opt",
        storage_type: "LOCAL",
        host_id: host.id,
        capacity_in_bytes: TiB,
        free_in_bytes: 500 * GiB,
        status: "READY",
      },
      {
        id: uuid(),
        name: "/data",
        mount_point: "/data",
        storage_type: "LOCAL",
        host_id: host.id,
        capacity_in_bytes: TiB,
        free_in_bytes: 500 * GiB,
        status: "READY",
      },
    ];
    host.local_storages = storages;
    db.hosts.push(host);
    return host;
  },
  createFile({ path, body }) {
    createFile(path.storageId, body.path, body.name, body.type);
    return 204;
  },
  createVm({ body }) {
    const id = uuid();
    const vm: Json<VirtualMachine> = {
      id: id,
      name: body.name,
      status: "CREATING",
      uuid: id,
      cpu: body.cpu,
      memory: body.memory,
      host_id: body.host_id,
      vm_config: "",
    };
    db.instances.push(vm);

    body.disks.forEach((d) => {
      const disk: Json<DiskWithVmId> = {
        id: d.id,
        uuid: uuid(),
        size: d.size,
        storage_id: d.storage_id,
        vm_id: vm.id,
      };
      db.disks.push(disk);
    });

    setTimeout(() => {
      vm.status = "RUNNING";
      vm.ip_addresses = [{ ip: "192.168.1.200", type: "IPV4" }];
    }, 3000);

    return json({
      vm: vm,
      job_id: "",
    });
  },
  getVm({ path }) {
    const vm = db.instances.find((instance) => instance.id === path.vmId);
    if (!vm) throw notFoundErr(`vm '${path.vmId}'`);
    return vm;
  },
  listFiles({ path, query }) {
    const files = listFiles(path.storageId, query.path ? query.path : "/");
    return paginated(query, files);
  },
  login({ body }) {
    if (body.username === "admin" && body.password === "password") {
      db.loginState = true;
      return;
    }
    throw InvalidLoginErr("failed");
  },
  logout() {
    db.loginState = false;
    return json({
      session_id: "",
    });
  },
  ping() {
    if (db.loginState) return 1;

    throw InvalidLoginErr("a");
  },
  powerOffVm({ path }) {
    const vm = db.instances.find((i) => i.id === path.vmId);
    if (!vm) throw notFoundErr(`vm '${path.vmId}'`);
    vm.status = "STOPPING";
    setTimeout(() => {
      vm.status = "STOPPED";
    }, 3000);
    return vm;
  },
  powerOnVm({ path }) {
    const vm = db.instances.find((i) => i.id === path.vmId);
    if (!vm) throw notFoundErr(`vm '${path.vmId}'`);
    vm.status = "STARTING";
    setTimeout(() => {
      vm.status = "RUNNING";
    }, 3000);
    return vm;
  },
  refreshHost: NotImplemented,
  resetVm({ path }) {
    const vm = db.instances.find((i) => i.id === path.vmId);
    if (!vm) throw notFoundErr(`vm '${path.vmId}'`);
    vm.status = "REBOOTING";
    setTimeout(() => {
      vm.status = "RUNNING";
    }, 3000);
    return vm;
  },
  uploadFile({ path, body }) {
    return 204;
  },
  getHosts({ query }) {
    const hosts = db.hosts;
    return paginated(query, hosts);
  },
  GetVms({ query }) {
    const instances = db.instances;
    return paginated(query, instances);
  },
  getVmDisks({ path }) {
    const disks = db.disks.filter((disk) => disk.vm_id === path.vmId);
    if (disks.length === 0) throw notFoundErr(`disk '${path.vmId}'`);
    const d = disks.map((d) => d as Json<Disk>);
    return { items: d };
  },
});
