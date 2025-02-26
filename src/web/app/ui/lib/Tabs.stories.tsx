/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { Badge } from '~/ui/lib/Badge'

import { Tabs } from './Tabs'

export const Default = () => (
  <Tabs.Root id="default" defaultValue="hello">
    <Tabs.List aria-label="A simple example of the tabs component">
      <Tabs.Trigger value="hello">hello</Tabs.Trigger>
      <Tabs.Trigger value="world">world</Tabs.Trigger>
    </Tabs.List>
    <Tabs.Content value="hello">tab view 1</Tabs.Content>
    <Tabs.Content value="world">tab view 2</Tabs.Content>
  </Tabs.Root>
)

export const WithItemCount = () => (
  <Tabs.Root id="with-item-count" defaultValue="no-items">
    <Tabs.List aria-label="An example of the tabs component with a badge">
      <Tabs.Trigger value="no-items">no items</Tabs.Trigger>
      <Tabs.Trigger value="items">
        items <Badge>1</Badge>
      </Tabs.Trigger>
    </Tabs.List>
    <Tabs.Content value="no-items">Nothing to see here</Tabs.Content>
    <Tabs.Content value="items">You have 4 unread messages</Tabs.Content>
  </Tabs.Root>
)
