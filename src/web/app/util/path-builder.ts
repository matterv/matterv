/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import type { PathParams as PP } from '@oxide/api'

// TODO: required versions of path params probably belong somewhere else,
// they're useful

type Project = Required<PP.Project>
type Instance = Required<PP.Instance>
type Vpc = Required<PP.Vpc>
type Silo = Required<PP.Silo>
type IdentityProvider = Required<PP.IdentityProvider>
type Sled = Required<PP.Sled>
type Image = Required<PP.Image>
type Snapshot = Required<PP.Snapshot>
type SiloImage = Required<PP.SiloImage>
type IpPool = Required<PP.IpPool>
type FloatingIp = Required<PP.FloatingIp>
type FirewallRule = Required<PP.FirewallRule>
type VpcRouter = Required<PP.VpcRouter>
type VpcRouterRoute = Required<PP.VpcRouterRoute>
type VpcSubnet = Required<PP.VpcSubnet>

// these are used as the basis for many routes but are not themselves routes we
// ever want to link to. so we use this to build the routes but pb.project() is
// different (includes /instances)
const projectBase = ({ project }: Project) => `${pb.projects()}/${project}`
const instanceBase = (instance: string) => `${pb.instances()}/${instance}`
const vpcBase = ({ project, vpc }: Vpc) => `${pb.vpcs({ project })}/${vpc}`

