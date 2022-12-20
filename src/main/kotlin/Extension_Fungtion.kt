fun String.anjay()="Selamat Datang $this"
fun String.sapa()= println("Terimakasih Atas Kunjungannya $this")
fun Int.hitunga():Int=this+10


fun main() {
    val name="Fadlan"
    println(name.anjay())
    "Fadlan Buwono Mukti".sapa()
    "Kuntul".sapa()
    var jajal=10.hitunga()
    println("Hasil adalah $jajal")
}