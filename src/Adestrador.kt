/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13

/**
 *
 * @author david
 */
class Adestrador : Seleccion {
//tengo que darle un valor inicial a todas la variables.
    var idFederacion: String? = null

    constructor(idFederacion: String, id: Int, nome: String, apelido: String, edade: Int) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }

    constructor() {}


    override fun viaxar() {
        println("viaxa adestrador")

    }

    fun dirixirAdestramento() {
        println("")

    }

    fun dirixirPartido() {}


}
