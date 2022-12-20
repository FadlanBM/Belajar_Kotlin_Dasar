fun kuntul(vararg nilai:Int):Int{
    var hasil=0

    for (nilaie in nilai){
        hasil += nilaie
    }
    return hasil
}

fun main() {
    val total=kuntul(10,19,29)
    println("Hasil Vararg adalah $total")
}