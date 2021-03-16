package com.xbytedivision.xdod.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "ParteContraria")
data class ParteContrariaEntity(

    @SerializedName("id") @PrimaryKey val id_parte_contraria: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int

)