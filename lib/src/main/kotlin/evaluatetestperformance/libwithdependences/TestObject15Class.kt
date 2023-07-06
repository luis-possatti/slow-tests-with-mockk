package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence15Class
import evaluatetestperformance.dependence.model.Dependence15Request

/**
 * SampleKotlinClass.
 */
class TestObject15Class(
    private val dependence: Dependence15Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence15Request(index15 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name15}!"
    }
}
