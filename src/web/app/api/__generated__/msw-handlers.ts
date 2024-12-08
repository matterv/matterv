/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import {
  http,
  type HttpHandler,
  HttpResponse,
  type StrictResponse,
  type PathParams,
} from "msw";
import type {
  SnakeCasedPropertiesDeep as Snakify,
  Promisable,
} from "type-fest";
import { type ZodSchema } from "zod";
import type * as Api from "./Api";
import { snakeify } from "./util";
import * as schema from "./validate";

type HandlerResult<T> = Json<T> | StrictResponse<Json<T>>;
type StatusCode = number;

// these are used for turning our nice JS-ified API types back into the original
// API JSON types (snake cased and dates as strings) for use in our mock API

type StringifyDates<T> = T extends Date
  ? string
  : {
      [K in keyof T]: T[K] extends Array<infer U>
        ? Array<StringifyDates<U>>
        : StringifyDates<T[K]>;
    };

/**
 * Snake case fields and convert dates to strings. Not intended to be a general
 * purpose JSON type!
 */
export type Json<B> = Snakify<StringifyDates<B>>;
export const json = HttpResponse.json;

// Shortcut to reduce number of imports required in consumers
export { HttpResponse };

export interface MSWHandlers {
  /** `GET /api/v1/user` */
  getUser: (params: {
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.User>>;
  /** `POST /api/v1/login` */
  login: (params: {
    body: Json<Api.LoginRequest>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.LoginResponse>>;
  /** `POST /api/v1/logout` */
  logout: (params: {
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<StatusCode>;
  /** `GET /api/v1/host` */
  getHosts: (params: {
    query: Api.GetHostsQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.PaginatedHostResponse>>;
  /** `POST /api/v1/host` */
  addHost: (params: {
    body: Json<Api.AddHostRequest>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Host>>;
  /** `GET /api/v1/host/:hostId` */
  getHost: (params: {
    path: Api.GetHostPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Host>>;
  /** `GET /api/v1/host/:hostId/vm` */
  getVmsOnHost: (params: {
    path: Api.GetVmsOnHostPathParams;
    query: Api.GetVmsOnHostQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.PaginatedVMResponse>>;
  /** `POST /api/v1/host/:hostId/network` */
  addNetwork: (params: {
    path: Api.AddNetworkPathParams;
    body: Json<Api.AddNetworkRequest>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Network>>;
  /** `GET /api/v1/host/:hostId/storage` */
  getStoragesOnHost: (params: {
    path: Api.GetStoragesOnHostPathParams;
    query: Api.GetStoragesOnHostQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.PaginatedStorageResponse>>;
  /** `POST /api/v1/host/:hostId/storage` */
  addStorage: (params: {
    path: Api.AddStoragePathParams;
    body: Json<Api.AddStorageRequest>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Storage>>;
  /** `POST /api/v1/host/:hostId/refresh` */
  refreshHost: (params: {
    path: Api.RefreshHostPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.RefreshHostResponse>>;
  /** `GET /api/v1/vm` */
  GetVms: (params: {
    query: Api.GetVmsQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.PaginatedVMResponse>>;
  /** `POST /api/v1/vm` */
  createVm: (params: {
    body: Json<Api.CreateVirtualMachineOnHostRequest>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.CreateVirtualMachineResponse>>;
  /** `GET /api/v1/vm/:vmId` */
  getVm: (params: {
    path: Api.GetVmPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.VirtualMachine>>;
  /** `GET /api/v1/vm/:vmId/disk` */
  getVmDisks: (params: {
    path: Api.GetVmDisksPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Disks>>;
  /** `POST /api/v1/vm/:vmId/poweroff` */
  powerOffVm: (params: {
    path: Api.PowerOffVmPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.VirtualMachine>>;
  /** `POST /api/v1/vm/:vmId/poweron` */
  powerOnVm: (params: {
    path: Api.PowerOnVmPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.VirtualMachine>>;
  /** `POST /api/v1/vm/:vmId/reset` */
  resetVm: (params: {
    path: Api.ResetVmPathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.VirtualMachine>>;
  /** `GET /api/v1/storage` */
  getStorages: (params: {
    query: Api.GetStoragesQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.PaginatedStorageResponse>>;
  /** `GET /api/v1/storage/:storageId` */
  getStorage: (params: {
    path: Api.GetStoragePathParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.Storage>>;
  /** `POST /api/v1/storage/:storageId/upload` */
  uploadFile: (params: {
    path: Api.UploadFilePathParams;
    body: Json<Api.UploadFileReq>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<StatusCode>;
  /** `GET /api/v1/storage/:storageId/files` */
  listFiles: (params: {
    path: Api.ListFilesPathParams;
    query: Api.ListFilesQueryParams;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<HandlerResult<Api.ListFilesResponse>>;
  /** `POST /api/v1/storage/:storageId/files` */
  createFile: (params: {
    path: Api.CreateFilePathParams;
    body: Json<Api.CreateFileReq>;
    req: Request;
    cookies: Record<string, string>;
  }) => Promisable<StatusCode>;
}

function validateParams<S extends ZodSchema>(
  schema: S,
  req: Request,
  pathParams: PathParams,
) {
  const rawParams = new URLSearchParams(new URL(req.url).search);
  const params: [string, unknown][] = [];

  // Ensure numeric params like `limit` are parsed as numbers
  for (const [name, value] of rawParams) {
    params.push([name, isNaN(Number(value)) ? value : Number(value)]);
  }

  const result = schema.safeParse({
    path: pathParams,
    query: Object.fromEntries(params),
  });

  if (result.success) {
    return { params: result.data };
  }

  // if any of the errors come from path params, just 404 — the resource cannot
  // exist if there's no valid name
  const status = result.error.issues.some((e) => e.path[0] === "path")
    ? 404
    : 400;
  const error_code = status === 404 ? "NotFound" : "InvalidRequest";
  const message = "Zod error for params: " + JSON.stringify(result.error);
  return { paramsErr: json({ error_code, message }, { status }) };
}

const handler =
  (
    handler: MSWHandlers[keyof MSWHandlers],
    paramSchema: ZodSchema | null,
    bodySchema: ZodSchema | null,
  ) =>
  async ({
    request: req,
    params: pathParams,
    cookies,
  }: {
    request: Request;
    params: PathParams;
    cookies: Record<string, string | string[]>;
  }) => {
    const { params, paramsErr } = paramSchema
      ? validateParams(paramSchema, req, pathParams)
      : { params: {}, paramsErr: undefined };
    if (paramsErr) return paramsErr;

    const { path, query } = params;

    let body = undefined;
    if (bodySchema) {
      const rawBody = await req.json();
      const result = bodySchema.transform(snakeify).safeParse(rawBody);
      if (!result.success) {
        const message = "Zod error for body: " + JSON.stringify(result.error);
        return json({ error_code: "InvalidRequest", message }, { status: 400 });
      }
      body = result.data;
    }

    try {
      // TypeScript can't narrow the handler down because there's not an explicit relationship between the schema
      // being present and the shape of the handler API. The type of this function could be resolved such that the
      // relevant schema is required if and only if the handler has a type that matches the inferred schema
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      const result = await (handler as any).apply(null, [
        { path, query, body, req, cookies },
      ]);
      if (typeof result === "number") {
        return new HttpResponse(null, { status: result });
      }
      if (result instanceof Response) {
        return result;
      }
      return json(result);
    } catch (thrown) {
      if (typeof thrown === "number") {
        return new HttpResponse(null, { status: thrown });
      }
      if (typeof thrown === "string") {
        return json({ message: thrown }, { status: 400 });
      }
      if (thrown instanceof Response) {
        return thrown;
      }

      // if it's not one of those, then we don't know what to do with it
      console.error("Unexpected mock error", thrown);
      if (typeof thrown === "function") {
        console.error(
          "It looks like you've accidentally thrown an error constructor function from a mock handler without calling it!",
        );
      }
      // rethrow so everything breaks because this isn't supposed to happen
      throw thrown;
    }
  };

export function makeHandlers(handlers: MSWHandlers): HttpHandler[] {
  return [
    http.get("/api/v1/user", handler(handlers["getUser"], null, null)),
    http.post(
      "/api/v1/login",
      handler(handlers["login"], null, schema.LoginRequest),
    ),
    http.post("/api/v1/logout", handler(handlers["logout"], null, null)),
    http.get(
      "/api/v1/host",
      handler(handlers["getHosts"], schema.GetHostsParams, null),
    ),
    http.post(
      "/api/v1/host",
      handler(handlers["addHost"], null, schema.AddHostRequest),
    ),
    http.get(
      "/api/v1/host/:hostId",
      handler(handlers["getHost"], schema.GetHostParams, null),
    ),
    http.get(
      "/api/v1/host/:hostId/vm",
      handler(handlers["getVmsOnHost"], schema.GetVmsOnHostParams, null),
    ),
    http.post(
      "/api/v1/host/:hostId/network",
      handler(
        handlers["addNetwork"],
        schema.AddNetworkParams,
        schema.AddNetworkRequest,
      ),
    ),
    http.get(
      "/api/v1/host/:hostId/storage",
      handler(
        handlers["getStoragesOnHost"],
        schema.GetStoragesOnHostParams,
        null,
      ),
    ),
    http.post(
      "/api/v1/host/:hostId/storage",
      handler(
        handlers["addStorage"],
        schema.AddStorageParams,
        schema.AddStorageRequest,
      ),
    ),
    http.post(
      "/api/v1/host/:hostId/refresh",
      handler(handlers["refreshHost"], schema.RefreshHostParams, null),
    ),
    http.get(
      "/api/v1/vm",
      handler(handlers["GetVms"], schema.GetVmsParams, null),
    ),
    http.post(
      "/api/v1/vm",
      handler(
        handlers["createVm"],
        null,
        schema.CreateVirtualMachineOnHostRequest,
      ),
    ),
    http.get(
      "/api/v1/vm/:vmId",
      handler(handlers["getVm"], schema.GetVmParams, null),
    ),
    http.get(
      "/api/v1/vm/:vmId/disk",
      handler(handlers["getVmDisks"], schema.GetVmDisksParams, null),
    ),
    http.post(
      "/api/v1/vm/:vmId/poweroff",
      handler(handlers["powerOffVm"], schema.PowerOffVmParams, null),
    ),
    http.post(
      "/api/v1/vm/:vmId/poweron",
      handler(handlers["powerOnVm"], schema.PowerOnVmParams, null),
    ),
    http.post(
      "/api/v1/vm/:vmId/reset",
      handler(handlers["resetVm"], schema.ResetVmParams, null),
    ),
    http.get(
      "/api/v1/storage",
      handler(handlers["getStorages"], schema.GetStoragesParams, null),
    ),
    http.get(
      "/api/v1/storage/:storageId",
      handler(handlers["getStorage"], schema.GetStorageParams, null),
    ),
    http.post(
      "/api/v1/storage/:storageId/upload",
      handler(
        handlers["uploadFile"],
        schema.UploadFileParams,
        schema.UploadFileReq,
      ),
    ),
    http.get(
      "/api/v1/storage/:storageId/files",
      handler(handlers["listFiles"], schema.ListFilesParams, null),
    ),
    http.post(
      "/api/v1/storage/:storageId/files",
      handler(
        handlers["createFile"],
        schema.CreateFileParams,
        schema.CreateFileReq,
      ),
    ),
  ];
}
