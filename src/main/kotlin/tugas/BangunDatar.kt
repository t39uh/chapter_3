fun getDoubleInput(question: String) : Double {
    println(question)
    val result = readLine()!!.toDoubleOrNull()
    if (result == null){
        return getDoubleInput(question)
    }
    return result
}

fun luasPersegi():Double{
    val sisi = getDoubleInput("Masukkan sisi persegi:")
    return 2*sisi
}

fun kelilingPersegi():Double{
    val sisi = getDoubleInput("Masukkan sisi persegi:")
    return 4*sisi
}

fun luasPersegiPanjang():Double{
    val panjang = getDoubleInput("Masukkan panjang:")
    val lebar = getDoubleInput("Masukkan lebar:")
    return panjang*lebar
}

fun kelilingPersegiPanjang():Double{
    val panjang = getDoubleInput("Masukkan panjang:")
    val lebar = getDoubleInput("Masukkan lebar:")
    return 2*panjang+2*lebar
}

fun kelilingSegitiga():Double{
    val sisi1 = getDoubleInput("Masukkan panjang sisi 1:")
    val sisi2 = getDoubleInput("Masukkan panjang sisi 2:")
    val sisi3 = getDoubleInput("Masukkan panjang sisi 3:")
    return sisi1+sisi2+sisi3
}

fun luasSegitiga():Double{
    val alas = getDoubleInput("Masukkan lebar alas:")
    val tinggi = getDoubleInput("Masukkan tinggi:")
    return 0.5*alas*tinggi
}

fun luasLingkaran():Double{
    val jari = getDoubleInput("Masukkan jari jari:")
    return Math.PI * jari * jari
}

fun kelilingLingkaran():Double{
    val jari = getDoubleInput("Masukkan jari jari:")
    return 2 * Math.PI * jari
}

fun main(){
    println(luasPersegi())
    println(luasLingkaran())
}
