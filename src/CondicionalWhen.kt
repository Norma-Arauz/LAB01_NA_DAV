//Parte 1
//Ejercicio 5: Condicional When

fun main(args: Array<String>){
    val pass = "nmlsfsdf"

    when (pass.length) {
        0 -> println("Contraseña Vacia")
        in 1..4 ->println("Contraseña muy debil")
        in 5..6 -> println("contraseña debil")
        else -> println("Contraseña segura")
    }

    esPar(2)
}

//funcion que determina si un numero es par o no
fun esPar(num:Int) = when(num % 2){
    0-> println("El numero es par")
    else -> println("El numero es impar")
}