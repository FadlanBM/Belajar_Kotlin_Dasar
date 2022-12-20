fun main() {
    //code string
    var namadepan:String="Fadlan"
    var namatengah:String="Buwono"
    var namabelakang:String="Mukti"
    //Menggambungkan String
    var namafull:String=namadepan +" "+ namatengah + " " + namabelakang
    //Menggabungkan dengan String Tamplate ($)
    var lengkap:String="$namadepan $namatengah $namabelakang"
    //Mengetahui panjang string
    var desc:String="$lengkap length=${lengkap.length}"
    //String Trim Margin
    var namalengkap:String  =""" 
           |Fadlan
           |Buwono
           |Mukti
           """.trimMargin()

    //Menampilkan data
    println("Nama depan: $namadepan")
    println("Nama tengah: $namatengah")
    println("Nama Belakang: $namabelakang")
    println("Nama Lengkap:\n$namalengkap" )
    println(lengkap)
    println(desc)
    println("Nama Lengkap : " + namafull)
}