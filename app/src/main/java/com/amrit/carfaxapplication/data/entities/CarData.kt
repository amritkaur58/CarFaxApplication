package com.amrit.carfaxapplication.data.entities

import androidx.room.Entity
import com.google.gson.annotations.SerializedName


data class CarData(
    @SerializedName("backfillCount"     ) var backfillCount     : Int?                   = null,
    @SerializedName("breadCrumbs"       ) var breadCrumbs       : ArrayList<BreadCrumbs> = arrayListOf(),
    @SerializedName("dealerNewCount"    ) var dealerNewCount    : Int?                   = null,
    @SerializedName("dealerUsedCount"   ) var dealerUsedCount   : Int?                   = null,
    @SerializedName("enhancedCount"     ) var enhancedCount     : Int?                   = null,
    @SerializedName("listings"          ) var listings          : ArrayList<Listings>    = arrayListOf(),
    @SerializedName("page"              ) var page              : Int?                   = null,
    @SerializedName("pageSize"          ) var pageSize          : Int?                   = null,
    @SerializedName("seoUrl"            ) var seoUrl            : String?                = null,
    @SerializedName("totalListingCount" ) var totalListingCount : Int?                   = null,
    @SerializedName("totalPageCount"    ) var totalPageCount    : Int?                   = null
)
