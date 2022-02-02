@file:JvmSynthetic

package com.walletconnect.walletconnectv2.core.scope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

private val job = SupervisorJob()

@get:JvmSynthetic
internal val scope = CoroutineScope(job + Dispatchers.IO)
