package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.AudienciaEntity

@Dao
interface AudienciaDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(audiencia: AudienciaEntity)

    @Query("SELECT * FROM Audiencia WHERE audienciaId = :id")
    fun get(id: Long): AudienciaEntity

    @Query("SELECT * FROM Audiencia")
    fun getList():List<AudienciaEntity>
}