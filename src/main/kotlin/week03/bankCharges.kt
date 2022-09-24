package week03

fun main(){
    val total = 0
    val base = 10
    println("How many checks were written this month? ")
    val checks = Integer.valueOf(readLine())
    if (checks < 20){
        println("Your monthly fee for this month is $" + (base + ( checks * 0.10)))
    }
            else if (checks >= 20 && checks <= 39) {
        println("Your monthly fee for this month is $" + (base + (checks * 0.08)))
    }
            else if (checks >= 40 && checks <= 59 ) {
        println("Your monthly fee for this month is $" + (base + (checks * 0.06)))
    }
            else{
                println("Your monthly fee for this month is $" + (base + (checks * 0.04)))
            }

}