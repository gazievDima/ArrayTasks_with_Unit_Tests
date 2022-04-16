class ArraySearch {

    fun searchNumber(searchValue: Int, array: Array<Int>): Boolean {
        for (i in array.indices) {
            if (array[i] == searchValue) {
                return true
            }
        }
        return false
    }

    fun searchMaxNumber(array: Array<Int>): Int {
        var max = array[0]
        for (i in array.indices) {
            if (array[i] > max) {
                max = array[i]
            }
        }
        return max
    }

    fun searchMinNumber(array: Array<Int>): Int {
        var min = array[0]
        for (i in array.indices) {
            if (array[i] < min) {
                min = array[i]
            }
        }
        return min
    }


    fun returnArrOddNumbers(array: Array<Int>): Array<Int> {
        var sizeArr = 0
        for (i in array.indices) {
            if (array[i] % 2 != 0) {
                sizeArr++
            }
        }
        val newArray = Array(sizeArr) {0}
        var count = 0
        for (j in array.indices) {
            if (array[j] % 2 != 0) {
                newArray[count] = array[j]
                count++
            }
        }
        return newArray
    }

    fun returnArrEvenNumbers(array: Array<Int>): Array<Int> {
        var sizeArr = 0
        for (i in array.indices) {
            if (array[i] % 2 == 0) {
                sizeArr++
            }
        }
        val newArray = Array(sizeArr) {0}
        var count = 0
        for (j in array.indices) {
            if (array[j] % 2 == 0) {
                newArray[count] = array[j]
                count++
            }
        }
        return newArray
    }
}