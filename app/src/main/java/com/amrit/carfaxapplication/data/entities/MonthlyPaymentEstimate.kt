package com.amrit.carfaxapplication.data.entities

import com.google.gson.annotations.SerializedName

data class MonthlyPaymentEstimate(
    @SerializedName("downPaymentAmount"  ) var downPaymentAmount  : Double? = null,
    @SerializedName("downPaymentPercent" ) var downPaymentPercent : Int?    = null,
    @SerializedName("interestRate"       ) var interestRate       : Int?    = null,
    @SerializedName("loanAmount"         ) var loanAmount         : Double? = null,
    @SerializedName("monthlyPayment"     ) var monthlyPayment     : Double? = null,
    @SerializedName("price"              ) var price              : Int?    = null,
    @SerializedName("termInMonths"       ) var termInMonths       : Int?    = null)
