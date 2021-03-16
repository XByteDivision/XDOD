package com.xbytedivision.xdod.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.xbytedivision.xdod.data.model.Cliente
import com.xbytedivision.xdod.data.model.ParteContraria
import com.xbytedivision.xdod.data.model.Pessoa
/*
@Entity(tableName = "ProcessoEntity",foreignKeys =
    [ForeignKey(
    entity = Cliente::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("clienteId"),
    onDelete = ForeignKey.CASCADE),
    ForeignKey(
    entity = ParteContraria::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("parteContrariaId"),
    onDelete = ForeignKey.CASCADE)])*/

@Entity(tableName = "Processo")
data class ProcessoEntity(
    @PrimaryKey val processoId: Long,
    val clienteId: Long,
    val tipoParte: String, //AUTOR ou RÉU
    val parteContrariaId: Long,
    val numero: String,
    val juiz: String?,
    val comarca: String?,
    val vara: String?,
    val status: String?,
    val dataCriacao: String?,
    val dataUltimaAtualizacao: String?
)