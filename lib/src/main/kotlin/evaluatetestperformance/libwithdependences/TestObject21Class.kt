package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence21Class
import evaluatetestperformance.dependence.model.Dependence21Request

/**
 * SampleKotlinClass.
 */
class TestObject21Class(
    private val dependence: Dependence21Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence21Request(index21 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name21}!"
    }
}
