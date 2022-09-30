package week04

fun main(){
    println("Enter a string: ")
    var string = readLine()!!
    println("Enter 1 charcter: ")
    var character = readLine()!!.single()
    var stringlen = string.length
    var zero = 0
    for(i in 0 until stringlen){
        if (character == string.get(i))
            zero += 1
    }
println("There was a toal of $zero characters in $string")
}