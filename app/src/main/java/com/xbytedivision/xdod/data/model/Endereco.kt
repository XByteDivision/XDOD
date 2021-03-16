package com.xbytedivision.xdod.data.model

import com.google.gson.annotations.SerializedName

data class Endereco (

    @SerializedName("id")  private val id_endereco: Int,
    @SerializedName("id_pessoa") private val id_pessoa: Int,
    @SerializedName("logradouro") private val logradouro: String,
    @SerializedName("numero") private val data_nascimento: String,
    @SerializedName("estado") private val estado: String,
    @SerializedName("cidade") private val cidade: String,
    @SerializedName("bairro") private val bairro: String,
    @SerializedName("cep") private val sexo: String,
    @SerializedName("data_criacao") private val data_criacao: String

)