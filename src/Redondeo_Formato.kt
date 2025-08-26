
//PArte 2
//Ejercicio 4: Practica de redondeo y formato de salida
//de los numeros

import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>){
    val resul = 10.0 /4.0

    println("Numero sin redondear: $resul")
    //Redondeo opcion 1
    println("Opcion 1: " + Math.round(resul))

    //Redondeo  opcion 2
    println("Opcion 2: " +Math.ceil(resul))

    //Redondeo opcion 3
    println("opcion 3: " + Math.floor(resul))

    //Dar formato
    println("Formato de numero")
    val formato = DecimalFormat("#.##")

    println(formato.format(resul))

    formato.roundingMode = RoundingMode.CEILING
}