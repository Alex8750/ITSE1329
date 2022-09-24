package week02

fun main() {
    println("How much money did you deposit into this account?")
    val deposit = Integer.valueOf(readLine())
    println("What was the annual interest rate for this account in percent form?")
    val rate = Integer.valueOf(readLine())
    println("Was the account compounded 4 times a year or 12?")
    val compounded = Integer.valueOf(readLine())
    println("How many years will this account earn interest")
    val years = Integer.valueOf(readLine())
    val expo = compounded * years
    val total = (deposit*(rate/compounded))
    val result = Math.pow(total.toDouble(), expo.toDouble())
    println(result)
}


