/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { v4 as uuid } from 'uuid'

import type { Disk, File, Storage } from '@oxide/api'

import { GiB, KiB, TiB } from '~/util/units'

import type { Json } from './json-type'

export type DiskWithVmId = Disk & { vmId: string }

export const disks: Json<DiskWithVmId>[] = [
  {
    id: 1,
    uuid: uuid(),
    size: 2 * GiB,
    storage_id: '5AAE8155-CDA1-439D-8888-95E44462E9A9',
    vm_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
  },
  {
    id: 2,
    uuid: uuid(),
    size: 2 * GiB,
    storage_id: '5AAE8155-CDA1-439D-8888-95E44462E9A9',
    vm_id: '935499b3-fd96-432a-9c21-83a3dc1eece5',
  },
  {
    id: 3,
    uuid: '7f2309a5-13e3-47e0-8a4c-2a3b3bc992fd',
    size: 2 * GiB,
    storage_id: '5AAE8155-CDA1-439D-8888-95E44462E9A9',
    vm_id: '16737f54-1f76-4c96-8b7c-9d24971c1d62',
  },
]

export const storages: Json<Storage>[] = [
  {
    id: '5AAE8155-CDA1-439D-8888-95E44462E9A9',
    name: 'storage1',
    mount_point: '/opt',
    storage_type: 'LOCAL',
    host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
    free_in_bytes: 500 * GiB,
    capacity_in_bytes: TiB,
    status: 'READY',
  },
  {
    id: '6AAE8155-CDA1-439D-8888-95E44462E9A9',
    name: 'storage4',
    mount_point: '/opt4',
    storage_type: 'LOCAL',
    host_id: '935499b3-fd96-432a-9c21-83a3dc1eece4',
    free_in_bytes: 500 * GiB,
    capacity_in_bytes: TiB,
    status: 'READY',
  },
  {
    id: '5AAE8155-CDA1-439D-8888-95E44462E9A8',
    name: 'storage1',
    mount_point: '/opt',
    storage_type: 'LOCAL',
    host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
    free_in_bytes: 500 * GiB,
    capacity_in_bytes: TiB,
    status: 'READY',
  },
  {
    id: '5AAE8155-CDA1-439D-8888-95E44462E910',
    name: 'storage2',
    mount_point: '/opt2',
    storage_type: 'LOCAL',
    host_id: '935499b3-fd96-432a-9c21-83a3dc1eece6',
    free_in_bytes: 500 * GiB,
    capacity_in_bytes: TiB,
    status: 'READY',
  },
]

const emptyRoot = new Map<string, Json<File>[]>([['/', []]])

const filesMap = new Map<string, Json<File>[]>([
  [
    '/',
    [
      {
        name: 'file1',
        encoded_name: 'file1',
        type: 'file',
        size: GiB,
        modified_at: Date.now().toString(),
      },
      {
        name: 'dir2',
        encoded_name: 'dir2',
        type: 'directory',
        size: KiB,
        modified_at: Date.now().toString(),
      },
    ],
  ],
  [
    '/dir2',
    [
      {
        name: 'linux.iso',
        encoded_name: 'file1',
        type: 'file',
        size: GiB,
        modified_at: Date.now().toString(),
      },
      {
        name: 'linux.iso',
        encoded_name: 'linux.iso',
        type: 'file',
        size: GiB,
        modified_at: Date.now().toString(),
      },
    ],
  ],
])

const storageFilesMap = new Map<string, Map<string, Json<File>[]>>([
  ['5AAE8155-CDA1-439D-8888-95E44462E9A9', filesMap],
  ['6AAE8155-CDA1-439D-8888-95E44462E9A9', filesMap],
  ['5AAE8155-CDA1-439D-8888-95E44462E9A8', filesMap],
  ['5AAE8155-CDA1-439D-8888-95E44462E910', filesMap],
])

export function listFiles(storageId: string, parentPath: string) {
  const filesMap = storageFilesMap.get(storageId)
  if (!filesMap) {
    return []
  }

  const files = filesMap.get(parentPath)
  if (!files) {
    return []
  }
  return files
}

export function createFile(
  storageId: string,
  parentPath: string,
  name: string,
  type: 'file' | 'directory'
) {
  const filesMap = storageFilesMap.get(storageId)
  if (!filesMap) {
    return
  }
  const filesInDir = filesMap.get(parentPath)
  if (!filesInDir) {
    return
  }
  filesInDir.push({
    name: name,
    encoded_name: name,
    type: type,
    size: KiB,
    modified_at: Date.now().toString(),
  })
  filesMap.set(parentPath, filesInDir)
  if (type === 'directory') {
    filesMap.set('/' + name, [])
  }
}

export function addStorage(storageId: string) {
  storageFilesMap.set(storageId, emptyRoot)
}
