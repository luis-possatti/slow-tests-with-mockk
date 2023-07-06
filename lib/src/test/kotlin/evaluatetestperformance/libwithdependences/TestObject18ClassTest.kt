package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence18Class
import evaluatetestperformance.dependence.model.Dependence18Request
import evaluatetestperformance.dependence.model.Dependence18Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject18ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence18Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject18Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1800, should return 'Hello friend 1800!'" {
                val request = Dependence18Request(index18 = 1800L)
                val response = Dependence18Response(name18 = "1800")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1800!"

                val actualGreeting = classUnderTest.sampleMethod(1800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 18018, should return 'Hello friend 1801!'" {
                val request = Dependence18Request(index18 = 1801L)
                val response = Dependence18Response(name18 = "1801")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1801!"

                val actualGreeting = classUnderTest.sampleMethod(1801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
