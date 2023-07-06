package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence20Class
import evaluatetestperformance.dependence.model.Dependence20Request

/**
 * SampleKotlinClass.
 */
class TestObject20Class(
    private val dependence: Dependence20Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence20Request(index20 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name20}!"
    }
}
