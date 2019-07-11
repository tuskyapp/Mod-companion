package com.keylesspalace.tuskymoderationcompanion.di

import com.keylesspalace.tuskymoderationcompanion.network.MastodonApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun providesMastodonApi(): MastodonApi {
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://${MastodonApi.PLACEHOLDER_DOMAIN}")
            .build()
        return retrofit.create(MastodonApi::class.java)
    }
}