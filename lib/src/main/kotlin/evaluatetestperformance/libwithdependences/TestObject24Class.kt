package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence24Class
import evaluatetestperformance.dependence.model.Dependence24Request

/**
 * SampleKotlinClass.
 */
class TestObject24Class(
    private val dependence: Dependence24Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence24Request(index24 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name24}!"
    }
}
