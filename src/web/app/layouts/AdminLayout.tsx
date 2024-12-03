/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { type ReactElement } from 'react'

import {
  Instances16Icon,
  Servers16Icon,
  Storage16Icon,
} from '@oxide/design-system/icons/react'

import { TopBar } from '~/components/TopBar'
import { SiloSystemPicker } from '~/components/TopBarPicker'
import { pb } from '~/util/path-builder.ts'

import { NavLinkItem, Sidebar } from '../components/Sidebar'
import { ContentPane, PageContainer } from './helpers'

type ProjectLayoutProps = {
  /** Sometimes we need a different layout for the content pane. Like
   * `<ContentPane />`, the element passed here should contain an `<Outlet />`.
   */
  overrideContentPane?: ReactElement
}

export function AdminLayout({ overrideContentPane }: ProjectLayoutProps) {
  return (
    <PageContainer>
      <TopBar>
        <SiloSystemPicker value="system" />
      </TopBar>
      <Sidebar>
        <Sidebar.Nav>
          <NavLinkItem to={pb.instances()}>
            <Instances16Icon /> Instances
          </NavLinkItem>
          <NavLinkItem to={pb.hosts()}>
            <Servers16Icon /> Hosts
          </NavLinkItem>
          <NavLinkItem to={pb.storages()}>
            <Storage16Icon /> Storages
          </NavLinkItem>
        </Sidebar.Nav>
      </Sidebar>
      {overrideContentPane || <ContentPane />}
    </PageContainer>
  )
}
