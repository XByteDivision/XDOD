package com.xbytedivision.xdod.data.dao.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.xbytedivision.xdod.data.AudienciaEntity
import com.xbytedivision.xdod.data.ClienteEntity
import com.xbytedivision.xdod.data.EnderecoEntity
import com.xbytedivision.xdod.data.PessoaEntity

@Dao
interface EnderecoDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun save(endereco:EnderecoEntity)

    @Query("SELECT * FROM Audiencia WHERE id = :id")
    fun get(id: Long):EnderecoEntity

    @Query("SELECT * FROM Audiencia")
    fun getList():List<EnderecoEntity>
}