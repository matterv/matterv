/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import React, { useEffect, useMemo, useState } from 'react'
import {
  useController,
  useForm,
  type Control,
  type FieldPath,
  type FieldPathByValue,
  type FieldValues,
  type ValidateResult,
} from 'react-hook-form'
import { useNavigate, useParams } from 'react-router-dom'

import {
  apiQueryClient,
  INSTANCE_MAX_CPU,
  INSTANCE_MAX_RAM_MiB,
  useApiMutation,
  useApiQueryClient,
  usePrefetchedApiQuery,
  type CreateVirtualMachineOnHostRequest,
  type Host,
  type Network,
  type NetworkRequest,
} from '@oxide/api'
import { Instances24Icon } from '@oxide/design-system/icons/react'

import { DisksTableField } from '~/components/form/fields/DisksTableField.tsx'
import { ListboxField } from '~/components/form/fields/ListboxField.tsx'
import { NameField } from '~/components/form/fields/NameField.tsx'
import { NumberField } from '~/components/form/fields/NumberField.tsx'
import type { TextFieldProps } from '~/components/form/fields/TextField.tsx'
import { Form } from '~/components/form/Form'
import { FullPageForm } from '~/components/form/FullPageForm.tsx'
import { IsoSelectionForm } from '~/pages/vm/IsoSelectionForm.tsx'
import { addToast } from '~/stores/toast.ts'
import { Button } from '~/ui/lib/Button.tsx'
import { FormDivider } from '~/ui/lib/Divider.tsx'
import { FieldLabel } from '~/ui/lib/FieldLabel.tsx'
import * as MiniTable from '~/ui/lib/MiniTable.tsx'
import { Modal } from '~/ui/lib/Modal.tsx'
import { PageHeader, PageTitle } from '~/ui/lib/PageHeader.tsx'
import { ALL_ISH } from '~/util/consts.ts'
import { pb } from '~/util/path-builder'
import { GiB } from '~/util/units.ts'

const baseDefaultValues: CreateVirtualMachineOnHostRequest = {
  name: '',
  memory: 4,
  cpu: 1,
  disks: [],
  networks: [],
  hostId: '',
}

CreateVm.loader = async () => {
  await Promise.all([
    apiQueryClient.prefetchQuery('getHosts', { query: { limit: ALL_ISH } }),
  ])
  return null
}

type CreateNetworkModalFormProps = {
  onSubmit: (diskCreate: NetworkRequest) => void
  /**
   * Passing navigate is a bit of a hack to be able to do a nav from the routes
   * file. The callers that don't need the arg can ignore it.
   */
  onDismiss: () => void
  onSuccess?: (disk: NetworkRequest) => void
  host: Host
  networkId: number
}

const NetworkSourceField = ({
  control,
  networks,
}: {
  control: Control<NetworkRequest>
  networks: Network[]
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: 'networkId' })
  const networkItems = networks.map((network) => ({
    label: network.name,
    value: network.id,
  }))

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="networkId"
          label="Choose a network"
          placeholder="Choose a network"
          isLoading={false}
          items={networkItems}
          required
          onChange={(id) => {
            onChange(id)
          }}
        />
      </div>
    </>
  )
}

const HostField = ({
  control,
  hosts,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>
  hosts: Host[]
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: 'hostId' })
  const {
    field: { onChange: diskOnChange },
  } = useController({ control, name: 'disks' })
  const hostItems = hosts.map((host) => ({
    label: host.name,
    value: host.id,
  }))

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="hostId"
          label="Host"
          placeholder="Choose a host"
          isLoading={false}
          items={hostItems}
          required
          onChange={(id) => {
            onChange(id)
            diskOnChange([])
          }}
        />
      </div>
    </>
  )
}

const GuestOsField = ({
                     control
                   }: {
  control: Control<CreateVirtualMachineOnHostRequest>
}) => {
  const guestOsItems = [{label: 'Windows', value: 'Windows'}, {label: 'Linux', value: 'Linux'}]

  return (
      <>
        <div className="max-w-lg space-y-2">
          <ListboxField
              control={control}
              name="osInfo.osType"
              label="Guest OS"
              placeholder="Choose Guest OS"
              isLoading={false}
              items={guestOsItems}
              required
          />
        </div>
      </>
  )
}

const NetworkField = ({
  control,
  hosts,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>
  hosts: Host[]
}) => {
  const {
    field: { value: hostId },
  } = useController({ control, name: 'hostId' })
  const host = hosts.find((h) => h.id === hostId)
  if (!host?.vmNetwork) {
    return null
  }

  return (
    <div>
      <FormDivider />
      <Form.Heading id="network">Network</Form.Heading>
      <NetworkTableField control={control} host={host} />
    </div>
  )
}

