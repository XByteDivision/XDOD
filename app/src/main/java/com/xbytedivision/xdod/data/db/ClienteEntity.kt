package com.xbytedivision.xdod.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.xbytedivision.xdod.data.model.Pessoa
/*
@Entity(tableName = "Cliente",foreignKeys =
[ForeignKey(
    entity = Pessoa::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("pessoaId"),
    onDelete = ForeignKey.CASCADE)])*/
@Entity(tableName = "Cliente")
data class ClienteEntity(
    @PrimaryKey val clienteId: Long,
    val pessoaId: Long,
    val nome: String,
    val documento: String?,
    val dataNascimento: String?,
    val sexo: String?,
    val dataCriacao: String

)