package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence10Class
import evaluatetestperformance.dependence.model.Dependence10Request

/**
 * SampleKotlinClass.
 */
class TestObject10Class(
    private val dependence: Dependence10Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence10Request(index10 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name10}!"
    }
}
