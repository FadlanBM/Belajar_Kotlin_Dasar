fun fullname(
        namadepan:String,
        namaTengah:String,
        namaAkhir:String
){
println("Hello $namadepan $namaTengah $namaAkhir")
}
fun main() {
      fullname("Fadlan","Buwono","Mukti")
     fullname(
             namaAkhir = "Mukti",
             namadepan = "Fadlan",
             namaTengah = "Buwono"
     )
    fullname(namaAkhir = "Mukti", namadepan ="Fadlan", namaTengah = "Buwono  " )
}