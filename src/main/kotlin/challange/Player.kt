package challange

class Player(nama: String) : Person(nama) {
    private var handState = Hand()

    override fun getName(): String {
        return nama
    }

    fun askHandFaceValue(){
        var status = false
        var result : String
        do {
            print("Masukkan $nama :")
             result= readLine().toString()
            status = handState.setHandState(result)
        } while (status == false)
    }

    fun getHandFaceValue() : String?{
        return handState.getHandState()
    }
}

/*
fun main() {
    var player = Player("hore")
    println(player.getName())
    player.askHandFaceValue()
    println(player.getHandFaceValue())
}*/
