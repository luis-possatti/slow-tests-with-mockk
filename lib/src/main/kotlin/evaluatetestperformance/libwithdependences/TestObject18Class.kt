package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence18Class
import evaluatetestperformance.dependence.model.Dependence18Request

/**
 * SampleKotlinClass.
 */
class TestObject18Class(
    private val dependence: Dependence18Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence18Request(index18 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name18}!"
    }
}
