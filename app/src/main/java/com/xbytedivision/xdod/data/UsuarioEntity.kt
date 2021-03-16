package com.xbytedivision.xdod.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Usuario")
data class UsuarioEntity(
    @SerializedName("id") @PrimaryKey val id_usuario: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int,
    @SerializedName("login") val nome: String,
    @SerializedName("senha") val data_nascimento: String,
    @SerializedName("data_criacao") val data_criacao: String?,
    @SerializedName("data_ultimo_acesso") val data_ultimo_acesso: String?
)