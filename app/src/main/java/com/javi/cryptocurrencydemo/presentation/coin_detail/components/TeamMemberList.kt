package com.javi.cryptocurrencydemo.presentation.coin_detail.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.javi.cryptocurrencydemo.data.model.TeamMember
import com.javi.cryptocurrencydemo.domain.model.CoinDetail

@Composable
fun TeamMembersList(teamMembers: List<TeamMember>) {
    LazyColumn {
        items(teamMembers) { teamMember ->
            TeamMemberListItem(teamMember = teamMember)
        }
    }
}

@Preview
@Composable
private fun TeamMembersListPreview() {
    TeamMembersList(CoinDetail.mock().teamMembers)
}