package week04
import kotlin.random.Random
fun main(){
    val random = Random.nextInt(0,100)
    println("Guess the random number: ")
    var guess = Integer.valueOf(readLine())
    while(guess != random){
        if (guess < random)
            println("Number was too low")
        else if (guess > random)
            println("Number was too high")
        println("Try again")
        guess = Integer.valueOf(readLine())
    }
    if (guess == random){
        println("Correct the number was $random")
    }
}