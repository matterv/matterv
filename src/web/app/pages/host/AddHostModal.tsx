/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import React from 'react'
import { useForm } from 'react-hook-form'

import { type AddHostRequest } from '@oxide/api'

import { NameField } from '~/components/form/fields/NameField.tsx'
import { NumberField } from '~/components/form/fields/NumberField.tsx'
import { TextField } from '~/components/form/fields/TextField.tsx'
import { Modal } from '~/ui/lib/Modal.tsx'

type CreateHostModalFormProps = {
  onSubmit: (hostRequest: AddHostRequest) => void
  onDismiss: () => void
  onSuccess?: (hostRequest: AddHostRequest) => void
}

export function CreateHostModalForm({ onSubmit, onDismiss }: CreateHostModalFormProps) {
  const defaultValues: AddHostRequest = {
    hostName: '',
    port: 8443,
  }
  const { control, handleSubmit } = useForm({ defaultValues })
  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a host">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation()
            }}
            className="space-y-4"
          >
            <TextField control={control} name="hostName" required />
            <NumberField control={control} name="port" />
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
