package com.javi.cryptocurrencydemo.presentation.coin_detail

import com.javi.cryptocurrencydemo.domain.model.Coin
import com.javi.cryptocurrencydemo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error: String = ""
)