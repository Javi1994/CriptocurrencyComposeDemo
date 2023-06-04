package com.javi.cryptocurrencydemo.domain

import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.model.Coin
import com.javi.cryptocurrencydemo.domain.repositories.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    suspend operator fun invoke(): List<CoinDto> {
        return coinRepository.getCoins()
    }
}