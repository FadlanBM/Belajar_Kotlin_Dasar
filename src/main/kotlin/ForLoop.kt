fun main() {
    var array = arrayOf("Fadlan","Fajar","Bagas","Budi","Kuntil","Samsul")

    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    for (nilai in 100 downTo 0 step 2){
        println(nilai)
    }
    val ukuranarray =array.size - 1
    for (i in 0..ukuranarray){
        println("index $i = ${array.get(i)}")
    }
}