package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence17Class
import evaluatetestperformance.dependence.model.Dependence17Request

/**
 * SampleKotlinClass.
 */
class TestObject17Class(
    private val dependence: Dependence17Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence17Request(index17 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name17}!"
    }
}
