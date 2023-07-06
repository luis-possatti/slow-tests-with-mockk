package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence9Class
import evaluatetestperformance.dependence.model.Dependence9Request

/**
 * SampleKotlinClass.
 */
class TestObject9Class(
    private val dependence: Dependence9Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence9Request(index9 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name9}!"
    }
}
