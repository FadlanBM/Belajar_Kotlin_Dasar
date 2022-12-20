fun main() {
    fun hello(Nama:String=""):String{
        if (Nama==""){
            return "Hello Bro"
        }else{
            return "Hello $Nama"
        }
    }
    println(hello())
    println(hello("Fadlan"))
}

