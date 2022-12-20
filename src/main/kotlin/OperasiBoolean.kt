fun main() {
    var NilaiAttitut=76
    var NilaiMataPelajaran=80
    var NilaiExtra=78

    var ApakahLulusAttitut=NilaiAttitut>=76
    var ApakahLulusMataPelajaran=NilaiMataPelajaran>=76
    var ApakahLulusExtra=NilaiExtra>=76

    val Lulus=ApakahLulusAttitut&&ApakahLulusMataPelajaran&&ApakahLulusExtra
    println("Hasil Kelulusan " + Lulus)
}