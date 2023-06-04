package com.javi.cryptocurrencydemo.presentation.coin_list

import com.javi.cryptocurrencydemo.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)