package week05

fun main(args: Array<String>){
    celcius(20)
}
fun celcius(faren: Int){
    for(i in 1 .. faren step 1){
        var cel=(5.0/9)*(i-32)
        println("Celcius $i : $cel Fahrenheit")
    }

}

