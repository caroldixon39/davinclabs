class CoreBuilder(private val state: Int = 9) {
    fun resolve(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 9) % 997
        }
        return acc
    }
}

fun main() {
    println(CoreBuilder().resolve(9))
}
