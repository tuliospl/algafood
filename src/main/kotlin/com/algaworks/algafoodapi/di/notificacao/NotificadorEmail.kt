package com.algaworks.algafoodapi.di.notificacao

import com.algaworks.algafoodapi.di.modelo.Cliente
import org.springframework.stereotype.Component

@Component
class NotificadorEmail {

    fun notificar(cliente: Cliente, mensagem: String) {
        System.out.printf(
            "Notificando %s atraves do email %s: %s\n",
            cliente.getNome(), cliente.getEmail(), mensagem
        )
    }
}
