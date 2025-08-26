//Parte 2
//Ejercicio 5: Practica de estructura de control

 val sesionIn = false
 val age1 = 18
 val age2 = 21
 val credencialD = false

fun main (args: Array<String>) {
    if(sesionIn)
        println("bienvenido")
    else
        println("Inicia sesion")

    println("Segundo condicional")
    if(age1 <=18)
        println("Menor de edad")
    else
        println("Mayor de edad")

    println("Tercer condicional")
    if(age2 < 18)
        println("menor de edad")
    else if(age2 < 60 )
        println("Mayor de edad")
    else
        println("Tercera de edad")

    println("Cuarto condicional")
    if(age1 >= 60 || credencialD) {
        println("Descuento")
    }else{
        println("No aplica ")
    }

    println("condicional 5")
    println(if(age2 >= 18) "MAyor de edad" else "Menor de edad")
}
