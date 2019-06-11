package boletin13

/**
 *
 * @author david
 */
open class Seleccion {

    var id: Int = 0
    var nome: String =""
    var apelido: String=""
    var edade: Int = 0

    constructor(id: Int, nome: String, apelido: String, edade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
    }

    //contructor vacio
    constructor() {}


    fun concentrarse() {
        println("concentrarse Seleccion")
    }

    open fun viaxar() {
        println("viaxa a Seleccion")
    }


}
