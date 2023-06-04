package com.javi.cryptocurrencydemo.data.model

import com.google.gson.annotations.SerializedName
import com.javi.cryptocurrencydemo.domain.model.Coin

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
) {
    fun toCoin(): Coin {
        return Coin(
            id = this.id,
            isActive = this.isActive,
            isNew = this.isNew,
            name = this.name,
            rank = this.rank,
            symbol = this.symbol,
            type = this.type
        )
    }
}