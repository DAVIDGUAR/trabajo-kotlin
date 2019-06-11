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


    /**
     * @param args the command line arguments
     */
//En Kotlin el main no tiene que estar dentro de una clase como en Java
    fun main(args: Array<String>) {

        val obxSeleccion = Seleccion()
        val obxXogador = Xogador()
        val obxMasaxista = Masaxista()
        val obxAdestrador = Adestrador()
        val obxSeleXogador = Xogador()

        obxSeleccion.concentrarse()
        obxMasaxista.concentrarse()
        obxAdestrador.concentrarse()
        obxXogador.concentrarse()
        obxSeleXogador.concentrarse()
        //todos devuelven el mismo mensaxe del metodo seleccion

        obxSeleXogador.viaxar()
        obxAdestrador.viaxar()
        obxMasaxista.viaxar()
        obxSeleccion.viaxar()
        obxXogador.viaxar()
        // cambia el mensaxe de todos, menos el primero y el ultimo que devuelve el mensaxe de la subclase xogador

         obxXogador.nome
        //puedo hacerlo porque son metodos publicos, si los declaro private no podria llamarlos.


        //no puedo llamar al obxSeleccion y hacer que muestre un metodo tipo dorsal, que pertenece a la subclase xogador.
    }


