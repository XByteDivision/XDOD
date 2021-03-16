package com.xbytedivision.xdod.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Endereco")
data class EnderecoEntity(

    @SerializedName("id") @PrimaryKey val id_endereco: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int,
    @SerializedName("logradouro") val logradouro: String,
    @SerializedName("numero") val data_nascimento: String,
    @SerializedName("estado") val estado: String,
    @SerializedName("cidade") val cidade: String,
    @SerializedName("bairro") val bairro: String,
    @SerializedName("cep") val sexo: String,
    @SerializedName("data_criacao") val data_criacao: String

)