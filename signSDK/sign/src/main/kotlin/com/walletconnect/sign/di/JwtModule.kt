package com.walletconnect.sign.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.walletconnect.sign.crypto.data.repository.JwtRepository
import com.walletconnect.sign.network.data.service.NonceService
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@JvmSynthetic
internal fun jwtModule() = module {

    single(named(name = "jwtMoshi")) {
        Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    single {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(get(named(name = "jwtMoshi"))))
            .baseUrl("https://relay.walletconnect.com/")
            .build()
    }

    single {
        get<Retrofit>().create(NonceService::class.java)
    }

    single {
        JwtRepository(get())
    }
}