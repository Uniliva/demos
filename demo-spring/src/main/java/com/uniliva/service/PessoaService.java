package com.uniliva.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniliva.dto.PessoaDto;
import com.uniliva.entity.Pessoa;
import com.uniliva.repo.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
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
