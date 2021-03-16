package com.xbytedivision.xdod.data.model

import com.google.gson.annotations.SerializedName

data class ParteContraria (

    @SerializedName("id") private val id_parte_contraria: Int,
    @SerializedName("id_pessoa") private val id_pessoa: Int

)