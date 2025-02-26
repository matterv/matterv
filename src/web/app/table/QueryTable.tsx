/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

/* eslint-disable @typescript-eslint/no-explicit-any */
import { hashKey, type UseQueryOptions } from '@tanstack/react-query'
import { getCoreRowModel, useReactTable, type ColumnDef } from '@tanstack/react-table'
import React, { useCallback, useMemo, type ComponentType } from 'react'

import {
  useApiQuery,
  type Api,
  type ApiError,
  type Params,
  type Result,
  type ResultItem,
} from '@oxide/api'

import { Pagination } from '~/components/Pagination'
import { usePagination } from '~/hooks/use-pagination'
import { EmptyMessage } from '~/ui/lib/EmptyMessage'
import { TableEmptyBox } from '~/ui/lib/Table'

import { Table } from './Table'

export type ApiListMethods = Pick<
  InstanceType<typeof Api>['methods'],
  | 'getStoragesOnHost'
  | 'getVmsOnHost'
  | 'getHosts'
  | 'GetVms'
  | 'getStorages'
  | 'getStorage'
  | 'listFiles'
>

interface UseQueryTableResult<Item extends Record<string, unknown>> {
  Table: ComponentType<QueryTableProps<Item>>
}
/**
 * This hook builds a table that's linked to a given query. It's a combination
 * of react-query and react-table. It generates a `Table` component that controls
 * table level options and a `Column` component which governs the individual column
 * configuration
 */
export const useQueryTable = <A extends ApiListMethods, M extends keyof A>(
  query: M,
  params: Params<A[M]>,
  options?: Omit<UseQueryOptions<Result<A[M]>, ApiError>, 'queryKey' | 'queryFn'>
): UseQueryTableResult<ResultItem<A[M]>> => {
  const Table = useMemo(
    () => makeQueryTable<ResultItem<A[M]>>(query, params, options),
    // eslint-disable-next-line react-hooks/exhaustive-deps
    [query, hashKey(params as any), hashKey(options as any)]
  )

  return { Table }
}

type QueryTableProps<Item> = {
  /** Prints table data in the console when enabled */
  debug?: boolean
  pageSize?: number
  rowHeight?: 'small' | 'large'
  emptyState: React.ReactElement
  columns: ColumnDef<Item, any>[]
}

export const PAGE_SIZE = 25

// eslint-disable-next-line @typescript-eslint/no-explicit-any
const makeQueryTable = <Item extends Record<string, unknown>>(
  query: any,
  params: any,
  options: any
): ComponentType<QueryTableProps<Item>> =>
  function QueryTable({
    debug,
    pageSize = PAGE_SIZE,
    rowHeight = 'small',
    emptyState,
    columns,
  }: QueryTableProps<Item>) {
    const { currentPage, goToNextPage, goToPrevPage, hasPrev } = usePagination()

    const { data, isLoading } = useApiQuery(
      query,
      {
        path: params.path,
        query: { ...params.query, page: currentPage, limit: pageSize },
      },
      options
    )

    const tableData: any[] = useMemo(() => (data as any)?.items || [], [data])

    const getRowId = useCallback((row: any) => row.name, [])

    const table = useReactTable({
      columns,
      data: tableData,
      getRowId,
      getCoreRowModel: getCoreRowModel(),
      manualPagination: true,
    })

    if (debug) console.table((data as { items?: any[] })?.items || data)

    if (isLoading) return null

    const isEmpty = tableData.length === 0 && !hasPrev
    if (isEmpty) {
      return (
        <TableEmptyBox>{emptyState || <EmptyMessage title="No results" />}</TableEmptyBox>
      )
    }

    return (
      <>
        <Table table={table} rowHeight={rowHeight} />
        <Pagination
          pageSize={pageSize}
          hasNext={tableData.length === pageSize}
          hasPrev={hasPrev}
          nextPage={(data as any)?.nextPage}
          onNext={goToNextPage}
          onPrev={goToPrevPage}
        />
      </>
    )
  }
