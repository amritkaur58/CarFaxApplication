package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class Dealer(
    @SerializedName("address"              ) var address              : String?  = null,
    @SerializedName("backfill"             ) var backfill             : Boolean? = null,
    @SerializedName("carfaxId"             ) var carfaxId             : String?  = null,
    @SerializedName("cfxMicrositeUrl"      ) var cfxMicrositeUrl      : String?  = null,
    @SerializedName("city"                 ) var city                 : String?  = null,
    @SerializedName("dealerAverageRating"  ) var dealerAverageRating  : Double?  = null,
    @SerializedName("dealerInventoryUrl"   ) var dealerInventoryUrl   : String?  = null,
    @SerializedName("dealerLeadType"       ) var dealerLeadType       : String?  = null,
    @SerializedName("dealerReviewComments" ) var dealerReviewComments : String?  = null,
    @SerializedName("dealerReviewCount"    ) var dealerReviewCount    : Int?     = null,
    @SerializedName("dealerReviewDate"     ) var dealerReviewDate     : String?  = null,
    @SerializedName("dealerReviewRating"   ) var dealerReviewRating   : Int?     = null,
    @SerializedName("dealerReviewReviewer" ) var dealerReviewReviewer : String?  = null,
    @SerializedName("dealerReviewTitle"    ) var dealerReviewTitle    : String?  = null,
    @SerializedName("latitude"             ) var latitude             : String?  = null,
    @SerializedName("longitude"            ) var longitude            : String?  = null,
    @SerializedName("name"                 ) var name                 : String?  = null,
    @SerializedName("onlineOnly"           ) var onlineOnly           : Boolean? = null,
    @SerializedName("phone"                ) var phone                : String?  = null,
    @SerializedName("state"                ) var state                : String?  = null,
    @SerializedName("zip"                  ) var zip                  : String?  = null
)