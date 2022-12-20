fun hitung(a:Int, b:Int):Int{
    if (b==0){
        return 0
    }else{
        val total=a/b
        return total
    }
}

fun main() {
//    val hasil=hitung(10,10)
//    println(hasil)
    println(hitung(10,20))
    println(hitung(100,10))
}
