package com.uniliva.dto;

import com.uniliva.entity.Pessoa;

public class PessoaDto {

    private Long id;
    private String nome;
    private String idade;

    public PessoaDto(Long id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    public Pessoa toEntity(){
        return new Pessoa(id, nome, idade);
    }

}
