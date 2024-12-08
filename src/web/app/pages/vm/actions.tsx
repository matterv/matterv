/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { useCallback } from "react";

import {
  Host,
  instanceCan,
  useApiMutation,
  type VirtualMachine,
} from "@oxide/api";

import { HL } from "~/components/HL";
import { confirmAction } from "~/stores/confirm-action";
import { addToast } from "~/stores/toast";
import type { MakeActions } from "~/table/columns/action-col";

import { fancifyStates } from "./common";

type Options = {
  onSuccess?: () => void;
  // delete needs special behavior on instance detail because you need to nav to
  // instances list. this is starting to be a code smell. if the API of this
  // hook has to expand to encompass the sum of all the APIs of these hooks it
  // call internally, the abstraction is not good
  onDelete?: () => void;
  host: Host;
};

export const useMakeInstanceActions = (
  options: Options,
): MakeActions<VirtualMachine> => {
  const opts = { onSuccess: options.onSuccess };
  const host = { host: options.host };
  const { mutate: startInstance } = useApiMutation("powerOnVm", opts);
  const { mutateAsync: stopInstanceAsync } = useApiMutation("powerOffVm", opts);
  const { mutate: rebootInstance } = useApiMutation("resetVm", opts);

  return useCallback(
    (instance) => {
      const instanceParams = { path: { vmId: instance.id } };
      return [
        {
          label: "Start",
          onActivate() {
            startInstance(instanceParams, {
              onSuccess: () =>
                addToast({ title: `Starting instance '${instance.name}'` }),
              onError: (error) =>
                addToast({
                  variant: "error",
                  title: `Error starting instance '${instance.name}'`,
                  content: error.message,
                }),
            });
          },
          disabled: !instanceCan.start(instance) && (
            <>
              Only {fancifyStates(instanceCan.start.states)} instances can be
              started
            </>
          ),
        },
        {
          label: "Stop",
          onActivate() {
            confirmAction({
              actionType: "danger",
              doAction: () =>
                stopInstanceAsync(instanceParams, {
                  onSuccess: () =>
                    addToast({ title: `Stopping instance '${instance.name}'` }),
                }),
              modalTitle: "Confirm stop instance",
              modalContent: (
                <p>
                  Are you sure you want to stop <HL>{instance.name}</HL>?
                  Stopped instances retain attached disks and IP addresses, but
                  allocated CPU and memory are freed.
                </p>
              ),
              errorTitle: `Error stopping ${instance.name}`,
            });
          },
          disabled: !instanceCan.stop(instance) && (
            <>
              Only {fancifyStates(instanceCan.stop.states)} instances can be
              stopped
            </>
          ),
        },
        {
          label: "Reboot",
          onActivate() {
            rebootInstance(instanceParams, {
              onSuccess: () =>
                addToast({ title: `Rebooting instance '${instance.name}'` }),
              onError: (error) =>
                addToast({
                  variant: "error",
                  title: `Error rebooting instance '${instance.name}'`,
                  content: error.message,
                }),
            });
          },
          disabled: !instanceCan.reboot(instance) && (
            <>
              Only {fancifyStates(instanceCan.reboot.states)} instances can be
              rebooted
            </>
          ),
        },
        {
          label: "Console",
          onActivate() {
            window.open(
              `http://${host.host.name}:8442/vnc?host=${host.host.name}&port=8442&vmId=${instance.vnc?.vmId}`,
              "_blank",
              "noopener,noreferrer",
            );
          },
          disabled: !instanceCan.console(instance) && (
            <>
              Only {fancifyStates(instanceCan.console.states)} instances can use
              console
            </>
          ),
        },
      ];
    },
    [rebootInstance, startInstance, stopInstanceAsync, host],
  );
};
