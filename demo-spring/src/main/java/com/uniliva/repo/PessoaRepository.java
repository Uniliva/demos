package com.uniliva.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uniliva.entity.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {  }
