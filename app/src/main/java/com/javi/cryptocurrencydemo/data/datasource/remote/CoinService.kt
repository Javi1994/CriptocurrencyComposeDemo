package com.javi.cryptocurrencydemo.data.datasource.remote

import com.javi.cryptocurrencydemo.data.model.CoinDetailDto
import com.javi.cryptocurrencydemo.data.model.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinService {
    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(
        @Path("coinId") coinId: String
    ): CoinDetailDto
}