package com.example.appconsultakotlin

import java.io.Serializable

class DadosList : Serializable {

    var codCartao = ""
    var nomeEmpresa = ""
    var saldo = ""
    var dtUltimoUpdate = ""
    var nome = ""
    var CodEmpresa = ""
    var movimentos = ""

    override fun toString(): String {
        return "DadosList$nomeEmpresa"
    }
}