package com.xbytedivision.xdod.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EnderecoCliente(

    @SerializedName("id") val id: Int,
    @SerializedName("nome") val nome: String,
    @SerializedName("data_nascimento") val data_nascimento: String?,
    @SerializedName("sexo") val sexo: String?,
    @SerializedName("data_criacao") val data_criacao: String

): Parcelable