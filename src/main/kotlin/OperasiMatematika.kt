fun main() {
println("=============OPERASI MATEMATIKA===========")
 var hasil=10+3 //Cara penjumlahan
     println("hasil tambah dari 10+3 = " + hasil)
     hasil=12-2 //Cara pengurangan
     println("Hasil kurang dari 12-2 = " + hasil)
     hasil=7*3 //Cara perkalian
     println("Hasil kali 7X3 = " + hasil)
 var pem =10.0f/4.0f //Cara pembagian
     println("Hasil bai 10 : 4 = " + pem)

println("============AUGMENTED ASSIGNMENTS==========")
 var totalHarga=0

 val barang1=100
 totalHarga += barang1 // (+=)

 val barang2=200
 totalHarga-=barang2 // (-=)

 val barang3=300
 totalHarga*=barang3 // (*=)

 var totaldouble:Double=totalHarga.toDouble()
 val discount=2.0 // (/=)
 totaldouble/=discount

 println("Total Keseluruhan adalah = " + totaldouble)

 println("=================UNARY OPERATOR===============")

 var nilai1=10
 nilai1++// nilai1 di tambah 1
 nilai1++// nilai1 di tambah 1
 nilai1++// nilai di tambah 1
 println("Hasil nilai1 setelah di ++ = " + nilai1)

 nilai1--// nilai di kurang 1
 nilai1--// nilai di kurang 1
 nilai1--// nilai di kurang 1
 println("hasil nilai setelah di -- = " + nilai1)

 var suhu=-10 // menyebutkan bahwa nilai suhu adalah minus
 println(suhu)

suhu=+10 //Menyebutkan bahwa nilai suhu adalah Plus
         //tidak perlu menyebutkan Plus di kotlin karena sudah defauld adalah Plus
 println(suhu)

 //Untuk Boolean
 val sehat=true
 println("Sebelum di tambah (!) = " + sehat)
 println("Sesudah di tambah (!) = "+!sehat) //(!) digunakan untuk membaliakan nilai boolean
}