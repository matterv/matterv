/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import { Control, useController, useForm } from "react-hook-form";
import type { CreateVirtualMachineOnHostRequest, DiskController } from "~/api";
import { FormDivider } from "~/ui/lib/Divider.tsx";
import { Form } from "~/components/form/Form.tsx";
import React, { useState } from "react";
import { FieldLabel } from "~/ui/lib/FieldLabel.tsx";
import * as MiniTable from "~/ui/lib/MiniTable.tsx";
import { Button } from "~/ui/lib/Button.tsx";
import { Modal } from "~/ui/lib/Modal.tsx";
import { ListboxField } from "~/components/form/fields/ListboxField.tsx";

type CreateDiskController = {
  type: "IDE" | "SCSI";
  model: "LSI" | "PVSCSI";
};

type CreateDiskControllerkModalFormProps = {
  onSubmit: (createDiskController: CreateDiskController) => void;
  /**
   * Passing navigate is a bit of a hack to be able to do a nav from the routes
   * file. The callers that don't need the arg can ignore it.
   */
  onDismiss: () => void;
  onSuccess?: (controller: CreateDiskController) => void;
};

const DiskControllerTypeField = ({
  control,
}: {
  control: Control<CreateDiskController>;
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: "type" });

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="type"
          label="Choose a type"
          placeholder="Choose a type"
          isLoading={false}
          items={[
            { label: "IDE", value: "IDE" },
            { label: "SCSI", value: "SCSI" },
          ]}
          required
          onChange={(id) => {
            onChange(id);
          }}
        />
      </div>
    </>
  );
};

const DiskControllerModelField = ({
  control,
}: {
  control: Control<CreateDiskController>;
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: "model" });

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="model"
          label="Choose a model"
          placeholder="Choose a model"
          isLoading={false}
          items={[
            { label: "LSI", value: "LSI" },
            { label: "PVSCSI", value: "PVSCSI" },
          ]}
          required
          onChange={(id) => {
            onChange(id);
          }}
        />
      </div>
    </>
  );
};

function CreateDiskControllerModalForm({
  onSubmit,
  onDismiss,
}: CreateDiskControllerkModalFormProps) {
  const defaultValues: CreateDiskController = {
    type: "SCSI",
    model: "LSI",
  };
  const { control, handleSubmit } = useForm({ defaultValues });
  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a disk controller">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation();
            }}
            className="space-y-4"
          >
            <DiskControllerTypeField control={control} />
            <DiskControllerModelField control={control} />
          </form>
        </Modal.Section>
      </Modal.Body>
      <Modal.Footer
        onDismiss={onDismiss}
        actionText="Ok"
        onAction={handleSubmit(onSubmit)}
      />
    </Modal>
  );
}

export function DiskControllerTableField({
  control,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>;
}) {
  const [showDiskControllerCreate, setShowDiskControllerCreate] =
    useState(false);

  const {
    field: { value: items, onChange },
  } = useController({ control, name: "diskControllers" });

  return (
    <>
      <div className="max-w-lg">
        <FieldLabel id="new-disks-label">{/* this was empty */}</FieldLabel>
        {!!items.length && (
          <MiniTable.Table className="mb-4">
            <MiniTable.Header>
              <MiniTable.HeadCell>Id</MiniTable.HeadCell>
              <MiniTable.HeadCell>Type</MiniTable.HeadCell>
              <MiniTable.HeadCell>Model</MiniTable.HeadCell>
              <MiniTable.HeadCell className="w-12" />
            </MiniTable.Header>
            <MiniTable.Body>
              {items.map((item) => (
                <MiniTable.Row tabIndex={0} key={item.id}>
                  <MiniTable.Cell>{item.id}</MiniTable.Cell>
                  <MiniTable.Cell>{item.type}</MiniTable.Cell>
                  <MiniTable.Cell>{item.model}</MiniTable.Cell>
                  <MiniTable.RemoveCell
                    onClick={() => {
                      const t = items.filter((i) => i.id !== item.id);
                      onChange(t);
                    }}
                    label={`remove disk controller ${item.id}`}
                  />
                </MiniTable.Row>
              ))}
            </MiniTable.Body>
          </MiniTable.Table>
        )}
        {showDiskControllerCreate && (
          <CreateDiskControllerModalForm
            onSubmit={(createDiskController) => {
              const newController: DiskController = {
                id: items.length + 1,
                ...createDiskController,
              };
              onChange([...items, newController]);
              setShowDiskControllerCreate(false);
            }}
            onDismiss={() => setShowDiskControllerCreate(false)}
          />
        )}

        <div className="space-x-3">
          <Button size="sm" onClick={() => setShowDiskControllerCreate(true)}>
            Add a disk controller
          </Button>
        </div>
      </div>
    </>
  );
}

export const DiskControllerField = ({
  control,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>;
}) => {
  return (
    <div>
      <FormDivider />
      <Form.Heading id="disk controller">Disk Controller</Form.Heading>
      <DiskControllerTableField control={control} />
    </div>
  );
};
