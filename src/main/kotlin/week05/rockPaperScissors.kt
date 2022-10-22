package week05

fun main() {
    var computerChoice = ((1..3).random())
    println("Enter rock, paper, or scissors :")
    var playerChoice = readLine()
    computerChoice(computerChoice)
    rock(playerChoice.toString(), computerChoice)
    paper(playerChoice.toString(), computerChoice)
    sciccors(playerChoice.toString(), computerChoice)
    while(playerChoice.toString() == "rock" && computerChoice == 1){
            println("Try again")
            println("Enter rock,paper, or scissors")
            playerChoice = readLine()
            computerChoice = ((1..3).random())
            computerChoice(computerChoice)
            rock(playerChoice.toString(), computerChoice)
            paper(playerChoice.toString(), computerChoice)
            sciccors(playerChoice.toString(), computerChoice)
        }
    while(playerChoice.toString() == "paper" && computerChoice == 2){
        println("Try again")
        println("Enter rock,paper, or scissors")
        playerChoice = readLine()
        computerChoice = ((1..3).random())
        computerChoice(computerChoice)
        rock(playerChoice.toString(), computerChoice)
        paper(playerChoice.toString(), computerChoice)
        sciccors(playerChoice.toString(), computerChoice)
    }
    while(playerChoice.toString() == "scissors" && computerChoice == 3){
        println("Try again")
        println("Enter rock,paper, or scissors")
        playerChoice = readLine()
        computerChoice = ((1..3).random())
        computerChoice(computerChoice)
        rock(playerChoice.toString(), computerChoice)
        paper(playerChoice.toString(), computerChoice)
        sciccors(playerChoice.toString(), computerChoice)
    }

}
fun computerChoice(computerChoice: Int){
    if (computerChoice == 1)
        println("Computer chose rock!")
    else if(computerChoice == 2)
        println("Computer chose paper!")
    else {
        println("Computer chose scissors!")
    }
}
fun rock(playersChoice:String, computerChoice:Int){
    if(playersChoice == "rock" && computerChoice == 1)
        println(" Game is a tie")
    else if (playersChoice == "rock" && computerChoice == 2 )
        println("Computer wins!!")
    else if ( playersChoice == "rock" && computerChoice == 3)
        println("Player wins!!")
}
fun paper(playersChoice:String, computerChoice:Int){
    if(playersChoice == "paper" && computerChoice == 1)
        println("Player wins!!")
    else if (playersChoice == "paper" && computerChoice == 2 )
        println("Game is a tie!!")
    else if ( playersChoice == "paper" && computerChoice == 3)
        println("Computer wins!!")
}
fun sciccors(playersChoice: String, computerChoice: Int){
    if(playersChoice == "scissors" && computerChoice == 1)
        println("Computer wins!!")
    else if (playersChoice == "scissors" && computerChoice == 2 )
        println("Player wins!!")
    else if ( playersChoice == "scissors" && computerChoice == 3)
        println("Game is a tie!!")
}

