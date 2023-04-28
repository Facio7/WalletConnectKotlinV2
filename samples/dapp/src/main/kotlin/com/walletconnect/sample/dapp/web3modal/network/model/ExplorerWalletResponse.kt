package com.walletconnect.sample.dapp.web3modal.network.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExplorerWalletResponse(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "description")
    val description: String?,
    @Json(name = "homepage")
    val homePage: String,
    @Json(name = "image_id")
    val imageId: String,
    @Json(name = "chains")
    val chains: List<String>,
    @Json(name = "image_url")
    val images: WalletIcons,
    @Json(name = "sdks")
    val sdks: List<String>,
    @Json(name = "versions")
    val versions: List<String>,
    @Json(name = "mobile")
    val mobile: Mobile,
    @Json(name = "app")
    val app: App,
)

@JsonClass(generateAdapter = true)
data class Mobile(
    @Json(name = "native")
    val native: String,
    @Json(name = "universal")
    val universal: String?
)

@JsonClass(generateAdapter = true)
data class App(
    @Json(name = "android")
    val android: String?
)

@JsonClass(generateAdapter = true)
data class WalletIcons(
    @Json(name = "sm")
    val small: String,
    @Json(name = "md")
    val medium: String,
    @Json(name = "lg")
    val large: String
)