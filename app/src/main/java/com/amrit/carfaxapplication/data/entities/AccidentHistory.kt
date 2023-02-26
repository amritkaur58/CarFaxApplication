package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class AccidentHistory(
    @SerializedName("accidentSummary") var accidentSummary: ArrayList<String> = arrayListOf(),
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("iconUrl") var iconUrl: String? = null,
    @SerializedName("text") var text: String? = null
)
