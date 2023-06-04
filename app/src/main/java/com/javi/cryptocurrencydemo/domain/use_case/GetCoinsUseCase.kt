package com.javi.cryptocurrencydemo.domain.use_case

import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.model.Coin
import com.javi.cryptocurrencydemo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> {
        return flow {
            emit(Resource.Loading())
            val result = coinRepository.getCoins()
            if (result is Resource.Success) {
                val coins = result.data?.map {
                    it.toCoin()
                } ?: emptyList()
                emit(Resource.Success(coins))
            } else {
                emit(Resource.Error(result.message ?: ""))
            }
        }
    }
}