fun hello(namadepan:String,Namabelakang:String?=null){
    if (Namabelakang==null){
        println("Hello $namadepan")
    }else{
        println("Hello $namadepan $Namabelakang")
    }
}
fun main() {
     hello("Samsul")
    hello("Dudi","Samtosa")
}