//Parte 2
//Ejercicio 6: Practica de la estructura when

 val age3 = 60
 val age4 = 40
 val nomb ="maria"
 val variable: Any = 10.0

fun main(args: Array<String>){

    println("when 1")
    when {
      age3 < 18 -> println("Menor de edad")
      age3 > 60 -> println("Mayor de edad")
      else -> println("Tercera de edad")
    }

    println("when 2")
    when (age4) {
        in 1..17 -> println("Menor de edad")
        in 18..59 -> println("Mayor de edad")
        in 59..100 -> println("Tercera de edad")
        else -> println("Incorrecto")
    }

    println("when 3")
    when (nomb.uppercase()) {
        "juan".uppercase(),"Alejandro".uppercase() -> println("hombre")
        "maria".uppercase() -> println("mujer")
        else -> println("No esta en la lista")
    }

    println("when 4")
    when (variable) {
        is Int -> println("Entero")
        is String -> println("Cadena")
        is Double -> println("double")
    }
}