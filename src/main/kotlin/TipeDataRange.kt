fun main() {

    val range=1..100
    println(range)
    //macam macam operasi range
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    println()
    //range terbalik
    val range2=100 downTo 1
    println(range2)
    //macam macam operasi range
    println(range2.count())
    println(range2.contains(50))
    println(range2.contains(200))
    println(range2.first)
    println(range2.last)
    println(range2.step)

   println()
    //range dengan step
    val range3=100 downTo 1 step 2
    println(range3)
    //macam macam operasi range
    println(range3.count())
    println(range3.contains(50))
    println(range3.contains(200))
    println(range3.first)
    println(range3.last)
    println(range3.step)

    println()
    //range dengan step
    val range4=1..100 step 2
    println(range4)
    //macam macam operasi range
    println(range4.count())
    println(range4.contains(50))
    println(range4.contains(200))
    println(range4.first)
    println(range4.last)
    println(range4.step)

}