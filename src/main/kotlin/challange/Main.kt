package challange

import java.io.Console

fun printBold(message:String){
    val color = "\u001B[43m"
// Resets previous color codes
    val reset = "\u001b[0m"
    println(color+message+reset)
}


fun main() {

    var pemain1 = Player("pemain 1")
    var pemain2 = Player("pemain 2")

    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    pemain1.askHandFaceValue()
    pemain2.askHandFaceValue()

    println("Hasil:")
    val result = HandFace.winOrLose(pemain1.getHandFaceValue()!!, pemain2.getHandFaceValue()!!)
    when(result){
        HandFace.WIN -> printBold("${pemain1.getName()} MENANG!")
        HandFace.LOSE -> printBold("${pemain2.getName()} MENANG!")
        HandFace.DRAW -> printBold("DRAW!")
    }
}