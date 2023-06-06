package com.javi.cryptocurrencydemo.presentation.coin_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.javi.cryptocurrencydemo.presentation.coin_detail.components.CoinDetailHeader
import com.javi.cryptocurrencydemo.presentation.coin_detail.components.TeamMembersList

@Composable
fun CoinDetailScreen(
    viewModel: CoinDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        state.coinDetail?.let { coinDetail ->
            Column {
                CoinDetailHeader(coinDetail)
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = coinDetail.description, color = Color.White)
                Spacer(modifier = Modifier.size(8.dp))

                if (coinDetail.tags.isNotEmpty()) {
                    Text(
                        text = "Tags",
                        color = Color.White,
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                }

                if (coinDetail.teamMembers.isNotEmpty()) {
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
        }

        if (state.error.isNotBlank()) {
            Text(
                text = state.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .align(Alignment.Center)
            )
        }

        if (state.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}