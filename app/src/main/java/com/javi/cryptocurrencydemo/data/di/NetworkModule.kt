package com.javi.cryptocurrencydemo.data.di

import com.javi.cryptocurrencydemo.data.datasources.remote.CoinService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
    }

    @Provides
    fun provideCoinService(): CoinService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(CoinService::class.java)
    }
}