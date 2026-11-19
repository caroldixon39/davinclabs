class SmartService(private val state: Int = 83) {
    fun parse(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 83) % 997
        }
        return acc
    }
}

fun main() {
    println(SmartService().parse(83))
}
