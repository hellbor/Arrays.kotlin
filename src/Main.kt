fun main() {
    var array = IntArray(10) {it + 1}
    println("Чётные элементы: ")
    for(index in 0 until array.size) {
        var value = array[index]
        if(value % 2 == 0) {
            println("$value ")
        }
    }
    println()



    val numbers = arrayOf(2,7,-3,0,17,-11,20,15,-9)
    for(i in numbers) {
        val category = when {
            i < 0 -> "negative"
            i == 0 -> "zero"
            i in 1.. 9 -> "small"
            else -> "big"
        }
        println("$numbers -> $category")
    }
}