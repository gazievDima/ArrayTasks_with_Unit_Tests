fun main() {
    val number = 5
    val arrayNumbers = arrayOf(1, 3, 2, 4, 8, 5, 6, 9, 7)

    //class tested.
    val arrSum = ArraySum()
    println("сумма всех чисел: " + arrSum.sumAllNumbers(arrayNumbers))
    println("сумма нечетных чисел: " + arrSum.sumOddNumbers(arrayNumbers))
    println("сумма четных чисел: " + arrSum.sumEvenNumbers(arrayNumbers))

    //class tested.
    val arrSearch = ArraySearch()
    println("поиск числа $number в массиве: " + arrSearch.searchNumber(5, arrayNumbers))
    println("поиск минимального числа в массиве: " + arrSearch.searchMinNumber(arrayNumbers))
    println("поиск максимального числа в массиве: " + arrSearch.searchMaxNumber(arrayNumbers))
    println("поиск и возврат массива нечетных чисел: " + arrSearch.getArrOddNumbers(arrayNumbers).contentToString())
    println("поиск и возврат массива четных чисел: " + arrSearch.getArrEvenNumbers(arrayNumbers).contentToString())
    println("поиск количества повторяющихся значений в массиве: " + arrSearch.getStringToCountRepeatNumbersMore0(arrayNumbers))

    //class tested.
    val arrSort = ArraySort()
    println("сортировка массива по возрастанию: " + arrSort.sortArrayMinToMax(arrayNumbers).contentToString())
    println("сортировка массива по уменьшению: " + arrSort.sortArrayMaxToMin(arrayNumbers).contentToString())
    println(
        "сортировка массива сперва четные числа, потом нечетные по возрастанию: " +
                arrSort.getSortArrayFirstEvenThenOdd(arrayNumbers).contentToString()
    )
}

