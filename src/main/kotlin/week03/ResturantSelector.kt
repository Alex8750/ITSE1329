package week03

fun main(){
    println("Is anyone is your party vegetarian?")
    var vegetarian = readLine()
    println("Is anyone in your party vegan?")
    var vegan = readLine()
    println("Is anyone in your party gluten free? ")
    var gluten = readLine()

    if (vegetarian == "yes") && (vegan == "yes"){
        println("Main Street Pizza")
    }


}