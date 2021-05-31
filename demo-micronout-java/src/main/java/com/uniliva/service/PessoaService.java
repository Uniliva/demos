package com.uniliva.service;

import com.uniliva.dto.PessoaDto;
import com.uniliva.entity.Pessoa;
import com.uniliva.repo.PessoaRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Singleton
public class PessoaService {

    @Inject
    private PessoaRepository repo;

    public PessoaDto salvar(PessoaDto dto) {
        Pessoa pessoa = repo.save(dto.toEntity());
        return pessoa.toDto();
    }

    public List<PessoaDto> buscaTodos() {
        List<PessoaDto> pessoaDtos = StreamSupport
                .stream(repo.findAll().spliterator(), false).map(Pessoa::toDto)
                .collect(Collectors.toList());
        return pessoaDtos;
    }
}
