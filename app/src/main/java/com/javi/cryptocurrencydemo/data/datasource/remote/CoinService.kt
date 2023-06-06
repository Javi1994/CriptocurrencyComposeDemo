package com.javi.cryptocurrencydemo.data.datasource.remote

import com.javi.cryptocurrencydemo.data.model.CoinDetailDto
import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.model.CoinDetail
import retrofit2.http.GET

interface CoinService {
    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoins(coinId: String): CoinDetailDto
}