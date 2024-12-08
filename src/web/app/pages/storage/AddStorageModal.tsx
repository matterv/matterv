/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import React from 'react'
import { useForm } from 'react-hook-form'

import { useApiMutation, useApiQueryClient, usePrefetchedApiQuery } from '~/api'
import type { StorageType } from '~/api/__generated__/Api.ts'
import { ListboxField } from '~/components/form/fields/ListboxField.tsx'
import { NameField } from '~/components/form/fields/NameField.tsx'
import { addToast } from '~/stores/toast.ts'
import { PAGE_SIZE } from '~/table/QueryTable.tsx'
import { Modal } from '~/ui/lib/Modal.tsx'

type Values = { storageType: StorageType | null; path: string | null; hostId: string }
export const AddStorageModal = ({ onDismiss }: { onDismiss: () => void }) => {
  const { data: hosts } = usePrefetchedApiQuery('getHosts', { query: { limit: PAGE_SIZE } })
  const hostItems = hosts.items.map((host) => ({ label: host.name, value: host.id }))

  const defaultValues: Values = {
    storageType: 'LOCAL',
    path: null,
    hostId: hosts.items[0].id,
  }

  const { control, handleSubmit, resetField } = useForm({ defaultValues })

  const queryClient = useApiQueryClient()

  const addStorage = useApiMutation('addStorage', {
    onSuccess(data) {
      addToast({ content: `${data.name} has been added` })
      queryClient.invalidateQueries('getStorages')
    },
    onError: (err) => {
      addToast({ title: 'Error', content: err.message, variant: 'error' })
    },
    onSettled: onDismiss,
  })

  const onSubmit = ({ path, storageType, hostId }: Values) => {
    if (!path || !storageType) return
    addStorage.mutate({
      path: { hostId },
      body: { type: storageType, path: path, name: path },
    })
  }

  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a storage">
      <Modal.Body>
        <Modal.Section>
          <form autoComplete="off" onSubmit={handleSubmit(onSubmit)} className="space-y-4">
            <ListboxField
              placeholder="Select a host"
              name="hostId"
              label="Host"
              items={hostItems}
              onChange={() => {
                resetField('path', { defaultValue: '' })
              }}
              required
              control={control}
            />

            <NameField
              control={control}
              required
              name="path"
              placeholder="Specify a directory on this host"
              validate={(p) => {
                if (!p?.startsWith('/')) {
                  return 'Must provide an absolute path'
                }
                return true
              }}
            />
          </form>
        </Modal.Section>
      </Modal.Body>
      <Modal.Footer
        onDismiss={onDismiss}
        onAction={handleSubmit(onSubmit)}
        actionText="Add"
      />
    </Modal>
  )
}
