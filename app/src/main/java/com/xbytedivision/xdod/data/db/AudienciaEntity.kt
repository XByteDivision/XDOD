package com.xbytedivision.xdod.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Audiencia")
data class AudienciaEntity(
    @SerializedName("id") @PrimaryKey val id_audiencia: Int,
    @SerializedName("id_processo") val id_processo: Int,
    @SerializedName("data_audiencia") val data_ultima_atualizacao: String?,
    @SerializedName("status") val status: String?,
    @SerializedName("data_criacao") val data_criacao: String?
    )