package week03
// program will ask user for the user to input a number in between 1-10
// values 1 - 10 are then translated into roman numerals
// program should error when a number higher than 10 is implemented
fun main(args: Array<String>) {
    println("Enter a number in between 1-10")
    val number = Integer.valueOf(readLine())
    val result = when (number)
    {
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        10 -> "X"
        else -> "Must be a number in between 1-10"
    }
    println(" is " + result + " in roman")
}