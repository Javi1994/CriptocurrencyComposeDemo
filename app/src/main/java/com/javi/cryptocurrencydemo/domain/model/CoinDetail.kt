package com.javi.cryptocurrencydemo.domain.model


import com.javi.cryptocurrencydemo.data.model.Tag
import com.javi.cryptocurrencydemo.data.model.TeamMember

data class CoinDetail(
    val description: String,
    val id: String,
    val isActive: Boolean,
    val message: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<Tag>,
    val teamMembers: List<TeamMember>,
) {
    companion object {
        fun mock(): CoinDetail {
            return CoinDetail(
                description = "This is a description",
                id = "Id",
                isActive = true,
                message = "This is a message",
                name = "MyCoinName",
                rank = 1,
                symbol = "MCN",
                tags = emptyList(),
                teamMembers = listOf(
                    TeamMember.mock(),
                    TeamMember.mock(),
                    TeamMember.mock(),
                    TeamMember.mock(),
                    TeamMember.mock(),
                )
            )
        }
    }
}