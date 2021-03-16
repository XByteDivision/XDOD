package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.EnderecoEntity

@Dao
interface EnderecoDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(endereco: EnderecoEntity)

    @Query("SELECT * FROM Endereco WHERE enderecoId = :id")
    fun get(id: Long): EnderecoEntity

    @Query("SELECT * FROM Endereco")
    fun getList():List<EnderecoEntity>
}