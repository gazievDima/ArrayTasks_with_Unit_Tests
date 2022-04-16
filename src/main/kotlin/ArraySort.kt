class ArraySort {


    fun sortArrayMinToMax(array: Array<Int>): Array<Int> {
        for(i in array.indices) {
            for (el in array.indices) {

                if (el < array.size - 1) {

                    if (array[el] > array[el + 1]) {
                        var buffer = 0
                        buffer = array[el]
                        array[el] = array[el + 1]
                        array[el + 1] = buffer
                    }
                }
            }
        }
        return array
    }

    fun sortArrayMaxToMin(array: Array<Int>): Array<Int> {
        for(i in array.indices) {
            for (el in array.indices) {

                if (el < array.size - 1) {

                    if (array[el] < array[el + 1]) {
                        var buffer = 0
                        buffer = array[el]
                        array[el] = array[el + 1]
                        array[el + 1] = buffer
                    }
                }
            }
        }
        return array
    }

    fun getStringSortArrayFirstEvenThenOdd(array: Array<Int>): String {
       val isNotSortedArrayEvenNumbers = getArrEvenNumbers(array)
       val sortedArrayEvenNumbers = sortArrayMinToMax(isNotSortedArrayEvenNumbers)

       val isNotSortedArrayOddNumbers = getArrOddNumbers(array)
       val sortedArrayOddNumbers = sortArrayMinToMax(isNotSortedArrayOddNumbers)

       var commonArray = Array<Int>(sortedArrayOddNumbers.size + sortedArrayEvenNumbers.size) {0}
       val count = 0
       commonArray = addValuesToArray(commonArray, sortedArrayEvenNumbers, count)
       commonArray = addValuesToArray(commonArray, sortedArrayOddNumbers, sortedArrayEvenNumbers.size - 1)

        return commonArray.contentToString()
    }

    private fun addValuesToArray(commonArray: Array<Int>, valuesArray: Array<Int>, count: Int): Array<Int> {
        var c = count
        for(i in valuesArray.indices) {
            commonArray[c] = valuesArray[i]
            c += 1
        }
        return commonArray
    }

    private fun getArrOddNumbers(array: Array<Int>): Array<Int> {
        var count = 0
        val newArr = Array<Int>(getCountOddNumbers(array)) {0}

        for (j in array.indices) {
            if (array[j] % 2 != 0) {
                newArr[count] = array[j]
                count++
            }
        }
        return newArr
    }

    private fun getArrEvenNumbers(array: Array<Int>): Array<Int> {
        var count = 0
        val newArray = Array<Int>(getCountEvenNumbers(array)) {0}

        for (j in array.indices) {
            if (array[j] % 2 == 0) {
                newArray[count] = array[j]
                count++
            }
        }
        return newArray
    }

    private fun getCountEvenNumbers(array: Array<Int>): Int {
        var number = 0
        for (i in array.indices) {
            if (array[i] % 2 == 0) {
                number++
            }
        }
        return number
    }

    private fun getCountOddNumbers(array: Array<Int>): Int {
        var number = 0
        for (i in array.indices) {
            if (array[i] % 2 != 0) {
                number++
            }
        }
        return number
    }

}