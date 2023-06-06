package com.javi.cryptocurrencydemo.presentation.coin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.javi.cryptocurrencydemo.presentation.Screen
import com.javi.cryptocurrencydemo.presentation.coin_list.components.CoinListItem

@Composable
fun CoinListScreen(
    navController: NavController? = null,
    viewModel: CoinListViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        LazyColumn {
            items(state.coins) { coin ->
                CoinListItem(coin = coin) {
                    navController?.navigate(
                        Screen.CoinDetailScreen.route + "/${coin.id}"
                    )
                }
            }
        }
    }
}