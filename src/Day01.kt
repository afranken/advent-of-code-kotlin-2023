fun main() {
    fun part1(input: List<String>): Int {
        var result = 0
        input
            .asSequence()
            .filterNot(String::isBlank)
            .map(String::toList)
            .map {
                var first: Int? = null
                var last: Int? = null
                it
                  .filter { it.isDigit() }
                  .forEach {
                        if (first == null) {
                            first = it.digitToInt()
                        }
                        last = it.digitToInt()
                    }
                "$first$last".toInt()
            }
            .forEach {
                result += it
            }
        return result
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142)

    val input = readInput("Day01")
    check(part1(input) == 56049)

    part2(input).println()
}
