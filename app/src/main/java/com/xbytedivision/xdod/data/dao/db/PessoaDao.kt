package com.xbytedivision.xdod.data.dao.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.PessoaEntity

@Dao
interface PessoaDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(pessoa:PessoaEntity)

    @Query("SELECT * FROM Pessoa WHERE id = :id")
    fun get(id: Long):PessoaEntity

    @Query("SELECT * FROM Pessoa")
    fun getList():List<PessoaEntity>
}