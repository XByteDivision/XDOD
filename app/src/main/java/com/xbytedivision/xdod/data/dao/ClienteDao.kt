package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.ClienteEntity

@Dao
interface ClienteDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(cliente: ClienteEntity)

    @Query("SELECT * FROM Cliente WHERE id = :id")
    fun get(id: Long): ClienteEntity

    @Query("SELECT * FROM Cliente")
    fun getList():List<ClienteEntity>
}