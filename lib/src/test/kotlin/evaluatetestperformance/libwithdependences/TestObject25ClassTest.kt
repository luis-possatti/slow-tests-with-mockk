package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence25Class
import evaluatetestperformance.dependence.model.Dependence25Request
import evaluatetestperformance.dependence.model.Dependence25Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject25ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence25Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject25Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2500, should return 'Hello friend 2500!'" {
                val request = Dependence25Request(index25 = 2500L)
                val response = Dependence25Response(name25 = "2500")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2500!"

                val actualGreeting = classUnderTest.sampleMethod(2500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 25025, should return 'Hello friend 2501!'" {
                val request = Dependence25Request(index25 = 2501L)
                val response = Dependence25Response(name25 = "2501")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2501!"

                val actualGreeting = classUnderTest.sampleMethod(2501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
