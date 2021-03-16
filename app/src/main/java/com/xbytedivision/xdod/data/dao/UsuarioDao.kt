package com.xbytedivision.xdod.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.db.ProcessoEntity
import com.xbytedivision.xdod.data.db.UsuarioEntity

@Dao
interface UsuarioDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(usuario: UsuarioEntity)

    @Query("SELECT * FROM Usuario WHERE usuarioId = :id")
    fun get(id: Long): UsuarioEntity

    @Query("SELECT * FROM Usuario")
    fun getList():List<UsuarioEntity>
}