package com.javi.cryptocurrencydemo.domain.model

data class Coin(
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
) {
    companion object {
        fun mock(): Coin {
            return Coin(
                id = "1",
                name = "MyMockedCoin",
                isActive = true,
                isNew = true,
                rank = 1,
                symbol = "MMC",
                type = "",
            )
        }
    }
}