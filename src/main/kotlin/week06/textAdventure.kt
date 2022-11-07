package week06

fun main(){

    var counter = 0
    var rooms = arrayOf("You have entered the vampires lair",//0
                        "You have entered the south hall",//1
                        "You have entered the dining room",//2
                        "You have entered the princesses room",//3
                        "You have entered the north hall",//4
                        "You have entered the kitchen",//5
                        " You have entered the balcony")//6


    var legal = arrayOf("There are rooms to the east and north",//0
                        "There are rooms to the north,east and west",//1
                        "There are rooms to the west and north",//2
                        "There are rooms to the south and east",//3
                        "There are rooms to the south, east,west and north",//4
                        "There are rooms to the south and west",//5
                        "There are rooms to the south")//6
    println("You are able to move around the castle using 'n' , 's', 'w' and 'e'" )
    println("Click enter to start")
    var direction = readLine()
    while(true){
    if (counter == 0 ) {
        println(rooms[0])
        println(legal[0])
        direction = readLine()
        if (direction == "e") {
            counter = 1
        }
        if (direction == "n") {
            counter = 3
        }
    }
    if (counter == 1) {
        println(rooms[1])
        println(legal[1])
        direction = readLine()
        if (direction == "e") {
            counter = 2
        }
        if (direction == "w") {
            counter = 0
        }
        if (direction == "n") {
            counter = 4
        }
    }
        if (counter == 2){
            println(rooms[2])
            println(legal[2])
            direction = readLine()
            if(direction == "w"){
                counter = 1
            }
            if (direction == "n"){
                counter = 5
            }
        }
        if (counter == 3){
            println(rooms[3])
            println(legal[3])
            direction = readLine()
            if (direction == "s"){
                counter =0
            }
            if (direction == "e"){
                counter = 4
            }
        }
        if(counter == 4){
            println(rooms[4])
            println(legal[4])
            direction = readLine()
            if(direction == "n"){
                counter = 6
            }
            if(direction == "s"){
                counter = 1
            }
            if(direction == "e"){
                counter = 5
            }
            if (direction == "w"){
                counter = 3
            }
        }
        if (counter == 5){
            println(rooms[5])
            println(legal[5])
            direction = readLine()
            if(direction == "s"){
                counter = 2
            }
            if(direction == "w"){
                counter = 4
            }
        }
        if (counter == 6){
            println(rooms[5])
            println(legal[5])
            direction = readLine()
            if (direction == "s"){
                counter = 4
            }
        }



    }
}