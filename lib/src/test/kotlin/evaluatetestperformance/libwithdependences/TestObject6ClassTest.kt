package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence6Class
import evaluatetestperformance.dependence.model.Dependence6Request
import evaluatetestperformance.dependence.model.Dependence6Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject6ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence6Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject6Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 600, should return 'Hello friend 600!'" {
                val request = Dependence6Request(index6 = 600L)
                val response = Dependence6Response(name6 = "600")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 600!"

                val actualGreeting = classUnderTest.sampleMethod(600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 606, should return 'Hello friend 601!'" {
                val request = Dependence6Request(index6 = 601L)
                val response = Dependence6Response(name6 = "601")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 601!"

                val actualGreeting = classUnderTest.sampleMethod(601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
