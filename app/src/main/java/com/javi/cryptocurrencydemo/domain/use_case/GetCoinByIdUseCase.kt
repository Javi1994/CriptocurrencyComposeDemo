package com.javi.cryptocurrencydemo.domain.use_case

import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.domain.model.CoinDetail
import com.javi.cryptocurrencydemo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinByIdUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return flow {
            emit(Resource.Loading())
            val result = coinRepository.getCoinById(coinId)
            if (result is Resource.Success) {
                val coinDetail = result.data?.toCoinDetail()
                emit(Resource.Success(coinDetail!!))
            } else {
                emit(Resource.Error(result.message ?: ""))
            }
        }
    }
}