//Parte 1
//Ejercicio: 8: Uso de la etiqueta break y continue

fun main(args: Array<String>){

    loop@ for(i in 1..10){
        for(j in 1 .. 10){
            if(i == 5 && j== 5){
                println("Estamos en la mitad")
                break@loop
            }else {
                println("i=$i, j= $j")
            }
        }
    }
}