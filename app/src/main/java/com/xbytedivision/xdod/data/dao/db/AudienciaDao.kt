package com.xbytedivision.xdod.data.dao.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.AudienciaEntity
import com.xbytedivision.xdod.data.ClienteEntity
import com.xbytedivision.xdod.data.PessoaEntity

@Dao
interface AudienciaDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(audiencia:AudienciaEntity)

    @Query("SELECT * FROM Audiencia WHERE id = :id")
    fun get(id: Long):AudienciaEntity

    @Query("SELECT * FROM Audiencia")
    fun getList():List<AudienciaEntity>
}