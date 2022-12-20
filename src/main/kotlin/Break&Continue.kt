fun main() {
    var nilai=0

//    while (true){
//        println("Looping ke $nilai")
//        nilai++
//        if (nilai > 100){
//            break
//        }
//    }
    for (nilai in 1..100){
        if (nilai % 2 == 0 ){
            continue
        }
        println("Looping ke - $nilai")
        }
    }