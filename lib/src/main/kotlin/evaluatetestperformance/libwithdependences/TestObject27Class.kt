package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence27Class
import evaluatetestperformance.dependence.model.Dependence27Request

/**
 * SampleKotlinClass.
 */
class TestObject27Class(
    private val dependence: Dependence27Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence27Request(index27 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name27}!"
    }
}