const IsoField = ({
  control,
  hosts,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>
  hosts: Host[]
}) => {
  const {
    field: { value: hostId },
  } = useController({ control, name: 'hostId' })
  const host = hosts.find((h) => h.id === hostId)
  if (!host?.vmStorages) {
    return null
  }

  return (
    <div>
      <FormDivider />
      <Form.Heading id="network">Bootable ISO</Form.Heading>
      <IsoTableField control={control} host={host} />
    </div>
  )
}

function CreateNetworkModalForm({
  onSubmit,
  onDismiss,
  host,
  networkId,
}: CreateNetworkModalFormProps) {
  const network = useMemo(() => host.vmNetwork as Network, [host.vmNetwork])
  const defaultValues: NetworkRequest = {
    id: networkId,
    networkId: network.id,
    connected: true,
  }
  const { control, handleSubmit } = useForm({ defaultValues })
  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a network">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation()
            }}
            className="space-y-4"
          >
            <NetworkSourceField control={control} networks={[network]} />
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

export function NetworkTableField({
  control,
  host,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>
  host: Host
}) {
  const [showNetworkCreate, setShowNetworkCreate] = useState(false)
  const network = useMemo(() => host.vmNetwork as Network, [host.vmNetwork])

  const {
    field: { value: items, onChange },
  } = useController({ control, name: 'networks' })

  return (
    <>
      <div className="max-w-lg">
        <FieldLabel id="new-disks-label">{/* this was empty */}</FieldLabel>
        {!!items.length && (
          <MiniTable.Table className="mb-4">
            <MiniTable.Header>
              <MiniTable.HeadCell>Id</MiniTable.HeadCell>
              <MiniTable.HeadCell>Network Name</MiniTable.HeadCell>
              <MiniTable.HeadCell>Model</MiniTable.HeadCell>
              <MiniTable.HeadCell className="w-12" />
            </MiniTable.Header>
            <MiniTable.Body>
              {items.map((item) => (
                <MiniTable.Row tabIndex={0} key={item.id}>
                  <MiniTable.Cell>{item.id}</MiniTable.Cell>
                  <MiniTable.Cell>{network.name}</MiniTable.Cell>
                  <MiniTable.Cell>Virtio</MiniTable.Cell>
                  <MiniTable.RemoveCell
                    onClick={() => {
                      const t = items.filter((i) => i.id !== item.id)
                      onChange(t)
                    }}
                    label={`remove network ${item.id}`}
                  />
                </MiniTable.Row>
              ))}
            </MiniTable.Body>
          </MiniTable.Table>
        )}
        {showNetworkCreate && (
          <CreateNetworkModalForm
            onSubmit={(values) => {
              onChange([...items, values])
              setShowNetworkCreate(false)
            }}
            onDismiss={() => setShowNetworkCreate(false)}
            host={host}
            networkId={items.length + 1}
          />
        )}

        <div className="space-x-3">
          <Button size="sm" onClick={() => setShowNetworkCreate(true)}>
            Add a network
          </Button>
        </div>
      </div>
    </>
  )
}

export function IsoTableField({
  control,
  host,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>
  host: Host
}) {
  const [showIsoSelection, setShowIsoSelection] = useState(false)
  function getStorageName(storageId: string): string {
    return host.vmStorages?.find((v) => v.id === storageId)?.name || ''
  }
  const {
    field: { value: cdrom, onChange },
  } = useController({ control, name: 'cdrom' })

  return (
    <>
      <div className="max-w-lg">
        <FieldLabel id="new-disks-label">{/* this was empty */}</FieldLabel>
        {cdrom && (
          <MiniTable.Table className="mb-4">
            <MiniTable.Header>
              <MiniTable.HeadCell>Storage</MiniTable.HeadCell>
              <MiniTable.HeadCell>ISO Path</MiniTable.HeadCell>
              <MiniTable.HeadCell className="w-12" />
            </MiniTable.Header>
            <MiniTable.Body>
              <MiniTable.Row tabIndex={0} key={0}>
                <MiniTable.Cell>{getStorageName(cdrom.storageId)}</MiniTable.Cell>
                <MiniTable.Cell>{cdrom.isoPath}</MiniTable.Cell>
                <MiniTable.RemoveCell
                  onClick={() => {
                    onChange(undefined)
                  }}
                  label={`remove cdrom}`}
                />
              </MiniTable.Row>
            </MiniTable.Body>
          </MiniTable.Table>
        )}
        {showIsoSelection && (
          <IsoSelectionForm
            onSubmit={(values) => {
              onChange({ ...values, connected: true })
              setShowIsoSelection(false)
            }}
            onDismiss={() => setShowIsoSelection(false)}
            host={host}
          />
        )}

        {!cdrom && (
          <div className="space-x-3">
            <Button size="sm" onClick={() => setShowIsoSelection(true)}>
              Choose an ISO
            </Button>
          </div>
        )}
      </div>
    </>
  )
}

