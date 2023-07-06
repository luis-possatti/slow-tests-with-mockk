package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence15Class
import evaluatetestperformance.dependence.model.Dependence15Request
import evaluatetestperformance.dependence.model.Dependence15Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject15ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence15Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject15Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1500, should return 'Hello friend 1500!'" {
                val request = Dependence15Request(index15 = 1500L)
                val response = Dependence15Response(name15 = "1500")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1500!"

                val actualGreeting = classUnderTest.sampleMethod(1500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 15015, should return 'Hello friend 1501!'" {
                val request = Dependence15Request(index15 = 1501L)
                val response = Dependence15Response(name15 = "1501")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1501!"

                val actualGreeting = classUnderTest.sampleMethod(1501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
