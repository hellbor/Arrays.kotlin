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
}