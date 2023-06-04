package com.javi.cryptocurrencydemo.data.datasources.remote

import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.model.Resource

interface CoinService {
    fun getCoins(): List<CoinDto>
}