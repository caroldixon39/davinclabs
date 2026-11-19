class LiteController(private val state: Int = 89) {
    fun build(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 89) % 997
        }
        return acc
    }
}

fun main() {
    println(LiteController().build(89))
}
