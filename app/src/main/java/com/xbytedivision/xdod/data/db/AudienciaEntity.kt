package com.xbytedivision.xdod.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.xbytedivision.xdod.data.model.Pessoa
import com.xbytedivision.xdod.data.model.Processo
/*
@Entity(tableName = "Audiencia",foreignKeys =
[ForeignKey(
    entity = Processo::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("processoId"),
    onDelete = ForeignKey.CASCADE)])*/
@Entity(tableName = "Audiencia")
data class AudienciaEntity(
    @PrimaryKey val audienciaId: Long,
    val processoId: Long,
    val dataUltimaAtualizacao: String?,
    val status: String?,
    val dataCriacao: String?
    )