package com.javi.cryptocurrencydemo.presentation.coin_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javi.cryptocurrencydemo.domain.model.Coin


@Composable
fun CoinListItem(coin: Coin) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = "${coin.rank}. ${coin.name}  (${coin.symbol})",
            color = Color.White
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            text = if (coin.isActive) "active" else "disabled",
            color = if (coin.isActive) Color.Yellow else Color.Red,
            fontStyle = FontStyle.Italic
        )
    }
}

@Preview
@Composable
private fun CoinListItemPreview() {
    CoinListItem(Coin.mock())
}