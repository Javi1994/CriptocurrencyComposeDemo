package com.javi.cryptocurrencydemo.data.model


import com.google.gson.annotations.SerializedName

data class TeamMember(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
) {
    companion object {
        fun mock(): TeamMember {
            return TeamMember(
                id = "Id",
                name = "Name",
                position = "Position"
            )
        }
    }
}