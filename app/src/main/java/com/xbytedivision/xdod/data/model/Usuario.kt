package com.xbytedivision.xdod.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Usuario (


    @SerializedName("id") private val id_usuario: Int,
    @SerializedName("id_pessoa") private val id_pessoa: Int,
    @SerializedName("login") private val nome: String,
    @SerializedName("senha") private val data_nascimento: String,
    @SerializedName("data_criacao") private val data_criacao: String?,
    @SerializedName("data_ultimo_acesso") private val data_ultimo_acesso: String?

)