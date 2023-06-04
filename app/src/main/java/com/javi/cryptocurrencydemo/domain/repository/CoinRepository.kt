package com.javi.cryptocurrencydemo.domain.repository

import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.data.model.CoinDto

interface CoinRepository {
    suspend fun getCoins(): Resource<List<CoinDto>>
}