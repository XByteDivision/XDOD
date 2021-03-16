package com.xbytedivision.xdod.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.xbytedivision.xdod.data.dao.*

@Database(
    entities = [
        AudienciaEntity::class,
        ClienteEntity::class,
        EnderecoEntity::class,
        ParteContrariaEntity::class,
        PessoaEntity::class,
        ProcessoEntity::class,
        UsuarioEntity::class
    ],
    version = 1
)

abstract class AppDatabase : RoomDatabase() {

    abstract fun pessoaDao(): PessoaDao
    abstract fun audienciaDao(): AudienciaDao
    abstract fun clienteDao(): ClienteDao
    abstract fun enderecoDao(): EnderecoDao
    abstract fun partecontrariaDao(): ParteContrariaDao
    abstract fun processoDao(): ProcessoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null)
                return tempInstance

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "xdod"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}