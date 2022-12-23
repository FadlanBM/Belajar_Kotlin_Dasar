fun main() {
    fun menopause(nama:String=""):String{
        return when(nama){
            ""->"Samlekom"
            else->"Mamang $nama"
        }

//        return if (nama==""){
//            "Hello Mashe"
//        }else{
//            "Helo $nama"
//        }
    }

    println(menopause())
   var nama= menopause("Fadlan")
    println(nama)
}