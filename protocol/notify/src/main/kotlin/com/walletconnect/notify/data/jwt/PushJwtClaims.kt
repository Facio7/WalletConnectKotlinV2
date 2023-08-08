package com.walletconnect.notify.data.jwt

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.walletconnect.foundation.util.jwt.JwtClaims

@JsonClass(generateAdapter = true)
data class NotifySubscriptionJwtClaim(
    @Json(name = "iss") override val issuer: String,
    @Json(name = "sub") val subject: String,
    @Json(name = "aud") val audience: String,
    @Json(name = "iat") val issuedAt: Long,
    @Json(name = "exp") val expiration: Long,
    @Json(name = "ksu") val keyserverUrl: String,
    @Json(name = "act") val action: String = "notify_subscription",
    @Json(name = "scp") val scope: String,
) : JwtClaims