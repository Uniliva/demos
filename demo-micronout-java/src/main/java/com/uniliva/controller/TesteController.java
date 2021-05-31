package com.uniliva.controller;

import com.uniliva.dto.PessoaDto;
import com.uniliva.service.PessoaService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

@Controller
public class TesteController {


    @Inject
    private PessoaService service;


    @Get
    public HttpResponse<List<PessoaDto>> buscaTodos() {
        return HttpResponse.ok(service.buscaTodos());
    }

    @Post
    public HttpResponse<PessoaDto> salvar(PessoaDto dto) {
        PessoaDto pessoa = service.salvar(dto);
        return HttpResponse.ok(pessoa);
    }


}
