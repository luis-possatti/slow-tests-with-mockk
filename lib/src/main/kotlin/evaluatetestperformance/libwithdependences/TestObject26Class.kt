package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence26Class
import evaluatetestperformance.dependence.model.Dependence26Request

/**
 * SampleKotlinClass.
 */
class TestObject26Class(
    private val dependence: Dependence26Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence26Request(index26 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name26}!"
    }
}
