package evaluatetestperformance.libwithdependences

import evaluatetestperformance.dependence.Dependence13Class
import evaluatetestperformance.dependence.model.Dependence13Request

/**
 * SampleKotlinClass.
 */
class TestObject13Class(
    private val dependence: Dependence13Class
) {
    fun sampleMethod(nameIndex: Long): String {
        val request = Dependence13Request(index13 = nameIndex)
        val response = dependence.getName(request)
        return "Hello friend ${response.name13}!"
    }
}
