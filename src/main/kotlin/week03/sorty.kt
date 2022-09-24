fun main(){
    println("Name one:")
    var name1 = readLine()!!
    println("Name two:")
    var name2 = readLine()!!
    println("Name three:")
    var name3 = readLine()!!

   if ((name1.compareTo(name2)) < 0 && (name1.compareTo(name3)) < 0){
       println(name1)
       if ((name2.compareTo(name3) < 0 )){
           println(name2);
           println(name3);
       } else {
           println(name2);
           println(name3);
       }
   }
    else if ((name2.compareTo(name3)) < 0 && (name2.compareTo(name1)) < 0){
        println(name2)
        if((name1.compareTo(name3) < 0)) {
            println(name1);
            println(name3);
        } else {
            println(name3)
        }
    }

}