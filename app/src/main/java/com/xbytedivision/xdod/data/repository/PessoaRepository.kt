package com.xbytedivision.xdod.data.repository

import android.media.MediaMetadataRetriever
import com.xbytedivision.xdod.data.db.PessoaEntity
import com.xbytedivision.xdod.data.model.Pessoa
import com.xbytedivision.xdod.implementations.RegistrationViewParams

interface PessoaRepository {
    fun createPessoa(registrationViewParams: RegistrationViewParams)

    fun getPessoa(id: Long): Pessoa


}