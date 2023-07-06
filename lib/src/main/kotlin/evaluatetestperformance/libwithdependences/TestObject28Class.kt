package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence28Class
import evaluatetestperformance.dependence.model.Dependence28Request

/**
 * SampleKotlinClass.
 */
class TestObject28Class(
    private val dependence: Dependence28Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence28Request(index28 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name28}!"
    }
}
