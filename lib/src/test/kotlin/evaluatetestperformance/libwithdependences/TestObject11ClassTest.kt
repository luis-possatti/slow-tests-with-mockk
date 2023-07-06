package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence11Class
import evaluatetestperformance.dependence.model.Dependence11Request
import evaluatetestperformance.dependence.model.Dependence11Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject11ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence11Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject11Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1100, should return 'Hello friend 1100!'" {
                val request = Dependence11Request(index11 = 1100L)
                val response = Dependence11Response(name11 = "1100")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1100!"

                val actualGreeting = classUnderTest.sampleMethod(1100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 11011, should return 'Hello friend 1101!'" {
                val request = Dependence11Request(index11 = 1101L)
                val response = Dependence11Response(name11 = "1101")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1101!"

                val actualGreeting = classUnderTest.sampleMethod(1101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
