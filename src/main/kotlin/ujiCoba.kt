fun namauser(depan:String,tengah:String,belakang:String):Unit{
    println("Nama $depan $tengah $belakang")
}


fun main(){
    namauser(belakang = "Mukti",
             depan = "Fadlan",
             tengah = "Buwono")

    namauser(belakang = "samsul",
        depan = "Budi",
        tengah = "Hartono")
}