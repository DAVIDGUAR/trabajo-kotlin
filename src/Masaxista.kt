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
class Masaxista : Seleccion {


    var titulacion: String=""
    var anosExperiencia: Int = 0

    constructor(
        titulacion: String,
        anosExperiencia: Int,
        id: Int,
        nome: String,
        apelido: String,
        edade: Int
    ) : super(id, nome, apelido, edade) {
        this.titulacion = titulacion
        this.anosExperiencia = anosExperiencia
    }

    constructor() {}


    fun darMasaxe() {
        println("")

    }


    override fun viaxar() {
        println("viaxa el masaxista")

    }


}
