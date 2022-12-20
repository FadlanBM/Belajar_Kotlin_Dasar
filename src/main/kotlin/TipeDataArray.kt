fun main() {
    val nama:Array<String> = arrayOf("Fadlan" ,"Buwono","Mukti")
    println(nama[0] + nama[1] + nama[2])
    nama.set(0,"Budi")
    nama.set(1,"Ganteng")
    nama[2]="Banget"
    println(nama[0])
    println(nama)
    println(nama[1])
    println(nama[0] + nama[1] + nama[2])
    val angka:Array<Int> = arrayOf(1,2,3)
    println(angka[0])
    println(angka[2])

    val mengikuti:Array<String?> = arrayOfNulls(5)
    mengikuti[0]="Fadlan"
    mengikuti[1]="Buwono"
    mengikuti[2]="Mukti"
    mengikuti[3]="Ganteng"
    mengikuti[4]="Banget"
    println(mengikuti.size)
}