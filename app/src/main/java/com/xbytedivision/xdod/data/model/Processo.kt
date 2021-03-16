package com.xbytedivision.xdod.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Processo (

    @SerializedName("id") private val id_processo: Int,
    @SerializedName("id_cliente") private val id_cliente: Int,
    @SerializedName("tipo_parte") private val tipo_parte: Int, //AUTOR ou RÉU
    @SerializedName("id_parte_contraria") private val id_parte_contraria: Int,
    @SerializedName("numero") private val numero: String,
    @SerializedName("nome_juiz") private val juiz: String?,
    @SerializedName("comarca") private val comarca: String?,
    @SerializedName("vara") private val vara: String?,
    @SerializedName("status") private val status: String?,
    @SerializedName("data_criacao") private val data_criacao: String?,
    @SerializedName("data_ultima_atualizacao") private val data_ultima_atualizacao: String?

    )