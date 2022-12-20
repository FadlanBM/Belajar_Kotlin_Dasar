fun sayHello(namaDepan:String,namaBelakang:String?){
    if (namaBelakang==null) {
        println("Hello $namaDepan")
    }else{
        println("Hello $namaDepan $namaBelakang")
    }

}

fun jajalhal(nilaiPertama: Int,nilaiKedua: Int){
    var hasil=nilaiKedua+nilaiPertama
    println("Nilai Dari hasil $nilaiPertama + $nilaiKedua hasil = $hasil")

}


fun main() {
    sayHello("Samsulm","kurniawan")
    sayHello("Budi","Santoso")
    sayHello("Dodo",null)
    jajalhal(18,12)
}