//variable variable constant
const val Applicattion ="belajar kotlin"
const val Version="2.2.1"


fun main() {

    //Variable mutable
    val namadepan:String="fadlan"
    var namabelakang="samsul"
    println(namadepan)
    println(namabelakang)

    //bisa diubah varible nya
    namabelakang="Buwono"
    println(namabelakang)

    //variable Immutable
    val umur:Int=10
    val  tahunlahir=2004
    println(umur)
    println(tahunlahir)

    //eror jika di ubah variable nya
    // umur=19

    //Penggunaan varible nullable
    var name:String?=null
    println(name)
    name="fadlan"
    println(name)
    //cara mengakses null yang benar
    println(name?.length)

    println("$Applicattion : $Version")

}