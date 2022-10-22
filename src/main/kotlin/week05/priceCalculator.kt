package week05

fun main(){
    println("Enter Item cost >>")
    var cost = readln().toDouble()
    println("Enter Item markup percentage")
    var percent = readln().toDouble()
    System.out.println("The Item cost is " + calculateRetail(cost,percent))

}
fun calculateRetail (x:Double, y : Double): Double {
    var total = x + (x*(y/100))
    return total
}