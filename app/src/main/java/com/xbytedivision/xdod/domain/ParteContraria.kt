package com.xbytedivision.xdod.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParteContraria(

    @SerializedName("id_parte_contraria") val id_parte_contraria: Int,
    @SerializedName("id_pessoa") val id_pessoa: Int

): Parcelable