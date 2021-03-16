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
@Entity(tableName = "ParteContraria",foreignKeys =
[ForeignKey(
    entity = Pessoa::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("pessoaId"),
    onDelete = ForeignKey.CASCADE)])*/

@Entity(tableName = "ParteContraria")
data class ParteContrariaEntity(
    @PrimaryKey val parteContrariaId: Long,
    val pessoaId: Long
)