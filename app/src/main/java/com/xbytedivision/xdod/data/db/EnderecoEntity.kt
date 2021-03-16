package com.xbytedivision.xdod.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.xbytedivision.xdod.data.model.Pessoa
/*
@Entity(tableName = "Endereco",foreignKeys =
[ForeignKey(
    entity = Pessoa::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("pessoaId"),
    onDelete = ForeignKey.CASCADE)])*/
@Entity(tableName = "Endereco")
data class EnderecoEntity(

    @PrimaryKey val enderecoId: Long,
    val pessoaId: Long,
    val logradouro: String,
    val dataNascimento: String,
    val estado: String,
    val cidade: String,
    val bairro: String,
    val sexo: String,
    val dataCriacao: String
)