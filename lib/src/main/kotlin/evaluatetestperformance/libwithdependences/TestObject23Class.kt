package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence23Class
import evaluatetestperformance.dependence.model.Dependence23Request

/**
 * SampleKotlinClass.
 */
class TestObject23Class(
    private val dependence: Dependence23Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence23Request(index23 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name23}!"
    }
}
