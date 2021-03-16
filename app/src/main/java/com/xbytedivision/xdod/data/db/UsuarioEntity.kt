package com.xbytedivision.xdod.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.xbytedivision.xdod.data.model.Pessoa
/*
@Entity(tableName = "Usuario",
    foreignKeys = [ForeignKey(
        entity = Pessoa::class,
        parentColumns = arrayOf("id"),
    childColumns = arrayOf("pessoaId"))])*/
@Entity(tableName = "Usuario")
data class UsuarioEntity(
    @PrimaryKey val usuarioId: Long,
    val pessoaId: Long,
    val nome: String,
    val dataNascimento: String,
    val dataCriacao: String?,
    val dataUltimoAcesso: String?
)