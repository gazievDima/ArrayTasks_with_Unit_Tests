class ArraySum {

    fun sumAllNumbers(array: Array<Int>): Int {
        var sum = 0
        for (i in array.indices) {
            sum += array[i]
        }
        return sum
    }

    fun sumOddNumbers(array: Array<Int>): Int {
        var sum = 0
        for (i in array.indices) {
            if (array[i] % 2 != 0) {
                sum += array[i]
            }
        }
        return sum
    }

    fun sumEvenNumbers(array: Array<Int>): Int {
        var sum = 0
        for (i in array.indices) {
            if (array[i] % 2 == 0) {
                sum += array[i]
            }
        }
        return sum
    }
}
