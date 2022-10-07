package com.algaworks.algafoodapi.di.modelo

class Cliente(
    private var nome: String,
    private var email: String,
    private var telefone: String,
    private var ativo: Boolean = false
) {

    fun  Cliente(nome: String, email: String, telefone: String) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    fun getNome() = nome

    fun getEmail() = email

    fun getTelefone() = telefone

    fun isAtivo() = ativo

    fun ativar() {
        this.ativo = true
    }
}
