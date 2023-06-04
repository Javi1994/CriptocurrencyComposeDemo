package com.javi.cryptocurrencydemo.domain.repositories

import com.javi.cryptocurrencydemo.data.model.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
}