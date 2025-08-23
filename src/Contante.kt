//PArte 1
//Ejercicio 3: Uso de funciones
fun main(args: Array<String>){
    printHeader("Funciones con parametro")
    var result = printFooter("Funcion que retorna un valor")
}

fun printHeader(titulo:String){
    println("----------------------")
    println("--- "+ titulo + " -----")
    println("----------------------")
}
//funcion que retorna un resultado
fun printFooter(titulo:String):String{
    var footer = "--------------------"

    footer +=titulo
    footer +="------------------------"

    return footer
}