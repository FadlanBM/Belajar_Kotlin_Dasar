fun main() {
val nilai = 'A'
    when(nilai)
    {
        'A' ->
        {
            println("Sangat bagus")
        }
        'B' ->
        {
            println("Bagus")
        }
        'C' ->
        {
            println("Tidak terlalu buruk")
        }
        else ->
        {
            println("Maaf anda harus mengulang lagi")
        }


    }
    when(nilai){
        'A','B','c' -> println("Selamat anda lulus")
        else -> {
        println("Maaf anda harus mengulang")
    }
    }

    val data = arrayOf('A','B','c')
    when(nilai){
        in data -> println("Selamat anda lulus")
        !in data -> println("Maaf anda tidak lulus ")
    }

    val nama="fadlan"
    when (nama){
        is String -> println("Ini adalah string")
        !is String -> println("Ini bukan string")
    }

    val ratarata=678
    when{
        ratarata<100 -> println("a")
        ratarata>=60 -> println("Murit anda pintar")
        ratarata<60 -> println("Murit anda kurang pintar ")
        else -> println("Nilai tidak di temukan")
    }
}