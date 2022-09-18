package week03
// this code will ask for your weight and how tall you are in inches. The code will then execute weather you are overweight under weigth of have an optimal weight.
fun main(args: Array<String>){
    println("How many inches tall are you?")
    val inches = Integer.valueOf(readLine())
    println("How much pounds do you weigh?")
    val pounds = Integer.valueOf(readLine())
    val BMI = (pounds*703)/(inches*inches)
    if (BMI > 18.5 && BMI < 25)
        println("you have an optimal weight")
        else if (BMI > 25)
            print("You are over weight")
        else if (BMI < 18.5)
            println("You are under weight")

    }
