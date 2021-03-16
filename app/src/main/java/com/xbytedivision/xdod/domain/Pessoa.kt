package com.xbytedivision.xdod.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pessoa(

    @SerializedName("id_pessoa") val id_pessoa: Int,
    @SerializedName("nome") val nome: String,
    @SerializedName("documento") val documento: String?,
    @SerializedName("data_nascimento") val data_nascimento: String?,
    @SerializedName("sexo") val sexo: String?,
    @SerializedName("data_criacao") val data_criacao: String

): Parcelable