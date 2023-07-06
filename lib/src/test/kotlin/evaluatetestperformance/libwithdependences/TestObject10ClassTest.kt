package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence10Class
import evaluatetestperformance.dependence.model.Dependence10Request
import evaluatetestperformance.dependence.model.Dependence10Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject10ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence10Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject10Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1000, should return 'Hello friend 1000!'" {
                val request = Dependence10Request(index10 = 1000L)
                val response = Dependence10Response(name10 = "1000")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1000!"

                val actualGreeting = classUnderTest.sampleMethod(1000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 10010, should return 'Hello friend 1001!'" {
                val request = Dependence10Request(index10 = 1001L)
                val response = Dependence10Response(name10 = "1001")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1001!"

                val actualGreeting = classUnderTest.sampleMethod(1001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
