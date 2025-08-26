//Parte 2
//Ejercicio 2: Practica de concatenacion para unir
//diversas varibales o cadenas

val nombre = "Pancho"
val age: Int = 25
val dinero  = 25.6

fun main(args: Array<String>) {
    //forma uno de concatenacion
    val resul = "Su nombre es " +  nombre + " y su edad: " + age

    println(resul)

    //Forma dos de concatenar
    val resul2 = "Su nombre es $nombre y  su edad es $age"

    println(resul2)

    println("El valor maximo de un int es: ${Int.MAX_VALUE}") // cuando se muestra la propiedad de una clase se escribe entre llaves

    //Forma tres de concatenar
    val ruta =
        """
            Nombre: $nombre
            Edad: $age
            Dinero: $dinero
        """.trimIndent()
    println(ruta)
}