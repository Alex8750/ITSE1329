package week04
import kotlin.random.Random
fun main(){
    val random = Random.nextInt(0,100)
    println(random)
    println("Guess the random number: ")
    var guess = Integer.valueOf(readLine())
}