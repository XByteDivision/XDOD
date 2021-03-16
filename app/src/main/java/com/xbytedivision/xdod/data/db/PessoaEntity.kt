package com.xbytedivision.xdod.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Pessoa")
data class PessoaEntity(
    @PrimaryKey val pessoaId: Long,
    val nome: String,
    val documento: String?,
    val dataNascimento: String?,
    val sexo: String?,
    val dataCriacao: String

)