import java.math.BigDecimal
import java.util.Date

//Parte 2
//Ejercicio 7: Practica de funciones

fun main(args: Array<String>){

    println("Funcion 1")
    mostrarFecha()

    println("Funcion 2")
    calcularImpuesto(BigDecimal("999"), BigDecimal("14"))
}

//Funcion 1
fun mostrarFecha(){
    println("--------------------")
    println(Date())
    println("--------------------")
}

//Funcion 2
fun calcularImpuesto(valor: BigDecimal, impuesto: BigDecimal) {
  var resul = valor.divide(BigDecimal("100"))
    resul = resul.multiply(impuesto)

    println(resul)
}