package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence14Class
import evaluatetestperformance.dependence.model.Dependence14Request

/**
 * SampleKotlinClass.
 */
class TestObject14Class(
    private val dependence: Dependence14Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence14Request(index14 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name14}!"
    }
}
