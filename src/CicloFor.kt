//PArte 1
//Ejercicio 6: Uso del ciclo For

fun main(args: Array<String>){
    //Declaramos las variables
    val num = intArrayOf(1,2,3,4,5,6)

    for (num:Int in num)print(num)

    println(" -------------------- ")
    println("--- Numero Pares --- ")
    val numPar = intArrayOf(2,4,6,8,10)
    for((index,valor) in numPar.withIndex()){
        println("Elemento $valor")
    }

    //For Each
    for(i in 1..10) println(i)
}