//PArte 1
//Ejercicio 7: Uso del ciclo while y uso del ciclo do while

fun main(args: Array<String>)
{
    var i = 10

    while(i>0){
        println(i)
        i--
    }

    i=5
    //Ciclo do while
    println(" ----- Do while ------")
    do{
        println(i)
        i--
    }while(i >0)
}