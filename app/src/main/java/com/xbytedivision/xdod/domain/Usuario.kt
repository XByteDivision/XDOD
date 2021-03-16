package com.xbytedivision.xdod.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Usuario(

    @SerializedName("id_usuario") val id_usuario: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int,
    @SerializedName("login") val nome: String,
    @SerializedName("senha") val data_nascimento: String,
    @SerializedName("data_criacao") val data_criacao: String?,
    @SerializedName("data_ultimo_acesso") val data_ultimo_acesso: String?

): Parcelable