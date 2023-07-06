package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence1Class
import evaluatetestperformance.dependence.model.Dependence1Request

/**
 * SampleKotlinClass.
 */
class TestObject1Class(
    private val dependence: Dependence1Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence1Request(index1 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name1}!"
    }
}
