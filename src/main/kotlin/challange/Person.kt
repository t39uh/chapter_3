package challange


abstract class Person {
    protected lateinit var nama : String
    constructor(nama:String){
        this.nama = nama
    }
    abstract fun getName():String
}