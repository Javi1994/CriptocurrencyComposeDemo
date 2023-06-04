package com.javi.cryptocurrencydemo.presentation

import androidx.lifecycle.ViewModel
import com.javi.cryptocurrencydemo.domain.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {
    init {

    }

    fun getCoins() {

    }
}