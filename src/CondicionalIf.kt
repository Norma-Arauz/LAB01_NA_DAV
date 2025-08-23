//Parte 1
//Ejercicio 4: Condicional  If

fun main(args: Array<String>){
    val nam1 = "Sofia"
    val nam2 = "Anto"

    //Invocamos a getLongestName1
    getLongestName1(nam1, nam2)

    //Invocmos a getLongestName2
    getLongestName2(nam1, nam2)

    //Invocamos a getLongestName3
    getLongestName3(nam1, nam2)
}

fun getLongestName3(nam1: String, nam2: String) {
    val longestName= if(nam1.length > nam2.length) {
        println("El nombre mas largo es: $nam1")
        nam1
    }else{
        println("El nombre mas largo es: $nam2")
        nam2
    }

    println("longestName = $longestName")
}

fun getLongestName1(name1:String, name2:String){
    var longestName = name2
    if(name1.length > name2.length) longestName =name1

    println("El nombre más largo es: $longestName")
}

fun getLongestName2(name1:String, name2:String){
    var longestName =""

    if(name1.length > name2.length){
        longestName = name1
    } else{
        longestName = name2
    }

    println("El nombre más largo es: $longestName")
}