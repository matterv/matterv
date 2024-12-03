/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
// note that isUuid checks for any kind of UUID. strictly speaking, we should
// only be checking for v4
import { validate as isUuid } from 'uuid'

import type { ApiTypes as Api, PathParams as PP } from '@oxide/api'
import * as mock from '@oxide/api-mocks'

import { json } from '~/api/__generated__/msw-handlers'
import { commaSeries } from '~/util/str'

import type { Json } from '../json-type'

export const notFoundErr = (msg: string) => {
  const message = `not found: ${msg}`
  return json({ error_code: 'ObjectNotFound', message } as const, { status: 404 })
}

export const LoginFailedErr = (msg: string) => {
  const message = `login failed: ${msg}`
  return json({ error_code: 'Login failed', message } as const, { status: 500 })
}

export const InvalidLoginErr = (msg: string) => {
  const message = `invalid login: ${msg}`
  return json({ error_code: 'Invalid Login', message } as const, { status: 401 })
}

export const lookupById = <T extends { id: string }>(table: T[], id: string) => {
  const item = table.find((i) => i.id === id)
  if (!item) throw notFoundErr(`by id ${id}`)
  return item
}

/**
 * Given an object representing (potentially) parent selectors for a resource,
 * throw an error if any of the keys in that object have truthy values. For
 * example, if selecting an instance by ID, we would pass in an object with
 * `project` as the key and error out if and only if `parentSelector.project`
 * is present.
 */
function ensureNoParentSelectors(
  /** Resource name to be used in error message */
  resourceLabel: string,
  parentSelector: Record<string, string | undefined>
) {
  const keysWithValues = Object.entries(parentSelector)
    .filter(([_, v]) => v)
    .map(([k]) => k)
  if (keysWithValues.length > 0) {
    const message = `when ${resourceLabel} is specified by ID, ${commaSeries(keysWithValues, 'and')} should not be specified`
    throw json({ error_code: 'InvalidRequest', message }, { status: 400 })
  }
}

export const lookup = {
  instance({ instance: id, ...projectSelector }: PP.Instance): Json<Api.VirtualMachine> {
    if (!id) throw notFoundErr('no instance specified')

    if (isUuid(id)) {
      ensureNoParentSelectors('instance', projectSelector)
      return lookupById(db.instances, id)
    }

    const instance = db.instances.find((i) => i.name === id)
    if (!instance) throw notFoundErr(`instance '${id}'`)

    return instance
  },
}

const initDb = {
  instances: [...mock.instances],
  hosts: [...mock.hosts],
  disks: [...mock.disks],
  storages: [...mock.storages],
  loginState: false,
}

export let db = structuredClone(initDb)

export function resetDb() {
  db = structuredClone(initDb)
}
