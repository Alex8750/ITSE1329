package week03
// this program should ask the user for the number of the day, month and the year.
// the program recieves this data and determin if the date is magic or not
// the date of magic if day and month times is equal to the last 2 digits of the year
// the date is not magic if the day and month times is not equal to the last 2 digits of the year
fun main (args: Array<String>){
    println("Enter the number of the day")
    val day = Integer.valueOf(readLine())
    println("Enter the number of the month")
    val month = Integer.valueOf(readLine())
    println("Enter the last 2 number of the year")
    val year = Integer.valueOf(readLine())

    println("The date is " + day + "/" + month + "/" + year)
    if (day*month == year) {
        print("Your date is magic")
    } else {
            println("Your date is not magic")
    }

}