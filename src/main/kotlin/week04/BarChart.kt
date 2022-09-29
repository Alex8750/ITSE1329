package week04
/* Alexander Garcia
   4.4
   9/29/22
 */

fun main() {
    println("Enter today's sales for store 1: ")
    val store1 = Integer.valueOf(readLine())
    println("Enter today's sales for store 2: ")
    val store2 = Integer.valueOf(readLine())
    println("Enter today's sales for store 3: ")
    val store3 = Integer.valueOf(readLine())
    println("Enter today's sales for store 4: ")
    val store4 = Integer.valueOf(readLine())
    println("Enter today's sales for store 5: ")
    val store5 = Integer.valueOf(readLine())

    println("SALES BAR CHART")
        print("Store 1: ")
    for (i in 0 until store1 step 100)
        print("*")
    println()
    print("Store 2: ")
    for (i in 0 until store2 step 100)
        print("*")
    println()
    print("Store 3: ")
    for (i in 0 until store3 step 100)
        print("*")
    println()
    print("Store 4: ")
    for (i in 0 until store4 step 100)
        print("*")
    println()
    print("Store 5: ")
    for (i in 0 until store5 step 100)
        print("*")


}


