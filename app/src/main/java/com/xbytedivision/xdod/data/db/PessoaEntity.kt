package com.xbytedivision.xdod.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Pessoa")
data class PessoaEntity(

    @SerializedName("id") @PrimaryKey val id_pessoa: Int,
    @SerializedName("nome") val nome: String,
    @SerializedName("documento") val documento: String?,
    @SerializedName("data_nascimento") val data_nascimento: String?,
    @SerializedName("sexo") val sexo: String?,
    @SerializedName("data_criacao") val data_criacao: String

)