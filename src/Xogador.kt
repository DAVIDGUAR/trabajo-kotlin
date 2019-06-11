package boletin13

/**
 *
 * @author david
 */
class Xogador : Seleccion {


    var demarcación: String? = null // al declararlo como null tengo que poner la interrogacion.
    var dorsal: Int = 0

    constructor(demarcación: String, dorsal: Int, id: Int, nome: String, apelido: String, edade: Int) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.demarcación = demarcación
        this.dorsal = dorsal
    }

    constructor() {}


    override fun viaxar() {
        println("viaxa os xogadores")
    }

    fun xogarPartido() {
        println("")

    }

    fun entrenar() {
        println("")

    }


}
