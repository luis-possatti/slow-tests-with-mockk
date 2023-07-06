package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence16Class
import evaluatetestperformance.dependence.model.Dependence16Request

/**
 * SampleKotlinClass.
 */
class TestObject16Class(
    private val dependence: Dependence16Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence16Request(index16 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name16}!"
    }
}
