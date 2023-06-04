package com.javi.cryptocurrencydemo.domain.di

import com.javi.cryptocurrencydemo.data.datasources.remote.CoinService
import com.javi.cryptocurrencydemo.data.repositories.CoinRepositoryImpl
import com.javi.cryptocurrencydemo.domain.repositories.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun providesCoinRepository(coinService: CoinService): CoinRepository {
        return CoinRepositoryImpl(coinService)
    }
}