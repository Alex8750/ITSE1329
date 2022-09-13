package week02

fun main(args: Array<String>) {
    print("How many cookies did you eat: ")

    val number = Integer.valueOf(readLine())
    val calories = number*75
    println("Your calorie intake was: " + calories)
}