package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {
    override fun equals(other: Any?): Boolean {
        if(other != null && other is Endereco){
            return this.cep == other.cep && this.logradouro == other.logradouro
        }
        return false
    }

    override fun hashCode(): Int {
        return cep.hashCode() + logradouro.hashCode()
    }
}
