package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence7Class
import evaluatetestperformance.dependence.model.Dependence7Request

/**
 * SampleKotlinClass.
 */
class TestObject7Class(
    private val dependence: Dependence7Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence7Request(index7 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name7}!"
    }
}
