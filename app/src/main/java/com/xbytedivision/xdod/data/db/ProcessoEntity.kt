package com.xbytedivision.xdod.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "ProcessoEntity")
data class ProcessoEntity(

    @SerializedName("id") @PrimaryKey val id_processo: Int,
    @SerializedName("id_cliente") val id_cliente: Int,
    @SerializedName("tipo_parte") val tipo_parte: Int, //AUTOR ou RÉU
    @SerializedName("id_parte_contraria") val id_parte_contraria: Int,
    @SerializedName("numero") val numero: String,
    @SerializedName("nome_juiz") val juiz: String?,
    @SerializedName("comarca") val comarca: String?,
    @SerializedName("vara") val vara: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("data_criacao") val data_criacao: String?,
    @SerializedName("data_ultima_atualizacao") val data_ultima_atualizacao: String?,

    )