package challange


class HandFace{
    companion object{
        const val GUNTING = "gunting"
        const val BATU = "batu"
        const val KERTAS = "kertas"
        const val WIN = "win"
         const val DRAW = "draw"
        const val LOSE = "lose"
        val position = mapOf<String, Int> (GUNTING to 1, BATU to 2, KERTAS to 3)
        fun winOrLose(hand1 : String, hand2: String) : String{
            val count = position[hand1]!! - position[hand2]!!
            if (hand1 == hand2) {
                return DRAW
            } else if ((count == 1) || (count == -2)) {
                return WIN
            }
            return LOSE
        }
    }
}


class Hand {
    private lateinit var handState: String
    fun getHandState():String?{
        if (this::handState.isInitialized) return handState
        return null
    }
    fun setHandState(newHandState: String):Boolean{
        if (newHandState.lowercase() in HandFace.position.keys){
            handState = newHandState.lowercase()
            return true
        }
        return false
    }
}

/*
fun main(){
    var hand1 = Hand()
    var result = hand1.setHandState("motor")
    println(hand1.getHandState())

    //println(HandFace.winOrLose(HandFace.KERTAS, HandFace.GUNTING))
    print(HandFace.position.keys)
}*/
