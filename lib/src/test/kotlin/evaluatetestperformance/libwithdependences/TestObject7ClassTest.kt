package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence7Class
import evaluatetestperformance.dependence.model.Dependence7Request
import evaluatetestperformance.dependence.model.Dependence7Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject7ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence7Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject7Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 700, should return 'Hello friend 700!'" {
                val request = Dependence7Request(index7 = 700L)
                val response = Dependence7Response(name7 = "700")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 700!"

                val actualGreeting = classUnderTest.sampleMethod(700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 707, should return 'Hello friend 701!'" {
                val request = Dependence7Request(index7 = 701L)
                val response = Dependence7Response(name7 = "701")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 701!"

                val actualGreeting = classUnderTest.sampleMethod(701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
