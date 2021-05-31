package com.uniliva.repository

import com.uniliva.entity.PessoaEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface PessoaRepository : CrudRepository<PessoaEntity, Long>


