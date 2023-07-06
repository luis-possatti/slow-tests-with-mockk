package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence4Class
import evaluatetestperformance.dependence.model.Dependence4Request

/**
 * SampleKotlinClass.
 */
class TestObject4Class(
    private val dependence: Dependence4Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence4Request(index4 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name4}!"
    }
}