interface CpuSizeProps<
  TFieldValues extends FieldValues,
  TName extends FieldPath<TFieldValues>,
> extends TextFieldProps<TFieldValues, TName> {
  minSize?: number
  validate?(diskSizeGiB: number): ValidateResult
}
function CpuSizeField<
  TFieldValues extends FieldValues,
  TName extends FieldPathByValue<TFieldValues, number>,
>({
  required = true,
  name,
  minSize = 1,
  validate,
  ...props
}: CpuSizeProps<TFieldValues, TName>) {
  return (
    <NumberField
      required={required}
      name={name}
      min={minSize}
      max={INSTANCE_MAX_CPU}
      validate={(cpuSize) => {
        // Run a number of default validators
        if (Number.isNaN(cpuSize)) {
          return 'Cpu size is required'
        }
        if (cpuSize < minSize) {
          return `Must be at least ${minSize}`
        }
        if (cpuSize > INSTANCE_MAX_CPU) {
          return `Can be at most ${INSTANCE_MAX_CPU}`
        }
        // Run any additional validators passed in from the callsite
        return validate?.(cpuSize)
      }}
      {...props}
    />
  )
}

interface MemorySizeProps<
  TFieldValues extends FieldValues,
  TName extends FieldPath<TFieldValues>,
> extends TextFieldProps<TFieldValues, TName> {
  minSize?: number
  validate?(diskSizeGiB: number): ValidateResult
}
function MemorySizeField<
  TFieldValues extends FieldValues,
  TName extends FieldPathByValue<TFieldValues, number>,
>({
  required = true,
  name,
  label,
  minSize = 1,
  validate,
  ...props
}: MemorySizeProps<TFieldValues, TName>) {
  return (
    <NumberField
      label={label}
      units="GiB"
      required={required}
      name={name}
      min={minSize}
      max={INSTANCE_MAX_RAM_MiB}
      validate={(memSize) => {
        // Run a number of default validators
        if (Number.isNaN(memSize)) {
          return 'Memory size is required'
        }
        if (memSize < minSize) {
          return `Must be at least ${minSize}`
        }
        if (memSize > INSTANCE_MAX_RAM_MiB) {
          return `Can be at most ${INSTANCE_MAX_RAM_MiB}`
        }
        // Run any additional validators passed in from the callsite
        return validate?.(memSize)
      }}
      {...props}
    />
  )
}

export function CreateVm() {
  const params = useParams()

  const { data } = usePrefetchedApiQuery('getHosts', {
    query: { limit: ALL_ISH },
  })
  const hosts = useMemo(() => {
    if (data?.items) {
      if (params.hostId) {
        data.items = data.items.filter((h) => h.id === params.hostId)
      }
      return data.items
    } else {
      return []
    }
  }, [data, params.hostId])

  const [isSubmitting, setIsSubmitting] = useState(false)

  const queryClient = useApiQueryClient()
  const navigate = useNavigate()

  const createInstance = useApiMutation('createVm', {
    onSuccess(instance) {
      queryClient.invalidateQueries('getVm')
      addToast({ content: 'Your instance has been created' })
      if (params.hostId) {
        queryClient.invalidateQueries('getVmsOnHost')
        navigate(pb.host(params.hostId))
      } else {
        navigate(pb.instance(instance.vm.id))
      }
    },
  })

  const defaultValues: CreateVirtualMachineOnHostRequest = {
    ...baseDefaultValues,
    hostId: hosts[0]?.id,
  }

  const form = useForm({ defaultValues })
  const { control } = form
  useEffect(() => {
    if (createInstance.error) {
      setIsSubmitting(false)
    }
  }, [createInstance.error])

  return (
    <>
      <PageHeader>
        <PageTitle icon={<Instances24Icon />}>Create instance</PageTitle>
      </PageHeader>
      <FullPageForm
        id="create-instance-form"
        form={form}
        onSubmit={async (values) => {
          console.log(values)
          setIsSubmitting(true)

          await createInstance.mutateAsync({
            body: { ...values, memory: values.memory * GiB },
          })
        }}
        loading={createInstance.isPending}
        submitError={createInstance.error}
      >
        <NameField name="name" control={control} disabled={isSubmitting} />
        <CpuSizeField name="cpu" control={control} />
        <MemorySizeField name="memory" control={control} />
        <GuestOsField control={control} />
        <HostField control={control} hosts={hosts} />

        <FormDivider />
        <Form.Heading id="disks">Disks</Form.Heading>
        <DisksTableField control={control} disabled={isSubmitting} hosts={hosts} />
        <IsoField control={control} hosts={hosts} />
        <NetworkField control={control} hosts={hosts} />

        <Form.Actions>
          <Form.Submit loading={createInstance.isPending}>Create instance</Form.Submit>
          <Form.Cancel onClick={() => navigate(pb.instances())} />
        </Form.Actions>
      </FullPageForm>
    </>
  )
}
