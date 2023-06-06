package com.javi.cryptocurrencydemo.domain.repository

import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.data.model.CoinDetailDto
import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.model.CoinDetail

interface CoinRepository {
    suspend fun getCoins(): Resource<List<CoinDto>>
    suspend fun getCoinDetail(coinId: String): Resource<CoinDetailDto>
}