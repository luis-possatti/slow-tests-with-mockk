package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence24Class
import evaluatetestperformance.dependence.model.Dependence24Request
import evaluatetestperformance.dependence.model.Dependence24Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject24ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence24Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject24Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2400, should return 'Hello friend 2400!'" {
                val request = Dependence24Request(index24 = 2400L)
                val response = Dependence24Response(name24 = "2400")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2400!"

                val actualGreeting = classUnderTest.sampleMethod(2400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 24024, should return 'Hello friend 2401!'" {
                val request = Dependence24Request(index24 = 2401L)
                val response = Dependence24Response(name24 = "2401")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2401!"

                val actualGreeting = classUnderTest.sampleMethod(2401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
