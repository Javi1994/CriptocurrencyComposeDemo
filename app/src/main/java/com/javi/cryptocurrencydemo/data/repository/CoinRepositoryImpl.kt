package com.javi.cryptocurrencydemo.data.repository

import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.data.datasource.remote.CoinService
import com.javi.cryptocurrencydemo.data.model.CoinDetailDto
import com.javi.cryptocurrencydemo.data.model.CoinDto
import com.javi.cryptocurrencydemo.domain.repository.CoinRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinService: CoinService
) : CoinRepository {

    override suspend fun getCoins(): Resource<List<CoinDto>> {
        return try {
            Resource.Success(coinService.getCoins())
        } catch (e: HttpException) {
            Resource.Error(e.localizedMessage ?: "")
        } catch (e: IOException) {
            Resource.Error(e.localizedMessage ?: "")
        }
    }

    override suspend fun getCoinById(coinId: String): Resource<CoinDetailDto> {
        return try {
            Resource.Success(coinService.getCoinById(coinId))
        } catch (e: HttpException) {
            Resource.Error(e.localizedMessage ?: "")
        } catch (e: IOException) {
            Resource.Error(e.localizedMessage ?: "")
        }
    }
}