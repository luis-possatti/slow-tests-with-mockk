package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence6Class
import evaluatetestperformance.dependence.model.Dependence6Request

/**
 * SampleKotlinClass.
 */
class TestObject6Class(
    private val dependence: Dependence6Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence6Request(index6 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name6}!"
    }
}
