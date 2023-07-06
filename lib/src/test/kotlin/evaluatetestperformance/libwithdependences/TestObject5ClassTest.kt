package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence5Class
import evaluatetestperformance.dependence.model.Dependence5Request
import evaluatetestperformance.dependence.model.Dependence5Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject5ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence5Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject5Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 500, should return 'Hello friend 500!'" {
                val request = Dependence5Request(index5 = 500L)
                val response = Dependence5Response(name5 = "500")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 500!"

                val actualGreeting = classUnderTest.sampleMethod(500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 505, should return 'Hello friend 501!'" {
                val request = Dependence5Request(index5 = 501L)
                val response = Dependence5Response(name5 = "501")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 501!"

                val actualGreeting = classUnderTest.sampleMethod(501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
