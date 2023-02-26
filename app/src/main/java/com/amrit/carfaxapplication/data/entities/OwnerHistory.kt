package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class OwnerHistory(
    @SerializedName("history") var history: ArrayList<History> = arrayListOf(),
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("iconUrl") var iconUrl: String? = null,
    @SerializedName("text") var text: String? = null
)

data class History(
    @SerializedName("city") var city: String? = null,
    @SerializedName("endOwnershipDate") var endOwnershipDate: String? = null,
    @SerializedName("ownerNumber") var ownerNumber: Int? = null,
    @SerializedName("purchaseDate") var purchaseDate: String? = null,
    @SerializedName("state") var state: String? = null
)
