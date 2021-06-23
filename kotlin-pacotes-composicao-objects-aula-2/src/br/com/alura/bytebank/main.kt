package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco


fun main() {
    var objectDeclaration = object {
        var nome = "hernani"
    }
    println(objectDeclaration.nome)
    val endereco = Endereco(logradouro = "primeiro")
    val cliente = Cliente(nome = "Herm", cpf = "",endereco = endereco,senha = 123456)
    val clienteCC = ContaCorrente(titular = cliente,numero = 1)
    println("Contador: ${Conta.total}")

}