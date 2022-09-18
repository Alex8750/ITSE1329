package week03
// The program asks the user for an input for the objects mass. If the mass newtons is below 10 the program will say it
// is too light. If the newton is above 1000 ir will state it is too heavy. Any number in between that, the object is
// valid
fun main (args: Array<String>){
    println("What is the objects mass")
    val mass = Integer.valueOf(readLine())
    val weight = mass * 9.8
    if (weight < 10)
        print("Your object is too light ")
    else if (weight > 1000)
        print("Yout object is too heavy")
    else
    {
        print("Your object is valid")
    }
}