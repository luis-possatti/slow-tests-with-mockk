package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence17Class
import evaluatetestperformance.dependence.model.Dependence17Request
import evaluatetestperformance.dependence.model.Dependence17Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject17ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence17Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject17Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1700, should return 'Hello friend 1700!'" {
                val request = Dependence17Request(index17 = 1700L)
                val response = Dependence17Response(name17 = "1700")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1700!"

                val actualGreeting = classUnderTest.sampleMethod(1700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 17017, should return 'Hello friend 1701!'" {
                val request = Dependence17Request(index17 = 1701L)
                val response = Dependence17Response(name17 = "1701")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1701!"

                val actualGreeting = classUnderTest.sampleMethod(1701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
