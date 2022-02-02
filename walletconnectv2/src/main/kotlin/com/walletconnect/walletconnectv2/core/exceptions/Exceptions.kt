package com.walletconnect.walletconnectv2.core.exceptions

sealed class WalletConnectException(override val message: String?) : Exception(message) {
    class ProjectIdDoesNotExistException(override val message: String?) : WalletConnectException(message)
    class InvalidProjectIdException(override val message: String?) : WalletConnectException(message)
    class GenericException(override val message: String?) : WalletConnectException(message)

    class UnauthorizedPeerException(override val message: String?) : WalletConnectException(message)
    class InvalidSessionPermissionsException(override val message: String?) : WalletConnectException(message)

    class CannotFindSequenceForTopic(override val message: String?) : WalletConnectException(message)
    class PairWithExistingPairingIsNotAllowed(override val message: String?) : WalletConnectException(message)
}