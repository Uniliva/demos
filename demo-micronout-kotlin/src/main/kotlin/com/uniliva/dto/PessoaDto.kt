package com.uniliva.dto

data class PessoaDto constructor( var id: Long?, var nome: String, var idade: Int){
    constructor() : this(null,  "", 0)
}

