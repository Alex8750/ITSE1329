package week05

fun main(){
    for(i in 1..10 step 1){
    println("The object fell ${fallingDistance(i)} meters within $i seconds")
}
}
fun fallingDistance(seconds:Int):Double{
       var distance = (.5)*(9.8*(seconds*seconds))
    return distance
}