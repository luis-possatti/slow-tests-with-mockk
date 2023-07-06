package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence11Class
import evaluatetestperformance.dependence.model.Dependence11Request

/**
 * SampleKotlinClass.
 */
class TestObject11Class(
    private val dependence: Dependence11Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence11Request(index11 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name11}!"
    }
}
