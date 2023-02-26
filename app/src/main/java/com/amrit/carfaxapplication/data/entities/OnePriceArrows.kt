package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class OnePriceArrows(
    @SerializedName("arrow") var arrow: String? = null,
    @SerializedName("arrowUrl") var arrowUrl: String? = null,
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("iconUrl") var iconUrl: String? = null,
    @SerializedName("order") var order: Int? = null,
    @SerializedName("text") var text: String? = null
)
