fun String.Hallo():String="Hello $this"

fun String.printapakabar(): Unit= println("Apa kabar $this")

fun main() {
    val nama="fadlan"
    println(nama.Hallo())
    "budi".printapakabar()
}