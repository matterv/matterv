/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import React, { useMemo } from "react";
import { useController, useForm, type Control } from "react-hook-form";

import {
  DiskController,
  type DiskRequest,
  type Host,
  type Storage,
} from "@oxide/api";

import { DiskSizeField } from "~/components/form/fields/DiskSizeField";
import { ListboxField } from "~/components/form/fields/ListboxField";
import { Modal } from "~/ui/lib/Modal.tsx";

type CreateSideModalFormProps = {
  onSubmit: (diskCreate: DiskRequest) => void;
  /**
   * Passing navigate is a bit of a hack to be able to do a nav from the routes
   * file. The callers that don't need the arg can ignore it.
   */
  onDismiss: () => void;
  onSuccess?: (disk: DiskRequest) => void;
  host: Host;
  diskId: number;
  diskControllers: DiskController[];
};

export function CreateDiskModalForm({
  onSubmit,
  onDismiss,
  host,
  diskId,
  diskControllers,
}: CreateSideModalFormProps) {
  const storages = useMemo(() => host.vmStorages || [], [host.vmStorages]);
  const defaultValues: DiskRequest = {
    id: diskId,
    size: 10,
    storageId: storages[0].id,
    storageName: storages[0].name,
    controllerId: diskControllers[0].id,
  };
  const { control, handleSubmit } = useForm({ defaultValues });
  const validateSizeGiB = 1;
  return (
    <Modal isOpen onDismiss={onDismiss} title="Add a disk">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation();
            }}
            className="space-y-4"
          >
            <DiskSourceField control={control} storages={storages} />
            <DiskSizeField
              name="size"
              control={control}
              validate={(diskSizeGiB: number) => {
                if (validateSizeGiB && diskSizeGiB < validateSizeGiB) {
                  return `Must be as large as selected  (min. ${validateSizeGiB} GiB)`;
                }
              }}
            />
            <DiskControllerIdField
              control={control}
              diskControllers={diskControllers}
            />
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

const DiskSourceField = ({
  control,
  storages,
}: {
  control: Control<DiskRequest>;
  storages: Storage[];
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: "storageId" });
  const storageItems = storages.map((storage) => ({
    label: storage.name,
    value: storage.id,
  }));

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="storageId"
          label="Choose a storage"
          placeholder="Choose a storage"
          isLoading={false}
          items={storageItems}
          required
          onChange={(id) => {
            onChange(id);
          }}
        />
      </div>
    </>
  );
};

const DiskControllerIdField = ({
  control,
  diskControllers,
}: {
  control: Control<DiskRequest>;
  diskControllers: DiskController[];
}) => {
  const {
    field: { onChange },
  } = useController({ control, name: "controllerId" });
  const controllerIds = diskControllers.map((controller) => ({
    label: controller.id.toString(),
    value: controller.id.toString(),
  }));

  return (
    <>
      <div className="max-w-lg space-y-2">
        <ListboxField
          control={control}
          name="controllerId"
          label="Choose a controller"
          placeholder="Choose a controller"
          isLoading={false}
          items={controllerIds}
          required
          onChange={(id) => {
            onChange(id);
          }}
        />
      </div>
    </>
  );
};
