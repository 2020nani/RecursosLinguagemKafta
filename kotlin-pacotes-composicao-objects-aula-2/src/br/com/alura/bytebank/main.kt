package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaObject


fun main() {
   val endereco = Endereco(logradouro = "rua 20",cep = "18608-460")
   val endereco2 = Endereco(logradouro = "rua 20",cep = "18608-460")
    println(endereco.equals(endereco2))
    println(endereco.hashCode())
    println(endereco2.hashCode())
}

