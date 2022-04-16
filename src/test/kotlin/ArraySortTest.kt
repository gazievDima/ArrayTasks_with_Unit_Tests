import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ArraySortTest {

    private lateinit var arraySort: ArraySort

    @Before
    fun before() {
        arraySort = ArraySort()
    }

    @Test
    fun sortArrayMinToMax_Should_Return_Sorted_Array_From_Min_To_Max() {
        val actual1 = arraySort.sortArrayMinToMax(arrayOf(1, 3, 2, 5, 4))
        assertEquals(arrayOf(1, 2, 3, 4, 5), actual1)

        val actual2 = arraySort.sortArrayMinToMax(arrayOf(10, 14, 9, 7, 6))
        assertEquals(arrayOf(6, 7, 9, 10, 14), actual2)
    }

    @Test
    fun sortArrayMaxToMin_Should_Return_Sorted_Array_From_Max_To_Min() {
        val actual1 = arraySort.sortArrayMaxToMin(arrayOf(1, 3, 2, 5, 4))
        assertEquals(arrayOf(5, 4, 3, 2, 1), actual1)

        val actual2 = arraySort.sortArrayMaxToMin(arrayOf(10, 14, 9, 7, 6))
        assertEquals(arrayOf(14, 10, 9, 7, 6), actual2)
    }

    @Test
    fun getSortArrayFirstEvenThenOdd_Should_Return_Array_FromEven_ToOdd_Numbers() {
        val actual1 = arraySort.getSortArrayFirstEvenThenOdd(arrayOf(3, 1, 4, 5, 8, 2, 6, 7, 9, 0))
        assertEquals(arrayOf(0,2,4,6,8,1,3,5,7,9), actual1)

        val actual2 = arraySort.getSortArrayFirstEvenThenOdd(arrayOf(55,33,22,99,52,44))
        assertEquals(arrayOf(22,44,52,33,55,99), actual2)
    }
}