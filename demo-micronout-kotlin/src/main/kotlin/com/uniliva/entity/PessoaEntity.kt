package com.uniliva.entity

import javax.persistence.*

@Entity
class PessoaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long?,
    var nome: String,
    var idade: Int
){
    constructor() : this(null,  "", 0)
}

