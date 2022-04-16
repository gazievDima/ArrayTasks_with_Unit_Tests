
import java.util.*


fun main() {
    val number = 5
    val arrayNumbers = arrayOf(1,3,2,4,8,5,6,9,7)
    
    val arrSum = ArraySum()
    println("сумма всех чисел: " + arrSum.sumAllNumbers(arrayNumbers))
    println("сумма нечетных чисел: " + arrSum.sumOddNumbers(arrayNumbers))
    println("сумма четных чисел: " + arrSum.sumEvenNumbers(arrayNumbers))

    val arrSearch = ArraySearch()
    println("поиск числа $number в массиве: " + arrSearch.searchNumber(5, arrayNumbers))
    println("поиск минимального числа в массиве: " + arrSearch.searchMinNumber(arrayNumbers))
    println("поиск максимального числа в массиве: " + arrSearch.searchMaxNumber(arrayNumbers))
    println("поиск и возврат массива нечетных чисел: " + arrSearch.returnArrOddNumbers(arrayNumbers).contentToString())
    println("поиск и возврат массива четных чисел: " + arrSearch.returnArrEvenNumbers(arrayNumbers).contentToString())

    val arrSort = ArraySort()
    println("сортировка массива по возрастанию: " + arrSort.sortArrayMinToMax(arrayNumbers).contentToString())
    println("сортировка массива по уменьшению: " + arrSort.sortArrayMaxToMin(arrayNumbers).contentToString())

}

//9. Вернуть массив(сперва идут четные числа, а затем нечетные по возрастанию)
fun sortArray(array: IntArray): String? {
    var sizeNotEvenArr = 0
    for (i in array.indices) {
        if (array[i] % 2 != 0) {
            sizeNotEvenArr++
        }
    }
    val newNotArray = IntArray(sizeNotEvenArr)
    var countNot = 0
    for (j in array.indices) {
        if (array[j] % 2 != 0) {
            newNotArray[countNot] = array[j]
            countNot++
        }
    }
    var pinNot = false
    while (pinNot == false) {
        pinNot = true
        for (i in newNotArray.indices) {
            if (i < newNotArray.size - 1) {
                if (newNotArray[i] > newNotArray[i + 1]) {
                    pinNot = false
                    var bufferNot = 0
                    bufferNot = newNotArray[i]
                    newNotArray[i] = newNotArray[i + 1]
                    newNotArray[i + 1] = bufferNot
                }
            }
        }
    }
    var sizeArr = 0
    for (i in array.indices) {
        if (array[i] % 2 == 0) {
            sizeArr++
        }
    }
    val newArray = IntArray(sizeArr)
    var count = 0
    for (j in array.indices) {
        if (array[j] % 2 == 0) {
            newArray[count] = array[j]
            count++
        }
    }
    var pin = false
    while (pin == false) {
        pin = true
        for (i in newArray.indices) {
            if (i < newArray.size - 1) {
                if (newArray[i] > newArray[i + 1]) {
                    pin = false
                    var buffer = 0
                    buffer = newArray[i]
                    newArray[i] = newArray[i + 1]
                    newArray[i + 1] = buffer
                }
            }
        }
    }
    val generalArray = IntArray(newArray.size + newNotArray.size)
    var countGeneral = 0
    for (i in newArray.indices) {
        generalArray[i] = newArray[i]
        countGeneral++
    }
    for (j in newNotArray.indices) {
        generalArray[countGeneral++] = newNotArray[j]
    }
    return Arrays.toString(generalArray)
}

fun getCountRepeatNumbers(array: IntArray): String? {
    val arrUniqueNumbers = IntArray(getSizeForNewArrayUnicNumber(array))
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
            result = """${result}число: ${array[i]} встречается $count раз(а).
"""
        }
    }
    return result
}

//11. Вернуть количество повторяющихся значений в массиве (в виде число 5 - 3 раза)
fun checkExistsNumber(arr: IntArray, value: Int): Boolean {
    for (i in arr.indices) {
        if (arr[i] == value) return true
    }
    return false
}

fun getSizeForNewArrayUnicNumber(array: IntArray): Int {
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
} //метод для подсчета уникальных чисел в массиве

