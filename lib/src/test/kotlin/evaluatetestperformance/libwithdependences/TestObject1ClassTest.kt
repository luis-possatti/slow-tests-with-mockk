package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence1Class
import evaluatetestperformance.dependence.model.Dependence1Request
import evaluatetestperformance.dependence.model.Dependence1Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject1ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence1Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject1Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 100, should return 'Hello friend 100!'" {
                val request = Dependence1Request(index1 = 100L)
                val response = Dependence1Response(name1 = "100")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 100!"

                val actualGreeting = classUnderTest.sampleMethod(100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 101, should return 'Hello friend 101!'" {
                val request = Dependence1Request(index1 = 101L)
                val response = Dependence1Response(name1 = "101")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 101!"

                val actualGreeting = classUnderTest.sampleMethod(101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
