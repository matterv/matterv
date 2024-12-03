/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import type { VirtualMachine } from '@oxide/api'

import { GiB } from '~/util/units'

import type { Json } from './json-type'

export const instance: Json<VirtualMachine> = {
  id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  name: 'db1',
  cpu: 2,
  memory: 10 * GiB,
  status: 'RUNNING',
  uuid: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  vm_config: '',
  ip_addresses: [{ ip: '192.168.1.2', type: 'IPV4' }],
  host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
}

const failedInstance: Json<VirtualMachine> = {
  id: '935499b3-fd96-432a-9c21-83a3dc1eece5',
  name: 'db2',
  cpu: 2,
  memory: 20 * GiB,
  status: 'STOPPED',
  uuid: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  vm_config: '',
  host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
}

const startingInstance: Json<VirtualMachine> = {
  id: '16737f54-1f76-4c96-8b7c-9d24971c1d62',
  name: 'db3',
  cpu: 2,
  memory: 4 * GiB,
  status: 'RUNNING',
  uuid: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',

  vm_config: '',
}

export const instances: Json<VirtualMachine>[] = [
  instance,
  failedInstance,
  startingInstance,
]
