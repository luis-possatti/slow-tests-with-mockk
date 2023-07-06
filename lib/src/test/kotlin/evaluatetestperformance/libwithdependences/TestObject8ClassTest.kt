package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence8Class
import evaluatetestperformance.dependence.model.Dependence8Request
import evaluatetestperformance.dependence.model.Dependence8Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject8ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence8Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject8Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 800, should return 'Hello friend 800!'" {
                val request = Dependence8Request(index8 = 800L)
                val response = Dependence8Response(name8 = "800")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 800!"

                val actualGreeting = classUnderTest.sampleMethod(800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 808, should return 'Hello friend 801!'" {
                val request = Dependence8Request(index8 = 801L)
                val response = Dependence8Response(name8 = "801")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 801!"

                val actualGreeting = classUnderTest.sampleMethod(801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
