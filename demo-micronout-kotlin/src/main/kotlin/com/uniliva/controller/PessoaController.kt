package com.uniliva.controller

import com.uniliva.dto.PessoaDto
import com.uniliva.service.PessoaService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post


@Controller
class PessoaController(private val service: PessoaService) {

    @Get
    fun buscaTodos() = HttpResponse.ok(service.buscaTodos())

    @Post
    fun salvar(dto: PessoaDto?): HttpResponse<PessoaDto?>? {
        val pessoa = service.salvar(dto!!)
        return HttpResponse.ok(pessoa)
    }

}

