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

}