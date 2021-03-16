package com.xbytedivision.xdod.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Audiencia (

    @SerializedName("id")
    private val id_audiencia: Int,
    @SerializedName("id_processo")
    private  val id_processo: Int,
    @SerializedName("data_audiencia")
    private val data_ultima_atualizacao: String?,
    @SerializedName("status")
    private val status: String?,
    @SerializedName("data_criacao")
    private val data_criacao: String?

)