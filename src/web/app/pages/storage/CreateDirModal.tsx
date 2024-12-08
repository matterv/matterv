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

import { useApiMutation, useApiQueryClient, type CreateFileReq } from '~/api'
import { NameField } from '~/components/form/fields/NameField.tsx'
import { useStorageParams } from '~/hooks/use-params.ts'
import { addToast } from '~/stores/toast.ts'
import { Modal } from '~/ui/lib/Modal.tsx'

export const CreateDirModal = ({ onDismiss }: { onDismiss: () => void }) => {
  const queryClient = useApiQueryClient()
  const { storageId } = useStorageParams()

  const createDir = useApiMutation('createFile', {
    onSuccess() {
      queryClient.invalidateQueries('listFiles')
      addToast({ content: 'A directory has been added' })
    },
    onError: (err) => {
      addToast({ title: 'Error', content: err.message, variant: 'error' })
    },
  })

  const onSubmit = async (req: CreateFileReq) => {
    onDismiss()
    await createDir.mutateAsync({ body: req, path: { storageId } })
  }

  const defaultValues: CreateFileReq = {
    path: '/',
    name: '',
    type: 'directory',
  }
  const { control, handleSubmit } = useForm({ defaultValues })
  return (
    <Modal isOpen onDismiss={onDismiss} title="Create a directory">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation()
            }}
            className="space-y-4"
          >
            <NameField control={control} name="name" label="Directory Name" />
          </form>
        </Modal.Section>
      </Modal.Body>
      <Modal.Footer
        onDismiss={onDismiss}
        actionText="Ok"
        onAction={handleSubmit(onSubmit)}
      />
    </Modal>
  )
}
