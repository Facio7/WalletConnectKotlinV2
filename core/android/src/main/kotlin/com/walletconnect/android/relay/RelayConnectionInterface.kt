package com.walletconnect.android.relay

import com.walletconnect.android.Core
import com.walletconnect.foundation.network.RelayInterface
import kotlinx.coroutines.flow.StateFlow

@Deprecated("com.walletconnect.android.relay.RelayConnectionInterface has been deprecated. Please use com.reown.android.relay.RelayConnectionInterface instead from - https://github.com/reown-com/reown-kotlin")
interface RelayConnectionInterface : RelayInterface {
    val wssConnectionState: StateFlow<WSSConnectionState>
    val isNetworkAvailable: StateFlow<Boolean?>

    @Deprecated("This has become deprecate in favor of the onError returning Core.Model.Error", ReplaceWith("this.connect(onErrorModel)"))
    fun connect(onErrorModel: (Core.Model.Error) -> Unit = {}, onError: (String) -> Unit)
    fun connect(onError: (Core.Model.Error) -> Unit)
    @Deprecated("This has become deprecate in favor of the onError returning Core.Model.Error", ReplaceWith("this.disconnect(onErrorModel)"))
    fun disconnect(onErrorModel: (Core.Model.Error) -> Unit = {}, onError: (String) -> Unit)
    fun disconnect(onError: (Core.Model.Error) -> Unit)

    fun restart(onError: (Core.Model.Error) -> Unit)
}