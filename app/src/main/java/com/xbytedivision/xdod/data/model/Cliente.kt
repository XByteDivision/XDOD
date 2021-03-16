package com.xbytedivision.xdod.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Cliente (

    @SerializedName("id") private val id_cliente: Int,
    @SerializedName("id_pessoa") private val id_pessoa: Int,
    @SerializedName("nome") private val nome: String,
    @SerializedName("documento") private val documento: String?,
    @SerializedName("data_nascimento") private val data_nascimento: String?,
    @SerializedName("sexo") private val sexo: String?,
    @SerializedName("data_criacao") private val data_criacao: String

)