package com.uniliva.repo;


import com.uniliva.entity.Pessoa;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {  }
