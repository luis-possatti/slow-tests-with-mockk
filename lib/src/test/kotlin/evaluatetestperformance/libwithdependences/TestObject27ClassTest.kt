package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence27Class
import evaluatetestperformance.dependence.model.Dependence27Request
import evaluatetestperformance.dependence.model.Dependence27Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject27ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence27Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject27Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2700, should return 'Hello friend 2700!'" {
                val request = Dependence27Request(index27 = 2700L)
                val response = Dependence27Response(name27 = "2700")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2700!"

                val actualGreeting = classUnderTest.sampleMethod(2700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 27027, should return 'Hello friend 2701!'" {
                val request = Dependence27Request(index27 = 2701L)
                val response = Dependence27Response(name27 = "2701")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2701!"

                val actualGreeting = classUnderTest.sampleMethod(2701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
