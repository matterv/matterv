import React, { useMemo } from 'react'
import { useController, useForm, type Control } from 'react-hook-form'
import { useNavigate, type NavigateFunction } from 'react-router-dom'

import type { Host, Storage } from '~/api'
import { ListboxField } from '~/components/form/fields/ListboxField.tsx'
import { SideModalForm } from '~/components/form/SideModalForm.tsx'
import { FileListTable } from '~/pages/vm/FileListTable.tsx'
import { FormDivider } from '~/ui/lib/Divider.tsx'

const StorageSourceField = ({
  control,
  storages,
}: {
  control: Control<IsoSelectionProps>
  storages: Storage[]
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: 'storageId' })
  const storageItems = storages.map((storage) => ({
    label: storage.name,
    value: storage.id,
  }))

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="storageId"
          label="Select a storage"
          placeholder="Select a storage"
          isLoading={false}
          items={storageItems}
          required
          onChange={(id) => {
            onChange(id)
          }}
        />
      </div>
    </>
  )
}

export type IsoSelectionProps = {
  storageId: string
  isoPath: string
}
type IsoSelectionFormProps = {
  onSubmit: (props: IsoSelectionProps) => void
  onDismiss: (navigate: NavigateFunction) => void
  host: Host
}
export function IsoSelectionForm({ onDismiss, onSubmit, host }: IsoSelectionFormProps) {
  const storages = useMemo(() => host.vmStorages || [], [host.vmStorages])
  const defaultValues: IsoSelectionProps = {
    storageId: storages[0].id,
    isoPath: '',
  }
  const navigate = useNavigate()

  const form = useForm({ defaultValues })
  const selectedFile = form.watch('isoPath')
  const selectedStorageId = form.watch('storageId')
  return (
    <SideModalForm
      form={form}
      formType="create"
      title="Choose an ISO"
      resourceName="disk"
      onDismiss={() => onDismiss(navigate)}
      onSubmit={() => {
        onSubmit(form.getValues())
      }}
      submitError={null}
      disableSubmitBtn={selectedFile === ''}
    >
      <StorageSourceField control={form.control} storages={storages} />
      <FileListTable storageId={selectedStorageId} control={form.control} />
      <FormDivider />
    </SideModalForm>
  )
}
