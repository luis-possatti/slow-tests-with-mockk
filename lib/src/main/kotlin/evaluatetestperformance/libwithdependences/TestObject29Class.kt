package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence29Class
import evaluatetestperformance.dependence.model.Dependence29Request

/**
 * SampleKotlinClass.
 */
class TestObject29Class(
    private val dependence: Dependence29Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence29Request(index29 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name29}!"
    }
}
