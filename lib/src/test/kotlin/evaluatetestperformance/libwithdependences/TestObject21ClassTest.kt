package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence21Class
import evaluatetestperformance.dependence.model.Dependence21Request
import evaluatetestperformance.dependence.model.Dependence21Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject21ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence21Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject21Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2100, should return 'Hello friend 2100!'" {
                val request = Dependence21Request(index21 = 2100L)
                val response = Dependence21Response(name21 = "2100")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2100!"

                val actualGreeting = classUnderTest.sampleMethod(2100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 21021, should return 'Hello friend 2101!'" {
                val request = Dependence21Request(index21 = 2101L)
                val response = Dependence21Response(name21 = "2101")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2101!"

                val actualGreeting = classUnderTest.sampleMethod(2101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
