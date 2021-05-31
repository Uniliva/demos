package com.uniliva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniliva.dto.PessoaDto;
import com.uniliva.service.PessoaService;

@RestController
public class TesteController {

	@Autowired
	private PessoaService service;

	@GetMapping
	public ResponseEntity<List<PessoaDto>> buscaTodos() {
		return ResponseEntity.ok(service.buscaTodos());
	}

	@PostMapping
	public ResponseEntity<PessoaDto> salvar(@RequestBody PessoaDto dto) {
		PessoaDto pessoa = service.salvar(dto);
		return ResponseEntity.ok(pessoa);
	}

}
