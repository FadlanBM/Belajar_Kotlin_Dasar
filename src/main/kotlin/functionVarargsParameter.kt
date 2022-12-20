fun hitungtotal(nama:String,vararg nilai:Int):Int{
    var total =0
    for(value in nilai){
        total += value
    }
    return total
}
fun main() {
    val hasil = hitungtotal("samsul",10,10,10)
    println(hasil)
}