/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { v4 as uuid } from 'uuid'

import type { Host } from '@oxide/api'

import { GiB, TiB } from '~/util/units.ts'

import type { Json } from './json-type'

export const host: Json<Host> = {
  id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  name: 'host1',
  cpu: 10,
  memory: 256 * GiB,
  status: 'READY',
  storage: 100 * TiB,
  host_stats: {
    used_cpu: 5,
    used_memory: 100 * GiB,
    used_storages: 10 * TiB,
  },
  vm_storages: [
    {
      id: '5AAE8155-CDA1-439D-8888-95E44462E9A9',
      name: 'storage1',
      mount_point: '/opt',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
      status: 'READY'

    },
    {
      id: '6AAE8155-CDA1-439D-8888-95E44462E9A9',
      name: 'storage4',
      mount_point: '/opt4',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
      status: 'READY'

    },
  ],
  vm_network: {
    id: '1',
    name: 'network1',
    type: 'BRIDGE',
  },
  local_storages: [
    {
      id: uuid(),
      name: '/root',
      mount_point: '/root',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
      status: 'READY'

    },
    {
      id: uuid(),
      name: '/mnt',
      mount_point: '/mnt',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
      status: 'READY'

    },
  ],
}

export const host2: Json<Host> = {
  id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
  name: 'host2',
  cpu: 100,
  memory: 1000 * GiB,
  status: 'READY',
  vm_storages: [
    {
      id: '5AAE8155-CDA1-439D-8888-95E44462E9A8',
      name: 'storage1',
      mount_point: '/opt',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
      status: 'READY'

    },
    {
      id: '5AAE8155-CDA1-439D-8888-95E44462E910',
      name: 'storage2',
      mount_point: '/opt2',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
      status: 'READY'

    },
  ],
  storage: 500 * TiB,
  host_stats: {
    used_cpu: 20,
    used_memory: 256 * GiB,
    used_storages: 100 * TiB,
  },
  physical_networks: [
    {
      id: uuid(),
      name: 'virbr0',
      type: 'BRIDGE'
    },
  ],
  local_storages: [
    {
      id: uuid(),
      name: '/data',
      mount_point: '/data',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
      status: 'READY'
    },
    {
      id: uuid(),
      name: '/mnt/data',
      mount_point: '/mnt/data',
      storage_type: 'LOCAL',
      host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
      status: 'READY'
    },
  ],
}
export const hosts: Json<Host>[] = [host, host2]
