package com.xbytedivision.xdod.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Endereco(

    @SerializedName("id_endereco") val id_endereco: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int,
    @SerializedName("logradouro") val logradouro: String,
    @SerializedName("numero") val data_nascimento: String,
    @SerializedName("estado") val estado: String,
    @SerializedName("cidade") val cidade: String,
    @SerializedName("bairro") val bairro: String,
    @SerializedName("cep") val sexo: String,
    @SerializedName("data_criacao") val data_criacao: String

): Parcelable