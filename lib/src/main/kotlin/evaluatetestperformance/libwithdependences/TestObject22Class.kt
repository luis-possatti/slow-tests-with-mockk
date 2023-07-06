package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence22Class
import evaluatetestperformance.dependence.model.Dependence22Request

/**
 * SampleKotlinClass.
 */
class TestObject22Class(
    private val dependence: Dependence22Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence22Request(index22 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name22}!"
    }
}
