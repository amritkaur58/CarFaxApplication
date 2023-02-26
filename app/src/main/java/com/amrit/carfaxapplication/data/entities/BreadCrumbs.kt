package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class BreadCrumbs( @SerializedName("label"    ) var label    : String? = null,
                        @SerializedName("link"     ) var link     : String? = null,
                        @SerializedName("position" ) var position : Int?    = null)
