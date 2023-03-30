@file:JvmSynthetic

package com.walletconnect.chat.di

import com.walletconnect.utils.addSdkBitset
import org.koin.dsl.module
import java.util.*

private const val BIT_ORDER = 2 // https://github.com/WalletConnect/walletconnect-docs/blob/main/docs/specs/clients/core/relay/relay-user-agent.md#schema
private val bitset: BitSet
    get() = BitSet(BIT_ORDER).apply {
        set(BIT_ORDER, true)
    }

@JvmSynthetic
internal fun commonModule() = module {

    addSdkBitset("ChatSDK", bitset)
}