package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence5Class
import evaluatetestperformance.dependence.model.Dependence5Request

/**
 * SampleKotlinClass.
 */
class TestObject5Class(
    private val dependence: Dependence5Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence5Request(index5 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name5}!"
    }
}
