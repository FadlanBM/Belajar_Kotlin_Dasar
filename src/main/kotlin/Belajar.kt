fun String.Sapaan():String="Hallo $this"
fun String.panggilan()= println("Selamat pagi $this")

fun main() {
    "Samsin".panggilan()
    val nama="Fadlan"
    println(nama.Sapaan())
}