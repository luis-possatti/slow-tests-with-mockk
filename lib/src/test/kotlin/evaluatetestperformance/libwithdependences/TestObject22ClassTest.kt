package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence22Class
import evaluatetestperformance.dependence.model.Dependence22Request
import evaluatetestperformance.dependence.model.Dependence22Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject22ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence22Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject22Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2200, should return 'Hello friend 2200!'" {
                val request = Dependence22Request(index22 = 2200L)
                val response = Dependence22Response(name22 = "2200")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2200!"

                val actualGreeting = classUnderTest.sampleMethod(2200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 22022, should return 'Hello friend 2201!'" {
                val request = Dependence22Request(index22 = 2201L)
                val response = Dependence22Response(name22 = "2201")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2201!"

                val actualGreeting = classUnderTest.sampleMethod(2201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
