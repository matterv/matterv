/*
 *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *  *
 *  * Copyright Loma Technology LLC
 *
 */
import { animated, useTransition } from "@react-spring/web";

import { removeToast, useToastStore } from "~/stores/toast";
import { Toast } from "~/ui/lib/Toast";

export function ToastStack() {
  const toasts = useToastStore((state) => state.toasts);

  const transition = useTransition(toasts, {
    keys: (toast) => toast.id,
    from: { opacity: 0, y: 10, scale: 95 },
    enter: { opacity: 1, y: 0, scale: 100 },
    leave: { opacity: 0, y: 10, scale: 95 },
    config: { duration: 100 },
  });

  return (
    <div className="pointer-events-auto fixed bottom-4 left-4 z-toast flex flex-col items-end space-y-2">
      {transition((style, item) => (
        <animated.div
          style={{
            opacity: style.opacity,
            y: style.y,
            transform: style.scale.to((val) => `scale(${val}%, ${val}%)`),
          }}
        >
          <Toast
            key={item.id}
            {...item.options}
            onClose={() => {
              removeToast(item.id);
              item.options.onClose?.();
            }}
          />
        </animated.div>
      ))}
    </div>
  );
}
