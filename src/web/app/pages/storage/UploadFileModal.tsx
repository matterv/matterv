import { filesize } from 'filesize'
import pMap from 'p-map'
import pRetry from 'p-retry'
import React, { useRef, useState } from 'react'
import { useForm } from 'react-hook-form'

import { useApiMutation, useApiQueryClient } from '~/api'
import { FileField } from '~/components/form/fields/FileField.tsx'
import { useStorageParams } from '~/hooks/use-params.ts'
import { Modal } from '~/ui/lib/Modal.tsx'
import { Progress } from '~/ui/lib/Progress.tsx'
import { anySignal } from '~/util/abort.ts'
import { readBlobAsBase64 } from '~/util/file.ts'
import { isAllZeros } from '~/util/str.ts'
import { MiB } from '~/util/units.ts'

type UploadFileValue = {
  imageFile: File | null
}
const ABORT_ERROR = new Error('Upload canceled')

const CHUNK_SIZE_BYTES = 1 * MiB

// subset of the mutation state we care about
type MutationState = {
  isPending: boolean
  isSuccess: boolean
  isError: boolean
}

const initSyntheticState: MutationState = {
  isPending: false,
  isSuccess: false,
  isError: false,
}
const fsize = (bytes: number) => filesize(bytes, { base: 2, pad: true })

function UploadProgressBar({
  file,
  uploadProgress,
}: {
  file: File
  uploadProgress: number
}) {
  return (
    <div className="rounded-lg border bg-default border-default">
      <div className="flex justify-between border-b p-3 pb-2 border-b-secondary">
        <div className="text-sans-md text-default">Uploading progress</div>
        {/* cancel and/or pause buttons could go here */}
      </div>
      <div className="p-3 pt-2">
        <div className="flex justify-between text-mono-sm">
          <div className="!normal-case text-secondary">
            {fsize((uploadProgress / 100) * file.size)}{' '}
            <span className="text-quinary">/</span> {fsize(file.size)}
          </div>
          <div className="text-accent">{uploadProgress}%</div>
        </div>
        <Progress className="mt-1.5" aria-label="Upload progress" value={uploadProgress} />
      </div>
    </div>
  )
}

export const UploadFileModal = ({
  onDismiss,
  currentDir,
}: {
  onDismiss: () => void
  currentDir: string
}) => {
  const { storageId } = useStorageParams()
  const [syntheticUploadState, setSyntheticUploadState] =
    useState<MutationState>(initSyntheticState)
  const [uploadProgress, setUploadProgress] = useState(0)
  const abortController = useRef<AbortController | null>(null)
  const queryClient = useApiQueryClient()

  const uploadChunk = useApiMutation('uploadFile')
  const createFile = useApiMutation('createFile')

  const onSubmit = async (req: UploadFileValue) => {
    setSyntheticUploadState({ isPending: true, isSuccess: false, isError: false })
    abortController.current = new AbortController()

    const imageFile = req.imageFile!
    let chunksProcessed = 0
    const nChunks = Math.ceil(imageFile.size / CHUNK_SIZE_BYTES)

    const postChunk = async (i: number) => {
      const offset = i * CHUNK_SIZE_BYTES
      const end = Math.min(offset + CHUNK_SIZE_BYTES, imageFile.size)
      const base64EncodedData = await readBlobAsBase64(imageFile.slice(offset, end))

      // Disk space is all zeros by default, so we can skip any chunks that are
      // all zeros. It turns out this happens a lot.
      if (!isAllZeros(base64EncodedData)) {
        await uploadChunk
          .mutateAsync({
            path: { storageId },
            body: {
              offset,
              data: base64EncodedData,
              filePath: currentDir + '/' + imageFile.name,
            },
            // use both the abort signal for the whole upload and a per-request timeout
            signal: anySignal([
              AbortSignal.timeout(30000),
              abortController.current?.signal,
            ]),
          })
          .catch(() => {
            // this needs to throw a regular Error or pRetry gets mad
            throw Error(`Chunk ${i} (offset ${offset}) failed`)
          })
      }
      chunksProcessed++
      setUploadProgress(Math.round((100 * chunksProcessed) / nChunks))
    }

    // avoid pointless array of size 4000 for a 2gb image
    function* genChunks() {
      for (let i = 0; i < nChunks; i++) yield i
    }

    // will throw if aborted or if requests error out
    try {
      await createFile.mutateAsync({
        path: { storageId },
        body: { path: currentDir, name: imageFile.name, type: 'file' },
      })

      await pMap(
        genChunks(),
        (i) => pRetry(() => postChunk(i), { retries: 2 }),
        // browser can only do 6 fetches at once, so we only read 6 chunks at once
        { concurrency: 6, signal: abortController.current?.signal }
      )
    } catch (e) {
      if (e !== ABORT_ERROR) {
        setSyntheticUploadState({ isPending: false, isSuccess: false, isError: true })
      }
      throw e // rethrow to get the usual the error handling in the wrapper function
    }

    setSyntheticUploadState({ isPending: false, isSuccess: true, isError: false })
    queryClient.invalidateQueries('listFiles')
    onDismiss()
  }

  function cleanup() {
    setSyntheticUploadState({ isPending: false, isSuccess: false, isError: false })
    setUploadProgress(0)
    abortController.current?.abort(ABORT_ERROR)
  }

  const defaultValues: UploadFileValue = {
    imageFile: null,
  }
  const { control, handleSubmit, watch } = useForm({ defaultValues })
  const file = watch('imageFile')

  function closeModal() {
    if (syntheticUploadState.isPending) {
      if (!confirm('Are you sure to cancel the upload?')) {
        return
      }
    }
    cleanup()
    onDismiss()
  }

  return (
    <Modal isOpen onDismiss={closeModal} title="Upload a file">
      <Modal.Body>
        <Modal.Section>
          <form
            autoComplete="off"
            onSubmit={(e) => {
              e.stopPropagation()
            }}
            className="space-y-4"
          >
            <FileField
              id="image-file-input"
              name="imageFile"
              label="File"
              disabled={syntheticUploadState.isPending}
              required
              control={control}
            />
            {syntheticUploadState.isPending && file && (
              <UploadProgressBar file={file} uploadProgress={uploadProgress} />
            )}
          </form>
        </Modal.Section>
      </Modal.Body>
      <Modal.Footer
        onDismiss={closeModal}
        actionLoading={syntheticUploadState.isPending}
        actionText={syntheticUploadState.isPending ? 'OK' : 'Upload file'}
        onAction={handleSubmit(onSubmit)}
      />
    </Modal>
  )
}
