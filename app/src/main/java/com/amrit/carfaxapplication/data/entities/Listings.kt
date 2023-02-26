package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class Listings(
    @SerializedName("accidentHistory") var accidentHistory: AccidentHistory? = AccidentHistory(),
    @SerializedName("advantage") var advantage: Boolean? = null,
    @SerializedName("atomOtherOptions") var atomOtherOptions: ArrayList<String> = arrayListOf(),
    @SerializedName("atomTopOptions") var atomTopOptions: ArrayList<String> = arrayListOf(),
    @SerializedName("backfill") var backfill: Boolean? = null,
    @SerializedName("badge") var badge: String? = null,
    @SerializedName("bedLength") var bedLength: String? = null,
    @SerializedName("bodytype") var bodytype: String? = null,
    @SerializedName("cabType") var cabType: String? = null,
    @SerializedName("certified") var certified: Boolean? = null,
    @SerializedName("currentPrice") var currentPrice: Int? = null,
    @SerializedName("dealer") var dealer: Dealer? = Dealer(),
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
    @SerializedName("hasViewed") var hasViewed: Boolean? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("imageCount") var imageCount: Int? = null,
    @SerializedName("images") var images: Images? = Images(),
    @SerializedName("interiorColor") var interiorColor: String? = null,
    @SerializedName("isEnriched") var isEnriched: Boolean? = null,
    @SerializedName("isOemPromoted") var isOemPromoted: Boolean? = null,
    @SerializedName("isOemRefundFlag") var isOemRefundFlag: Boolean? = null,
    @SerializedName("listPrice") var listPrice: Int? = null,
    @SerializedName("make") var make: String? = null,
    @SerializedName("mileage") var mileage: Int? = null,
    @SerializedName("model") var model: String? = null,
    @SerializedName("monthlyPaymentEstimate") var monthlyPaymentEstimate: MonthlyPaymentEstimate? = MonthlyPaymentEstimate(),
    @SerializedName("mpgCity") var mpgCity: Int? = null,
    @SerializedName("mpgHighway") var mpgHighway: Int? = null,
    @SerializedName("noAccidents") var noAccidents: Boolean? = null,
    @SerializedName("oneOwner") var oneOwner: Boolean? = null,
    @SerializedName("onePrice") var onePrice: Int? = null,
    @SerializedName("onePriceArrows") var onePriceArrows: ArrayList<OnePriceArrows> = arrayListOf(),
    @SerializedName("onlineOnly") var onlineOnly: Boolean? = null,
    @SerializedName("ownerHistory") var ownerHistory: OwnerHistory? = OwnerHistory(),
    @SerializedName("personalUse") var personalUse: Boolean? = null,
    @SerializedName("placed") var placed: Boolean? = null,
    @SerializedName("recordType") var recordType: String? = null,
    @SerializedName("sentLead") var sentLead: Boolean? = null,
    @SerializedName("serviceHistory") var serviceHistory: ServiceHistory? = ServiceHistory(),
    @SerializedName("serviceRecords") var serviceRecords: Boolean? = null,
    @SerializedName("sortScore") var sortScore: Double? = null,
    @SerializedName("stockNumber") var stockNumber: String? = null,
    @SerializedName("subTrim") var subTrim: String? = null,
    @SerializedName("topOptions") var topOptions: ArrayList<String> = arrayListOf(),
    @SerializedName("tpCostPerVdp") var tpCostPerVdp: Double? = null,
    @SerializedName("tpEligible") var tpEligible: Boolean? = null,
    @SerializedName("transmission") var transmission: String? = null,
    @SerializedName("trim") var trim: String? = null,
    @SerializedName("vdpUrl") var vdpUrl: String? = null,
    @SerializedName("vehicleCondition") var vehicleCondition: String? = null,
    @SerializedName("vehicleUseHistory") var vehicleUseHistory: VehicleUseHistory? = VehicleUseHistory(),
    @SerializedName("vin") var vin: String? = null,
    @SerializedName("windowSticker") var windowSticker: String? = null,
    @SerializedName("year") var year: Int? = null

)

data class ServiceHistory(

    @SerializedName("history") var history: ArrayList<History> = arrayListOf(),
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("iconUrl") var iconUrl: String? = null,
    @SerializedName("number") var number: Int? = null,
    @SerializedName("text") var text: String? = null

)

data class VehicleUseHistory(

    @SerializedName("history") var history: ArrayList<History> = arrayListOf(),
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("iconUrl") var iconUrl: String? = null,
    @SerializedName("text") var text: String? = null

)

