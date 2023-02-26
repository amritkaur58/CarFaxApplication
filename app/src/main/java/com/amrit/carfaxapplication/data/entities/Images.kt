package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("baseUrl") var baseUrl: String? = null,
    @SerializedName("firstPhoto") var firstPhoto: FirstPhoto? = FirstPhoto(),
    @SerializedName("large") var large: ArrayList<String> = arrayListOf(),
    @SerializedName("medium") var medium: ArrayList<String> = arrayListOf(),
    @SerializedName("small") var small: ArrayList<String> = arrayListOf()
)
data class FirstPhoto(
    @SerializedName("large") var large: String? = null,
    @SerializedName("medium") var medium: String? = null,
    @SerializedName("small") var small: String? = null
)