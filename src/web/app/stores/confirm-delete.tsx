/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */

import { HL } from '~/components/HL'

import { useConfirmAction } from './confirm-action'

// confirmAction was originally abstracted from confirmDelete. this preserves
// the existing confirmDelete API by constructing a confirmAction from it

type DeleteConfig = {
  /** Must be `mutateAsync`, otherwise we can't catch the error generically */
  doDelete: () => Promise<unknown>
  /**
   * Label identifying the resource. Could be a name or something more elaborate
   * "the Admin role for user Harry Styles". If a string, the modal will
   * automatically give it a highlighted style. Otherwise it will be rendered
   * directly.
   */
  label: React.ReactNode
  resourceKind?: string
  extraContent?: React.ReactNode
}

export const confirmDelete =
  ({ doDelete, label, resourceKind, extraContent }: DeleteConfig) =>
  () => {
    const displayLabel = typeof label === 'string' ? <HL>{label}</HL> : label
    const modalTitle = resourceKind ? `Confirm delete ${resourceKind}` : 'Confirm delete'
    useConfirmAction.setState({
      actionConfig: {
        doAction: doDelete,
        modalContent: (
          <p>
            Are you sure you want to delete {displayLabel}? {extraContent}
          </p>
        ),
        errorTitle: 'Could not delete resource',
        modalTitle,
        actionType: 'danger',
      },
    })
  }
