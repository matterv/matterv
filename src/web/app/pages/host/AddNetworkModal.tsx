/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import { useMemo } from 'react'
import { useForm } from 'react-hook-form'

import { useApiMutation, useApiQueryClient, usePrefetchedApiQuery } from '~/api'
import { ListboxField } from '~/components/form/fields/ListboxField'
import { useHostParams } from '~/hooks/use-params.ts'
import { addToast } from '~/stores/toast.ts'
import { Modal } from '~/ui/lib/Modal.tsx'

type Values = { networkId: string | null}
const defaultValues: Values = { networkId: null }
export const AddNetworkModal = ({ onDismiss }: { onDismiss: () => void }) => {
  const { hostId } = useHostParams()
  const { data: host } = usePrefetchedApiQuery('getHost', { path: { hostId } })
  const { control, handleSubmit } = useForm({ defaultValues })
  const queryClient = useApiQueryClient()

  const addStorage = useApiMutation('addNetwork', {
    onSuccess(data) {
      addToast({ content: `${data.name} has been added` })
      queryClient.invalidateQueries('getHost')
    },
    onError: (err) => {
      addToast({ title: 'Error', content: err.message, variant: 'error' })
    },
    onSettled: onDismiss,
  })

  const physicalNetworks = useMemo(
    () => (host.physicalNetworks || []).map((s) => ({ value: s.id, label: s.name })),
    [host.physicalNetworks]
  )

  const onSubmit = ({ networkId }: Values) => {
    if (!networkId) return
    addStorage.mutate({
      path: { hostId },
      body: { networkId: networkId },
    })
  }

  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a network">
      <Modal.Body>
        <Modal.Section>
          <form autoComplete="off" onSubmit={handleSubmit(onSubmit)} className="space-y-4">
            <ListboxField
              placeholder="Select a network"
              name="networkId"
              label="Network"
              items={physicalNetworks}
              required
              control={control}
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
