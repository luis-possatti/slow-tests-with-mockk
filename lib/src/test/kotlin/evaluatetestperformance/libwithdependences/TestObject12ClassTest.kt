package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence12Class
import evaluatetestperformance.dependence.model.Dependence12Request
import evaluatetestperformance.dependence.model.Dependence12Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject12ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence12Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject12Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1200, should return 'Hello friend 1200!'" {
                val request = Dependence12Request(index12 = 1200L)
                val response = Dependence12Response(name12 = "1200")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1200!"

                val actualGreeting = classUnderTest.sampleMethod(1200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 12012, should return 'Hello friend 1201!'" {
                val request = Dependence12Request(index12 = 1201L)
                val response = Dependence12Response(name12 = "1201")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1201!"

                val actualGreeting = classUnderTest.sampleMethod(1201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
