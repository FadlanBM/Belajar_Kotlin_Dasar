infix fun String.to(type:String):String{
    if (type == "UPP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val nama="Fadlan" to "UP"
    println(nama)
}