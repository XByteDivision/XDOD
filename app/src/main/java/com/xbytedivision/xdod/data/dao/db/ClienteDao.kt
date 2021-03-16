package com.xbytedivision.xdod.data.dao.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.ClienteEntity
import com.xbytedivision.xdod.data.PessoaEntity

@Dao
interface ClienteDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(cliente:ClienteEntity)

    @Query("SELECT * FROM Cliente WHERE id = :id")
    fun get(id: Long):ClienteEntity

    @Query("SELECT * FROM Cliente")
    fun getList():List<ClienteEntity>
}