//PArte 2:
//Ejercicio 1: practica de variables globales

//Tipos de datos
val edad: Int = 28 //Val no permite cambiar el valor una vez declarado
val num: Int = 1_000_000 //el _ ayuda a identificar la cantidad de seros
val number: Double = 10.5 //el sistema lee un numero con punto como si fuera un double
val fnumber: Float = 5.3f //Para definir un flotante debemos especificar la f al final
val letra = 'A' // si es un char se usa comilla simple y kotlin puede inferir el tipo de dato
val cadena = "Hola Mundo"
val estado:Boolean = true

fun main(args: Array<String>) {

    println(edad)
    println(num)
    println(number)
    println(fnumber)
    println(letra)
    println(cadena)
    println(estado)
}