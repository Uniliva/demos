package com.uniliva.mapper

import com.uniliva.dto.PessoaDto
import com.uniliva.entity.PessoaEntity

fun PessoaDto.toEntity() = PessoaEntity(this.id, this.nome, this.idade)

fun PessoaEntity.toDto() = PessoaDto(this.id, this.nome, this.idade)