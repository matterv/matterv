/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { createColumnHelper } from '@tanstack/react-table'
import { useMemo, useState } from 'react'
import { Link, useSearchParams, type LoaderFunctionArgs } from 'react-router-dom'

import { apiQueryClient, usePrefetchedApiQuery, type File } from '@oxide/api'
import {
  Document16Icon,
  Folder16Icon,
  Storage24Icon,
} from '@oxide/design-system/icons/react'

import { requiredStorageParams, useStorageParams } from '~/hooks/use-params'
import { CreateDirModal } from '~/pages/storage/CreateDirModal.tsx'
import { UploadFileModal } from '~/pages/storage/UploadFileModal.tsx'
import { LinkCell } from '~/table/cells/LinkCell.tsx'
import { SizeCell } from '~/table/columns/common'
import { useQueryTable } from '~/table/QueryTable.tsx'
import { CreateButton } from '~/ui/lib/CreateButton.tsx'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'
import { TableActions, TableEmptyBox } from '~/ui/lib/Table'
import { pb } from '~/util/path-builder.ts'

function CurrentDir({ query, storageId }: { query: string | null; storageId: string }) {
  return (
    <div className="flex items-center gap-2">
      <span className="text-sans-md text-secondary">
        Current dir:
        {query && query !== '/' ? (
          <>
            <Link
              to={pb.storageFiles(storageId)}
              className="px-[5px] py-[1px] text-accent-secondary hover:text-accent"
            >
              /
            </Link>
            <span className="text-quinary"> / </span>
            {query}
          </>
        ) : (
          <span className="px-[3px] py-[1px]">/</span>
        )}
      </span>
    </div>
  )
}

const EmptyState = () => (
  <TableEmptyBox>
    <EmptyMessage
      icon={<Storage24Icon />}
      title="No files"
      body="Upload images or create vm in this storage"
    />
  </TableEmptyBox>
)

StorageFilesTab.loader = async ({ request, params }: LoaderFunctionArgs) => {
  const url = new URL(request.url)
  const path = url.searchParams.get('path')
  const { storageId } = requiredStorageParams(params)
  const fileSelector = {
    path: { storageId },
    query: { path: path && path !== '/' ? '/' + path : '/' },
  }
  await Promise.all([
    apiQueryClient.prefetchQuery('listFiles', fileSelector),
    apiQueryClient.prefetchQuery('getStorage', { path: { storageId } }),
  ])
  return null
}

const colHelper = createColumnHelper<File>()

export function StorageFilesTab() {
  const [searchParams] = useSearchParams()
  const query = searchParams.get('path')
  const [showCreateDir, setShowCreateDir] = useState(false)
  const [showUploadFile, setUploadFile] = useState(false)

  const { storageId } = useStorageParams()

  const storagePathQuery = useMemo(
    () => ({
      path: { storageId },
      query: { path: query && query !== '/' ? '/' + query : '/' },
    }),
    [storageId, query]
  )

  const { data: files } = usePrefetchedApiQuery('listFiles', storagePathQuery)

  const columns = useMemo(
    () => [
      colHelper.accessor('type', {
        cell: (info) => {
          if (info.getValue() === 'directory') {
            return <Folder16Icon></Folder16Icon>
          } else {
            return <Document16Icon></Document16Icon>
          }
        },
        header: '',
        id: 'menu',
        meta: {
          tdClassName: 'action-col children:p-4 w-10',
        },
      }),

      colHelper.accessor((f) => ({ name: f.name, type: f.type }), {
        header: 'Name',
        cell: (info) => {
          if (info.getValue().type === 'directory') {
            return (
              <LinkCell to={pb.storageFiles(storageId, info.getValue().name)}>
                {info.getValue().name}
              </LinkCell>
            )
          } else {
            return <>{info.getValue().name}</>
          }
        },
      }),
      colHelper.accessor('size', { cell: SizeCell, header: 'Size' }),
    ],
    [storageId]
  )
  const { Table } = useQueryTable('listFiles', storagePathQuery, {
    placeholderData: (x) => x,
  })

  return (
    <>
      <TableActions className="!-mt-6 !justify-between">
        <CurrentDir query={query} storageId={storageId} />
        {(!query || query === '/') && (
          <CreateButton onClick={() => setShowCreateDir(true)}>
            Create directory
          </CreateButton>
        )}
        {query && query !== '/' && (
          <CreateButton onClick={() => setUploadFile(true)}>Upload File</CreateButton>
        )}
      </TableActions>

      {files?.items.length === 0 ? (
        <EmptyState />
      ) : (
        <Table columns={columns} emptyState={<EmptyState />} />
      )}
      {showCreateDir && <CreateDirModal onDismiss={() => setShowCreateDir(false)} />}
      {showUploadFile && (
        <UploadFileModal onDismiss={() => setUploadFile(false)} currentDir={'/' + query!} />
      )}
    </>
  )
}
