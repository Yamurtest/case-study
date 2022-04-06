package com.yagmurerdogan.ekarcasestudy.data.model.response

import com.google.gson.annotations.SerializedName

data class CarAttributeResponse(
    @SerializedName("year")
    val year: String,
    @SerializedName("model")
    val model: String,
    @SerializedName("make")
    val make: String,
    @SerializedName("style")
    val style: String,
    @SerializedName("delivery_charges")
    val deliveryCharges: String,
    @SerializedName("standard_seating")
    val seating: String
)