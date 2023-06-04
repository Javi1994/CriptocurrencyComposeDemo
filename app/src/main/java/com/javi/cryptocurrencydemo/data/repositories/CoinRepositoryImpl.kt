package com.javi.cryptocurrencydemo.data.repositories

import com.javi.cryptocurrencydemo.data.datasources.remote.CoinService
import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinService: CoinService
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return coinService.getCoins()
    }
}