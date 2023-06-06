package com.javi.cryptocurrencydemo.presentation.coin_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.javi.cryptocurrencydemo.domain.model.Coin
import com.javi.cryptocurrencydemo.presentation.coin_list.CoinListViewModel
import com.javi.cryptocurrencydemo.presentation.coin_list.components.CoinListItem

