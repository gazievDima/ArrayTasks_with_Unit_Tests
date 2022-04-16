import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ArraySumTest() {

    private lateinit var arraySum: ArraySum

    @Before
    fun before() {
        arraySum = ArraySum()
    }

    @Test
    fun sumAllNumbers_Should_Return_Sum_All_Numbers_From_Array() {
        val actual1 = arraySum.sumAllNumbers(arrayOf(1,2,3))
        assertEquals(6, actual1)

        val actual2 = arraySum.sumAllNumbers(arrayOf(4,5,6))
        assertEquals(15, actual2)
    }

    @Test
    fun sumOddNumbers_Should_Return_Sum_All_Odd_Numbers_From_Array() {
        val actual1 = arraySum.sumOddNumbers(arrayOf(1,2,3,4,5))
        assertEquals(9, actual1)

        val actual2 = arraySum.sumOddNumbers(arrayOf(6,7,8,9,10))
        assertEquals(16, actual2)
    }

    @Test
    fun sumEvenNumbers_Should_Return_Sum_All_Even_Numbers_From_Array() {
        val actual1 = arraySum.sumEvenNumbers(arrayOf(1,2,3,4,5))
        assertEquals(6, actual1)

        val actual2 = arraySum.sumEvenNumbers(arrayOf(6,7,8,9,10))
        assertEquals(24, actual2)
    }

}