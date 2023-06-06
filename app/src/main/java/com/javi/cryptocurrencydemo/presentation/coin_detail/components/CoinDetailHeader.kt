package com.javi.cryptocurrencydemo.presentation.coin_detail.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.javi.cryptocurrencydemo.domain.model.CoinDetail

@Composable
fun CoinDetailHeader(coinDetail: CoinDetail) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = "${coinDetail.rank}. ${coinDetail.name}  (${coinDetail.symbol})",
            color = Color.White,
            fontSize = 24.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            text = if (coinDetail.isActive) "active" else "disabled",
            color = if (coinDetail.isActive) Color.Yellow else Color.Red,
            fontStyle = FontStyle.Italic,
            fontSize = 24.sp,
        )
    }
}

@Preview
@Composable
private fun CoinDetailHeaderPreview() {
    CoinDetailHeader(CoinDetail.mock())
}