export const pb = {
  root: () => `${pb.instances()}`,
  projects: () => `/projects`,
  projectsNew: () => `/projects-new`,
  project: (params: Project) => `${projectBase(params)}/instances`,
  projectEdit: (params: Project) => `${projectBase(params)}/edit`,

  projectAccess: (params: Project) => `${projectBase(params)}/access`,
  projectImages: (params: Project) => `${projectBase(params)}/images`,
  projectImagesNew: (params: Project) => `${projectBase(params)}/images-new`,
  projectImage: (params: Image) => `${pb.projectImages(params)}/${params.image}`,
  projectImageEdit: (params: Image) => `${pb.projectImage(params)}/edit`,

  instances: () => `/vms`,
  instancesNew: () => `/vm-new`,
  isoNew: () => `/iso-new`,

  hosts: () => `/hosts`,
  host: (hostId: string) => `/hosts/${hostId}`,
  hostNew: () => `/hosts/new`,
  hostVmNew: (hostId: string) => `${pb.host(hostId)}/vm-new`,
  hostVmNewPath: () => `${pb.hosts()}/:hostId/vm-new`,

  storages: () => `/storages`,
  storage: (storageId: string) => `/storages/${storageId}`,
  storageFiles: (storageId: string, path = '/') =>
    `/storages/${storageId}/files?path=${path}`,

  /**
   * This route exists as a direct link to the default tab of the instance page. Unfortunately
   * we don't currently have a good mechanism at the moment to handle a redirect to the default
   * tab in a seemless way so we need all in-app links to go directly to the default tab.
   *
   * @see https://github.com/oxidecomputer/console/pull/1267#discussion_r1016766205
   */
  instance: (params: string) => instanceBase(params),

  instanceMetrics: (params: string) => `${instanceBase(params)}/metrics`,
  instanceStorage: (params: string) => `${instanceBase(params)}/storage`,
  instanceConnect: (params: string) => `${instanceBase(params)}/connect`,
  instanceNetworking: (params: string) => `${instanceBase(params)}/networking`,
  serialConsole: (params: string) => `${instanceBase(params)}/serial-console`,

  disksNew: (params: Project) => `${projectBase(params)}/disks-new`,
  disks: (params: Project) => `${projectBase(params)}/disks`,

  snapshotsNew: (params: Project) => `${projectBase(params)}/snapshots-new`,
  snapshots: (params: Project) => `${projectBase(params)}/snapshots`,
  snapshotImagesNew: (params: Snapshot) =>
    `${projectBase(params)}/snapshots/${params.snapshot}/images-new`,

  vpcsNew: (params: Project) => `${projectBase(params)}/vpcs-new`,
  vpcs: (params: Project) => `${projectBase(params)}/vpcs`,

  // same deal as instance detail: go straight to first tab
  vpc: (params: Vpc) => pb.vpcFirewallRules(params),
  vpcEdit: (params: Vpc) => `${vpcBase(params)}/edit`,

  vpcFirewallRules: (params: Vpc) => `${vpcBase(params)}/firewall-rules`,
  vpcFirewallRulesNew: (params: Vpc) => `${vpcBase(params)}/firewall-rules-new`,
  vpcFirewallRuleClone: (params: FirewallRule) =>
    `${pb.vpcFirewallRulesNew(params)}/${params.rule}`,
  vpcFirewallRuleEdit: (params: FirewallRule) =>
    `${pb.vpcFirewallRules(params)}/${params.rule}/edit`,
  vpcRouters: (params: Vpc) => `${vpcBase(params)}/routers`,
  vpcRoutersNew: (params: Vpc) => `${vpcBase(params)}/routers-new`,
  vpcRouter: (params: VpcRouter) => `${pb.vpcRouters(params)}/${params.router}`,
  vpcRouterEdit: (params: VpcRouter) => `${pb.vpcRouter(params)}/edit`,
  vpcRouterRouteEdit: (params: VpcRouterRoute) =>
    `${pb.vpcRouter(params)}/routes/${params.route}/edit`,
  vpcRouterRoutesNew: (params: VpcRouter) => `${pb.vpcRouter(params)}/routes-new`,

  vpcSubnets: (params: Vpc) => `${vpcBase(params)}/subnets`,
  vpcSubnetsNew: (params: Vpc) => `${vpcBase(params)}/subnets-new`,
  vpcSubnetsEdit: (params: VpcSubnet) => `${pb.vpcSubnets(params)}/${params.subnet}/edit`,

  floatingIps: (params: Project) => `${projectBase(params)}/floating-ips`,
  floatingIpsNew: (params: Project) => `${projectBase(params)}/floating-ips-new`,
  floatingIp: (params: FloatingIp) => `${pb.floatingIps(params)}/${params.floatingIp}`,
  floatingIpEdit: (params: FloatingIp) => `${pb.floatingIp(params)}/edit`,

  siloUtilization: () => '/utilization',
  siloAccess: () => '/access',
  siloImages: () => '/images',
  siloImage: (params: SiloImage) => `${pb.siloImages()}/${params.image}`,
  siloImageEdit: (params: SiloImage) => `${pb.siloImage(params)}/edit`,

  system: () => '/system',
  systemIssues: () => '/system/issues',
  systemUtilization: () => '/system/utilization',
  systemHealth: () => '/system/health',

  ipPools: () => '/system/networking/ip-pools',
  ipPoolsNew: () => '/system/networking/ip-pools-new',
  ipPool: (params: IpPool) => `${pb.ipPools()}/${params.pool}`,
  ipPoolEdit: (params: IpPool) => `${pb.ipPool(params)}/edit`,
  ipPoolRangeAdd: (params: IpPool) => `${pb.ipPool(params)}/ranges-add`,

  inventory: () => '/system/inventory',
  rackInventory: () => '/system/inventory/racks',
  sledInventory: () => '/system/inventory/sleds',
  diskInventory: () => '/system/inventory/disks',
  sled: ({ sledId }: Sled) => `/system/inventory/sleds/${sledId}`,
  sledInstances: ({ sledId }: Sled) => `/system/inventory/sleds/${sledId}/instances`,

  silos: () => '/system/silos',
  silosNew: () => '/system/silos-new',
  silo: ({ silo }: Silo) => `/system/silos/${silo}`,
  siloIpPools: (params: Silo) => `${pb.silo(params)}?tab=ip-pools`,
  siloIdpsNew: (params: Silo) => `${pb.silo(params)}/idps-new`,
  samlIdp: (params: IdentityProvider) => `${pb.silo(params)}/idps/saml/${params.provider}`,

  profile: () => '/settings/profile',
  sshKeys: () => '/settings/ssh-keys',
  sshKeysNew: () => '/settings/ssh-keys-new',

  deviceSuccess: () => '/device/success',
}

// export const jelly = 'just kidding'
