package com.javi.cryptocurrencydemo.domain.di

import com.javi.cryptocurrencydemo.data.datasource.remote.CoinService
import com.javi.cryptocurrencydemo.data.repository.CoinRepositoryImpl
import com.javi.cryptocurrencydemo.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun providesCoinRepository(coinService: CoinService): CoinRepository {
        return CoinRepositoryImpl(coinService)
    }
}