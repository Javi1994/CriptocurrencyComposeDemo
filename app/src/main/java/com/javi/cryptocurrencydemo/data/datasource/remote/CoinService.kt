package com.javi.cryptocurrencydemo.data.datasource.remote

import com.javi.cryptocurrencydemo.data.model.CoinDto
import retrofit2.http.GET

interface CoinService {
    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>
}