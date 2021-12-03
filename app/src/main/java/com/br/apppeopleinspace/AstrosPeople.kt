package com.br.apppeopleinspace

import com.google.gson.annotations.SerializedName

data class AstrosPeople(
    @SerializedName("craft") val craft: String,
    @SerializedName("name") val name: String
)