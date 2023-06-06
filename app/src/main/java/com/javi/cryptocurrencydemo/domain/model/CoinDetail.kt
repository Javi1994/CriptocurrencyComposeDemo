package com.javi.cryptocurrencydemo.domain.model


import com.google.gson.annotations.SerializedName
import com.javi.cryptocurrencydemo.data.model.Links
import com.javi.cryptocurrencydemo.data.model.LinksExtended
import com.javi.cryptocurrencydemo.data.model.Tag
import com.javi.cryptocurrencydemo.data.model.TeamMember
import com.javi.cryptocurrencydemo.data.model.Whitepaper

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
)