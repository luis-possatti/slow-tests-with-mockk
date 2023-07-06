package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence19Class
import evaluatetestperformance.dependence.model.Dependence19Request

/**
 * SampleKotlinClass.
 */
class TestObject19Class(
    private val dependence: Dependence19Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence19Request(index19 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name19}!"
    }
}
