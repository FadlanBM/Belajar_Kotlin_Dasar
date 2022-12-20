infix fun String.to(type: String):String{
    if (type == "up"){
        return  this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
      val hasil="Fadlan" to "up"
    println(hasil)
}