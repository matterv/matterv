/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright Oxide Computer Company
 */
import { useEffect } from 'react'
import { useForm } from 'react-hook-form'
import { useNavigate } from 'react-router-dom'

import {LoginRequest, useApiMutation} from '@oxide/api'

import {TextField, TextFieldInner} from '~/components/form/fields/TextField'
import { addToast } from '~/stores/toast'
import { Button } from '~/ui/lib/Button'
import { Identicon } from '~/ui/lib/Identicon'
import { pb } from '~/util/path-builder'
import {Textarea} from "@headlessui/react";

const defaultValues: LoginRequest = {
  username: '',
  password: '',
}

/** Username/password form for local silo login */
export function LoginPage() {
  const navigate = useNavigate()

  const form = useForm({ defaultValues })

  const loginPost = useApiMutation('login')

  useEffect(() => {
    if (loginPost.isSuccess) {
      addToast({ title: 'Logged in' })
      navigate( pb.instances())
    }
  }, [loginPost.isSuccess, navigate])

  return (
      <>
        <form
            className="items-center space-y-4 "
            onSubmit={form.handleSubmit((body) => {
              loginPost.mutate({body})
            })}
        >
          <div className="text-sans-2xl text-default">Welcome to MatterV</div>

          <div>
            <TextFieldInner
                name="username"
                placeholder="Username"
                autoComplete="username"
                required
                control={form.control}
            />
          </div>
          <div>
            <TextFieldInner
                name="password"
                type="password"
                placeholder="Password"
                required
                control={form.control}
            />
          </div>
          <Button type="submit" className="w-full" disabled={loginPost.isPending}>
            Sign in
          </Button>
          {loginPost.isError && (
              <div className="text-center text-error">Could not sign in. Please try again.</div>
          )}
        </form>
      </>
  )
}
