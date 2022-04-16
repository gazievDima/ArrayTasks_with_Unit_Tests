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

    fun getStringToCountRepeatNumbers(array: Array<Int>): String {
        val arrUniqueNumbers = IntArray(getSizeForNewArrayUniqueNumber(array))
        var result = ""
        var currentIndex = 0
        for (i in array.indices) {
            if (!checkExistsNumber(arrUniqueNumbers, array[i])) {
                var count = 0
                for (j in array.indices) {
                    if (array[i] == array[j]) count++
                }
                arrUniqueNumbers[currentIndex] = array[i]
                currentIndex++
                result = """${result}число: ${array[i]} встречается $count раз(а)."""
            }
        }
        return result
    }

    private fun checkExistsNumber(arr: IntArray, value: Int): Boolean {
        for (i in arr.indices) {
            if (arr[i] == value) return true
        }
        return false
    }

    private fun getSizeForNewArrayUniqueNumber(array: Array<Int>): Int {
        val newSize = IntArray(array.size)
        var res = 0
        var countNum = 0
        var count = 0
        for (i in newSize.indices) {
            newSize[i] = 0
        }
        for (i in array.indices) {
            if (newSize[i] == 0) {
                for (j in array.indices) {
                    if (array[i] == array[j]) {
                        newSize[j] = 1
                        count++
                    }
                }
            }
            if (countNum < count) {
                countNum = count
                res++
            }
        }
        return res
    }
}