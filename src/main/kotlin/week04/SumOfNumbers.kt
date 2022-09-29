package week04
/*Alexander Garcia
  4.1
  9/29/22
 */
fun main(){
    println("Enter a non 0 integer of your choice: ")
    val num = Integer.valueOf(readLine())
    var integer = 0
    for(i in 1 until num+1)
        integer += i
    println("The total sum of all numbers from 1 to $num is $integer")
}