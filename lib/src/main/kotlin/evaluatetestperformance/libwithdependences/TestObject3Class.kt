package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence3Class
import evaluatetestperformance.dependence.model.Dependence3Request

/**
 * SampleKotlinClass.
 */
class TestObject3Class(
    private val dependence: Dependence3Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence3Request(index3 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name3}!"
    }
}
