package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence30Class
import evaluatetestperformance.dependence.model.Dependence30Request

/**
 * SampleKotlinClass.
 */
class TestObject30Class(
    private val dependence: Dependence30Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence30Request(index30 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name30}!"
    }
}
