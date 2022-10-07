package com.algaworks.algafoodapi.di.service

import com.algaworks.algafoodapi.di.modelo.Cliente
import com.algaworks.algafoodapi.di.notificacao.NotificadorEmail
import org.springframework.stereotype.Component

@Component
class AtivacaoClienteService(
    private val notificador: NotificadorEmail
) {

    fun ativar(cliente: Cliente) {
        cliente.ativar()

        notificador.notificar(cliente = cliente, "Seu cadastro no sistema esta ativo!")
    }
}