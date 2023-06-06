package com.javi.cryptocurrencydemo.presentation.coin_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.javi.cryptocurrencydemo.domain.model.CoinDetail
import com.javi.cryptocurrencydemo.presentation.coin_detail.components.TeamMemberListItem

@Composable
fun CoinDetailScreen(
    coinDetail: CoinDetail,
    //viewModel: CoinDetailViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        CoinDetailHeader(coinDetail)
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = coinDetail.description, color = Color.White)
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Tags", color = Color.White)
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Team members", color = Color.White)
        Spacer(modifier = Modifier.size(8.dp))
        LazyColumn {
            items(coinDetail.teamMembers) { teamMember ->
                TeamMemberListItem(teamMember = teamMember)
            }
        }
    }
}

@Composable
fun CoinDetailHeader(coinDetail: CoinDetail) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = "${coinDetail.rank}. ${coinDetail.name}  (${coinDetail.symbol})",
            color = Color.White
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            text = if (coinDetail.isActive) "active" else "disabled",
            color = if (coinDetail.isActive) Color.Yellow else Color.Red,
            fontStyle = FontStyle.Italic
        )
    }
}

@Preview
@Composable
fun CoinDetailScreenPreview() {
    CoinDetailScreen(CoinDetail.mock())
}