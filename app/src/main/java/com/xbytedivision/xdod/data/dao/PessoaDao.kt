package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.PessoaEntity

@Dao
interface PessoaDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(pessoa: PessoaEntity)

    @Query("SELECT * FROM Pessoa WHERE pessoaId = :id")
    fun get(id: Long): PessoaEntity

    @Query("SELECT * FROM Pessoa")
    fun getList():List<PessoaEntity>
}