/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Button } from "@headlessui/react";
import {
  createColumnHelper,
  getCoreRowModel,
  useReactTable,
  type Row,
  type RowSelectionState,
} from "@tanstack/react-table";
import { useEffect, useMemo, useState } from "react";
import { useController, type Control } from "react-hook-form";

import { EmptyMessage } from "@oxide/design-system";
import { Storage24Icon } from "@oxide/design-system/icons/react";

import { useApiQuery, type File } from "~/api";
import type { IsoSelectionProps } from "~/pages/vm/IsoSelectionForm.tsx";
import { linkClass } from "~/table/cells/LinkCell.tsx";
import { Table } from "~/table/Table.tsx";
import { Radio } from "~/ui/lib/Radio.tsx";
import { TableActions, TableEmptyBox } from "~/ui/lib/Table.tsx";

function CurrentDir({
  currentDir,
  goToRoot,
}: {
  currentDir: string;
  goToRoot: () => void;
}) {
  return (
    <div className="flex items-center">
      <span className="text-sans-md text-secondary">
        Current dir:
        {currentDir !== "/" ? (
          <>
            <Button
              onClick={() => goToRoot()}
              className="link-with-underline px-[5px] py-[1px] text-accent-secondary hover:text-accent"
            >
              /
            </Button>
            <span className="text-quinary"> / </span>
            {currentDir}
          </>
        ) : (
          <span className="px-[3px] py-[1px]">/</span>
        )}
      </span>
    </div>
  );
}

const EmptyState = () => (
  <TableEmptyBox>
    <EmptyMessage
      icon={<Storage24Icon />}
      title="No files"
      body="No files in this directory"
    />
  </TableEmptyBox>
);

const colHelper = createColumnHelper<File>();

export function FileListTable({
  storageId,
  control,
}: {
  storageId: string;
  control: Control<IsoSelectionProps>;
}) {
  const {
    field: { onChange: onIsoPathChange },
  } = useController({ control, name: "isoPath" });
  const [currentDir, setCurrentDir] = useState<string>("/");
  const [rowSelection, setRowSelection] = useState<RowSelectionState>({});
  const storagePathQuery = useMemo(
    () => ({
      path: { storageId },
      query: { path: currentDir === "/" ? "/" : "/" + currentDir },
    }),
    [storageId, currentDir],
  );

  const { data: files } = useApiQuery("listFiles", storagePathQuery);
  const rows = useMemo(
    () => (files?.items || []).map((file) => ({ ...file })),
    [files],
  );

  const columns = useMemo(
    () => [
      colHelper.accessor("type", {
        id: "select",
        meta: { thClassName: "w-10" },
        header: "",
        cell: ({ row }: { row: Row<File> }) => {
          // `onChange` is empty to suppress react warning. Actual trigger happens in `Table.tsx`
          return <Radio checked={row.getIsSelected()} onChange={() => {}} />;
        },
      }),
      colHelper.accessor((f) => ({ name: f.name, type: f.type }), {
        header: "Name",
        cell: (info) => {
          if (info.getValue().type === "directory") {
            return (
              <Button
                onClick={() => setCurrentDir(info.getValue().name)}
                className={linkClass}
              >
                {info.getValue().name}
              </Button>
            );
          } else {
            return <>{info.getValue().name}</>;
          }
        },
      }),
    ],
    [],
  );
  const table = useReactTable({
    columns: columns,
    data: rows,
    getCoreRowModel: getCoreRowModel(),
    enableRowSelection: (row: Row<File>) => {
      return row.original.type === "file";
    },
    onRowSelectionChange: setRowSelection,
    state: {
      rowSelection: rowSelection,
    },
  });

  useEffect(() => {
    table.resetRowSelection();
  }, [currentDir, table]);

  useEffect(() => {
    if (table.getSelectedRowModel().rows.length > 0) {
      if (currentDir === "/") {
        onIsoPathChange(
          currentDir + table.getSelectedRowModel().rows[0].original.name,
        );
      } else {
        onIsoPathChange(
          "/" +
            currentDir +
            "/" +
            table.getSelectedRowModel().rows[0].original.name,
        );
      }
    } else {
      onIsoPathChange("");
    }
  }, [rowSelection, table, currentDir, onIsoPathChange]);

  return (
    <>
      <TableActions className="!justify-between">
        <CurrentDir
          currentDir={currentDir}
          goToRoot={() => setCurrentDir("/")}
        />
      </TableActions>
      {files?.items.length === 0 ? (
        <EmptyState />
      ) : (
        <Table table={table} singleSelect />
      )}
    </>
  );
}
