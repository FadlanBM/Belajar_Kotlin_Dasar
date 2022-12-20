fun arraybiasa(nilai:Array<Int>):Int{
    var hasil=0
    for (hasile in nilai){
        hasil +=hasile
    }
    return hasil

}

fun arrayvararg(vararg nilai:Int):Int{
    var hasil=0

    for (hasile in nilai){
        hasil +=hasile
    }
    return hasil
}



fun main(){
    //hitung dengan array biasa
    var array1= arrayOf(10,12)
    var hasilll=arraybiasa(array1)
    println(hasilll)
    //hitung dengan vararg
    var hitungari=arrayvararg(19,21)
    println(hitungari)
}