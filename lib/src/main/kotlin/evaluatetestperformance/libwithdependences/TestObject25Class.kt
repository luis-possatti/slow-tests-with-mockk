package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence25Class
import evaluatetestperformance.dependence.model.Dependence25Request

/**
 * SampleKotlinClass.
 */
class TestObject25Class(
    private val dependence: Dependence25Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence25Request(index25 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name25}!"
    }
}
