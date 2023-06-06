package com.javi.cryptocurrencydemo.presentation.coin_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javi.cryptocurrencydemo.domain.model.CoinDetail
import com.javi.cryptocurrencydemo.presentation.coin_detail.components.CoinDetailHeader
import com.javi.cryptocurrencydemo.presentation.coin_detail.components.TeamMembersList

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
        Text(
            text = "Tags",
            color = Color.White,
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Team members",
            color = Color.White,
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.size(16.dp))
        TeamMembersList(teamMembers = coinDetail.teamMembers)
    }
}

@Preview
@Composable
private fun CoinDetailScreenPreview() {
    CoinDetailScreen(CoinDetail.mock())
}