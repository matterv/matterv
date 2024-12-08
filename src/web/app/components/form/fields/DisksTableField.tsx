/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { useMemo, useState } from "react";
import { useController, type Control } from "react-hook-form";

import type { CreateVirtualMachineOnHostRequest, Host } from "@oxide/api";

import { CreateDiskModalForm } from "~/forms/disk-create";
import { Button } from "~/ui/lib/Button";
import { FieldLabel } from "~/ui/lib/FieldLabel";
import * as MiniTable from "~/ui/lib/MiniTable";
import { GiB } from "~/util/units.ts";

export function DisksTableField({
  control,
  disabled,
  hosts,
}: {
  control: Control<CreateVirtualMachineOnHostRequest>;
  disabled: boolean;
  hosts: Host[];
}) {
  const {
    field: { value: hostId },
  } = useController({ control, name: "hostId" });
  const host = hosts.find((h) => h.id === hostId);
  const [showDiskCreate, setShowDiskCreate] = useState(false);
  const storages = useMemo(() => host?.vmStorages || [], [host?.vmStorages]);

  const {
    field: { value: items, onChange },
  } = useController({ control, name: "disks" });

  if (!storages?.length) {
    return null;
  }
  return (
    <>
      <div className="max-w-lg">
        <FieldLabel id="new-disks-label">{/* this was empty */}</FieldLabel>
        {!!items.length && (
          <MiniTable.Table className="mb-4">
            <MiniTable.Header>
              <MiniTable.HeadCell>Id</MiniTable.HeadCell>
              <MiniTable.HeadCell>Storage</MiniTable.HeadCell>
              <MiniTable.HeadCell>Size</MiniTable.HeadCell>
              <MiniTable.HeadCell className="w-12" />
            </MiniTable.Header>
            <MiniTable.Body>
              {items.map((item, index) => (
                <MiniTable.Row
                  tabIndex={0}
                  aria-rowindex={index + 1}
                  key={item.id}
                >
                  <MiniTable.Cell>{item.id}</MiniTable.Cell>
                  <MiniTable.Cell>{item.storageName}</MiniTable.Cell>
                  <MiniTable.Cell>
                    <span>{item.size}</span>
                    <span className="ml-1 inline-block text-accent-secondary">
                      GiB
                    </span>
                  </MiniTable.Cell>
                  <MiniTable.RemoveCell
                    onClick={() => {
                      const t = items.filter((i) => i.id !== item.id);
                      onChange(t);
                    }}
                    label={`remove disk ${item.id}`}
                  />
                </MiniTable.Row>
              ))}
            </MiniTable.Body>
          </MiniTable.Table>
        )}

        <div className="space-x-3">
          <Button
            size="sm"
            onClick={() => setShowDiskCreate(true)}
            disabled={disabled}
          >
            Add a disk
          </Button>
        </div>
      </div>

      {showDiskCreate && (
        <CreateDiskModalForm
          onSubmit={(values) => {
            values.storageName = storages.find(
              (s) => s.id === values.storageId,
            )!.name;
            values.size = values.size * GiB;
            onChange([...items, values]);
            setShowDiskCreate(false);
          }}
          onDismiss={() => setShowDiskCreate(false)}
          host={host as Host}
          diskId={items.length + 1}
        />
      )}
    </>
  );
}
