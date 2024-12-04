/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */

import { json } from "~/api/__generated__/msw-handlers";

interface PaginateOptions {
  limit?: number;
  pageToken?: string;
}

export const paginated = <P extends PaginateOptions, I extends { id: string }>(
  params: P,
  items: I[],
) => {
  const { limit = 100, pageToken } = params || {};
  let startIndex = pageToken ? items.findIndex((i) => i.id === pageToken) : 0;
  startIndex = startIndex < 0 ? 0 : startIndex;

  if (startIndex > items.length) {
    return {
      items: [],
      nextPage: null,
    };
  }

  if (limit + startIndex >= items.length) {
    return {
      items: items.slice(startIndex),
      nextPage: null,
    };
  }

  return {
    items: items.slice(startIndex, startIndex + limit),
    nextPage: `${items[startIndex + limit].id}`,
  };
};

export const NotImplemented = () => {
  // This doesn't just return the response because it broadens the type to be usable
  // directly as a handler
  throw json({ error_code: "NotImplemented" }, { status: 501 });
};
