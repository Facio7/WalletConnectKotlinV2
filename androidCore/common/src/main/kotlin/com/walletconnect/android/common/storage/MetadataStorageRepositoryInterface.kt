package com.walletconnect.android.common.storage

import com.walletconnect.android.common.model.AppMetaDataType
import com.walletconnect.android.common.model.AppMetaData
import com.walletconnect.foundation.common.model.Topic

interface MetadataStorageRepositoryInterface {

    fun insertOrAbortMetadata(topic: Topic, appMetaData: AppMetaData, appMetaDataType: AppMetaDataType)

    fun updateMetaData(topic: Topic, appMetaData: AppMetaData, appMetaDataType: AppMetaDataType)

    fun deleteMetaData(topic: Topic)

    fun existsByTopic(topic: Topic): Boolean

    fun getByTopicAndType(topic: Topic, type: AppMetaDataType): AppMetaData

    fun upsertPairingPeerMetadata(topic: Topic, appMetaData: AppMetaData, appMetaDataType: AppMetaDataType)
}