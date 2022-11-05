package week06
/* Alexander Garica
   11/5/22
   6.2
 */
fun main(){
var array = arrayOf("Yes, of course!",
    "Without a doubt, yes.",
    "You can count on it.",
    "For sure!", "Ask me later.",
    "I’m not sure.",
    "I can’t tell you right now. I’ll tell you after my nap. No way!",
    "I don’t think so.",
    "Without a doubt, no.",
    "The answer is clearly NO.")
    var quit = "quit"
    var question: String? = null
    while(question != quit ){
        println("Ask a question or enter quit to end the program!!")
        question = readLine()
        println(array[(0..8).random()])
    }
}