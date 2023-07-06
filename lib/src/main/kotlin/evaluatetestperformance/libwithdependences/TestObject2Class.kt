package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence2Class
import evaluatetestperformance.dependence.model.Dependence2Request

/**
 * SampleKotlinClass.
 */
class TestObject2Class(
    private val dependence: Dependence2Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence2Request(index2 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name2}!"
    }
}
