package week05
fun main(){
for(i in 1..10 step 1)
    println("fibonacci($i) // = ${fibonacci(i)}")
}
fun fibonacci(number: Int): Int{
    if(number < 0) {
        return 0
    }
    if(number == 1 || number == 2) {
        return 1
    }
    var value = fibonacci(number-1)+ fibonacci(number-2)
    return value
}


