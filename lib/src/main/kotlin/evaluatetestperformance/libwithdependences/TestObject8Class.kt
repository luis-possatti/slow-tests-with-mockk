package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence8Class
import evaluatetestperformance.dependence.model.Dependence8Request

/**
 * SampleKotlinClass.
 */
class TestObject8Class(
    private val dependence: Dependence8Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence8Request(index8 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name8}!"
    }
}
