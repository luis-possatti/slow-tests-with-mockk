package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence12Class
import evaluatetestperformance.dependence.model.Dependence12Request

/**
 * SampleKotlinClass.
 */
class TestObject12Class(
    private val dependence: Dependence12Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence12Request(index12 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name12}!"
    }
}
