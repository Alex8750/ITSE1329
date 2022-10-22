package week05
fun main(){
println("What is the number of shares?")
    var NS = readLine()!!.toDouble()
    println("What is the purchased price per share?")
    var PP = readLine()!!.toDouble()
    println("What is the purchase commission paid?")
    var PC = readLine()!!.toDouble()
    println("What is the sale commission?")
    var SC = readLine()!!.toDouble()
    println("What is the sale price per share")
    var SP = readLine()!!.toDouble()
println("The total return of your stocks is ${stockProfit(NS,PP,PC,SC,SP)}")
}
fun stockProfit(NS:Double,PP:Double,PC:Double,SC:Double,SP:Double):Double{
     var profit = ((NS*SP)-SC)-((NS*PP)+PC)
    return profit
}