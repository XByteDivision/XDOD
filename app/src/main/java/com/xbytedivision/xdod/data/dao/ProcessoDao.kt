package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.ProcessoEntity

@Dao
interface ProcessoDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(processo: ProcessoEntity)

    @Query("SELECT * FROM Audiencia WHERE id = :id")
    fun get(id: Long): ProcessoEntity

    @Query("SELECT * FROM Audiencia")
    fun getList():List<ProcessoEntity>
}