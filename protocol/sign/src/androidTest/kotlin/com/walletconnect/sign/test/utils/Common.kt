package com.walletconnect.sign.test.utils

import com.walletconnect.android.Core
import com.walletconnect.sign.client.Sign
import com.walletconnect.util.bytesToHex
import com.walletconnect.util.randomBytes
import junit.framework.TestCase.fail
import timber.log.Timber

internal fun globalOnError(error: Sign.Model.Error) {
    Timber.e("globalOnError: ${error.throwable.stackTraceToString()}")
    fail(error.throwable.message)
}

internal fun globalOnError(error: Core.Model.Error) {
    Timber.e("globalOnError: ${error.throwable.stackTraceToString()}")
    fail(error.throwable.message)
}


const val sessionNamespaceKey = "eip155"
val sessionChains = listOf("eip155:1")
val sessionAccounts = listOf("eip155:1:0xab16a96d359ec26a11e2c2b3d8f8b8942d5bfcdb")
val sessionMethods = listOf("someMethod")
val sessionEvents = listOf("someEvent")

val sessionNamespace = Sign.Model.Namespace.Session(sessionChains, sessionAccounts, sessionMethods, sessionEvents)
val proposalNamespace = Sign.Model.Namespace.Proposal(sessionChains, sessionMethods, sessionEvents)

val proposalNamespaces: Map<String, Sign.Model.Namespace.Proposal> = mapOf(sessionNamespaceKey to proposalNamespace)
val sessionNamespaces: Map<String, Sign.Model.Namespace.Session> = mapOf(sessionNamespaceKey to sessionNamespace)

val payloadParams = Sign.Model.PayloadParams(
    type = "caip222",
    chains = listOf("eip155:1", "eip155:37"),
    domain = "sample.dapp",
    aud = "https://react-auth-dapp.vercel.app/",
    version = "2",
    nonce = randomBytes(12).bytesToHex(),
    iat = "2023-12-14T14:15:55.440Z",
    exp = null,
    nbf = null,
    statement = "Sign in with wallet.",
    requestId = null,
    resources = null
)