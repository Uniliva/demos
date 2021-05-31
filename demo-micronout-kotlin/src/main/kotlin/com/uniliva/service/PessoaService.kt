package com.uniliva.service

import com.uniliva.dto.PessoaDto
import com.uniliva.entity.PessoaEntity
import com.uniliva.mapper.toDto
import com.uniliva.mapper.toEntity
import com.uniliva.repository.PessoaRepository
import java.util.stream.Collectors
import java.util.stream.StreamSupport
import javax.inject.Singleton


@Singleton
class PessoaService(private val repo :PessoaRepository) {

    fun salvar(dto: PessoaDto): PessoaDto? {
        val pessoa: PessoaEntity = repo.save(dto.toEntity())
        return pessoa.toDto()
    }

    fun buscaTodos(): List<PessoaDto?>? = repo.findAll().map {it.toDto()}.toList()

}