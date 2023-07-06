package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence14Class
import evaluatetestperformance.dependence.model.Dependence14Request
import evaluatetestperformance.dependence.model.Dependence14Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject14ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence14Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject14Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1400, should return 'Hello friend 1400!'" {
                val request = Dependence14Request(index14 = 1400L)
                val response = Dependence14Response(name14 = "1400")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1400!"

                val actualGreeting = classUnderTest.sampleMethod(1400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 14014, should return 'Hello friend 1401!'" {
                val request = Dependence14Request(index14 = 1401L)
                val response = Dependence14Response(name14 = "1401")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1401!"

                val actualGreeting = classUnderTest.sampleMethod(1401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
