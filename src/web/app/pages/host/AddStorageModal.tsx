import React from 'react'
import { useForm } from 'react-hook-form'

import { useApiMutation, useApiQueryClient } from '~/api'
import type { StorageType } from '~/api/__generated__/Api.ts'
import { useHostParams } from '~/hooks/use-params.ts'
import { addToast } from '~/stores/toast.ts'
import { Modal } from '~/ui/lib/Modal.tsx'
import {NameField} from "~/components/form/fields/NameField.tsx";

type Values = { storageType: StorageType | null; path: string | null }
const defaultValues: Values = { storageType: 'LOCAL', path: null }
export const AddStorageModal = ({ onDismiss }: { onDismiss: () => void }) => {
  const { hostId } = useHostParams()
  const { control, handleSubmit } = useForm({ defaultValues })
  const queryClient = useApiQueryClient()

  const addStorage = useApiMutation('addStorage', {
    onSuccess(data) {
      addToast({ content: `${data.name} has been added` })
      queryClient.invalidateQueries('getStoragesOnHost')
    },
    onError: (err) => {
      addToast({ title: 'Error', content: err.message, variant: 'error' })
    },
    onSettled: onDismiss,
  })

  const onSubmit = ({ path, storageType }: Values) => {
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
