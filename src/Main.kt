class Main(var name: String){

    constructor(a: Int) : this(a.toString()) {}

    val a: Int
        get(){return 4}

    init {
        println("Init block ${name}")
    }
}

fun main() {
}



enum class Planets(var polishName: String){
    Mars("Mars"), Earth("Ziemia");

    fun showPolishName(){}
}