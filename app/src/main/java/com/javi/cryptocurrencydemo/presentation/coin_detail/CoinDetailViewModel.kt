package com.javi.cryptocurrencydemo.presentation.coin_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javi.cryptocurrencydemo.common.Resource
import com.javi.cryptocurrencydemo.domain.use_case.GetCoinByIdUseCase
import com.javi.cryptocurrencydemo.domain.use_case.GetCoinsUseCase
import com.javi.cryptocurrencydemo.presentation.coin_list.CoinListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getCoinByIdUseCase: GetCoinByIdUseCase
) : ViewModel() {

    private fun getCoinDetail() {

    }
}