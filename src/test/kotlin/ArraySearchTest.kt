import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ArraySearchTest {

    private lateinit var arraySearch: ArraySearch
    private val array = arrayOf(1, 3, 2, 9, 8, 5, 4, 7, 6, 0)

    @Before
    fun before() {
        arraySearch = ArraySearch()
    }

    @Test
    fun searchNumber_Should_Return_True_Or_False() {
        val actual1 = arraySearch.searchNumber(5, array)
        assertEquals(true, actual1)

        val actual2 = arraySearch.searchNumber(3, array)
        assertEquals(true, actual2)

        val actual3 = arraySearch.searchNumber(13, array)
        assertEquals(false, actual3)

        val actual4 = arraySearch.searchNumber(99, array)
        assertEquals(false, actual4)
    }

    @Test
    fun searchMaxNumber_Should_Return_Max_Number_From_Array() {
        val actual1 = arraySearch.searchMaxNumber(arrayOf(1, 3, 4, 5))
        assertEquals(5, actual1)

        val actual2 = arraySearch.searchMaxNumber(arrayOf(1, 18, 4, 5))
        assertEquals(18, actual2)
    }

    @Test
    fun searchMinNumber_Should_Return_Min_Number_From_Array() {
        val actual1 = arraySearch.searchMinNumber(arrayOf(1, 0, 3, 4))
        assertEquals(0, actual1)

        val actual2 = arraySearch.searchMinNumber(arrayOf(99, 41, 13, 27))
        assertEquals(13, actual2)
    }

    @Test
    fun getArrOddNumbers_Should_Return_Array_Of_Odd_Numbers() {
        val actual = arraySearch.getArrOddNumbers(array)
        assertEquals(arrayOf(1, 3, 9, 5, 7), actual)
    }

    @Test
    fun getArrEvenNumbers_Should_Return_Array_Of_Even_Numbers() {
        val actual = arraySearch.getArrEvenNumbers(array)
        assertEquals(arrayOf(2, 8, 4, 6, 0), actual)
    }

    @Test
    fun getStringToCountRepeatNumbersMore0_Should_Return_String_With_Count_Repeat_Numbers_More_0() {
        val actual1 = arraySearch.getStringToCountRepeatNumbersMore0(arrayOf(1, 2, 3, 3, 1, 4, 5, 0, 0))
        val expected1 = "число: 1 встречается 2 раз(а)." +
                "число: 2 встречается 1 раз(а)." +
                "число: 3 встречается 2 раз(а)." +
                "число: 4 встречается 1 раз(а)." +
                "число: 5 встречается 1 раз(а)."
        assertEquals(expected1, actual1)

        val actual2 = arraySearch.getStringToCountRepeatNumbersMore0(arrayOf(4, 7, 8, 8, 4, 1, 3, 1))
        val expected2 = "число: 4 встречается 2 раз(а)." +
                "число: 7 встречается 1 раз(а)." +
                "число: 8 встречается 2 раз(а)." +
                "число: 1 встречается 2 раз(а)." +
                "число: 3 встречается 1 раз(а)."
        assertEquals(expected2, actual2)
    }

}
