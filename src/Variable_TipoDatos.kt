//PArte 1
//Ejercicio 2: Muestra el uso de variables y los tipos
//de datos existentes

fun main(args: Array<String>){
    //La palabra var es la palabra reservada para
    //indicar variables cuyo valor puede definirse luego
    var nombre:String
    var suma:Int
    var resta:Float
    var booleano: Boolean
    //val es la palabra reservada para variabless read-only
    val saludo = "Bienvenido a Kotlin"
    val salario = 85.62

    nombre = "Norma Arauz"
    suma = 10+5
    resta = 7.5f-2.5f
    booleano = true

    println(saludo+ " " + nombre)
    println(salario)
    println(suma)
    println(resta)
    println(booleano)

}