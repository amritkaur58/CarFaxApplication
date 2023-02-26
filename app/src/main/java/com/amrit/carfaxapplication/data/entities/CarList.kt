package com.amrit.carfaxapplication.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "car_table")
class CarList(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id") var id: Int? = null,
    @SerializedName("advantage") var advantage: Boolean? = null,
    @SerializedName("backfill") var backfill: Boolean? = null,
    @SerializedName("badge") var badge: String? = null,
    @SerializedName("bedLength") var bedLength: String? = null,
    @SerializedName("bodytype") var bodytype: String? = null,
    @SerializedName("cabType") var cabType: String? = null,
    @SerializedName("certified") var certified: Boolean? = null,
    @SerializedName("currentPrice") var currentPrice: Int? = null,
    @SerializedName("dealerType") var dealerType: String? = null,
    @SerializedName("displacement") var displacement: String? = null,
    @SerializedName("distanceToDealer") var distanceToDealer: Double? = null,
    @SerializedName("drivetype") var drivetype: String? = null,
    @SerializedName("engine") var engine: String? = null,
    @SerializedName("exteriorColor") var exteriorColor: String? = null,
    @SerializedName("firstSeen") var firstSeen: String? = null,
    @SerializedName("followCount") var followCount: Int? = null,
    @SerializedName("following") var following: Boolean? = null,
    @SerializedName("fuel") var fuel: String? = null,
    @SerializedName("hasViewed") var hasViewed: Boolean? = null
)


