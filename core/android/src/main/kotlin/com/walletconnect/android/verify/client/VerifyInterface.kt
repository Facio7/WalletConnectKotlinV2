package com.walletconnect.android.verify.client

import com.walletconnect.android.verify.domain.AttestationResult

interface VerifyInterface {
    fun initialize()
    fun register(attestationId: String, onSuccess: () -> Unit, onError: (Throwable) -> Unit)
    fun resolve(attestationId: String, onSuccess: (AttestationResult) -> Unit, onError: (Throwable) -> Unit)
}