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
  useController,
  type Control,
  type FieldPath,
  type FieldValues,
} from "react-hook-form";

import { Checkbox, type CheckboxProps } from "~/ui/lib/Checkbox";

type CheckboxFieldProps<
  TFieldValues extends FieldValues,
  TName extends FieldPath<TFieldValues>,
> = Omit<CheckboxProps, "name"> & {
  name: TName;
  control: Control<TFieldValues>;
};

export const CheckboxField = <
  TFieldValues extends FieldValues,
  TName extends FieldPath<TFieldValues>,
>({
  control,
  name,
  ...props
}: CheckboxFieldProps<TFieldValues, TName>) => {
  const {
    field: { onChange, value },
  } = useController({ name, control });
  return (
    <Checkbox
      {...props}
      // If value is an array, we're dealing with a set of checkboxes that
      // have the same name and different `value` attrs, and are therefore
      // supposed to produce an array of the values that are checked. `value`
      // is the value in form state, which can be a bool or array.
      // `props.value` is the value string of the current checkbox, which is
      // only relevant in the array case
      onChange={(e) => {
        if (Array.isArray(value) && props.value) {
          // it's one of a set of checkboxes. if it was just checked, we're
          // adding it to the array, otherwise we're removing it
          const valueArray = value as string[];
          const newValue = e.target.checked
            ? [...valueArray, props.value]
            : valueArray.filter((x) => x !== props.value);
          onChange(newValue);
        } else {
          // it's a single checkbox
          onChange(e.target.checked);
        }
      }}
      checked={Array.isArray(value) ? value.includes(props.value) : value}
    />
  );
};
