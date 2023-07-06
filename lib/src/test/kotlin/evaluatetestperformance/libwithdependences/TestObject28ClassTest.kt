package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence28Class
import evaluatetestperformance.dependence.model.Dependence28Request
import evaluatetestperformance.dependence.model.Dependence28Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject28ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence28Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject28Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2800, should return 'Hello friend 2800!'" {
                val request = Dependence28Request(index28 = 2800L)
                val response = Dependence28Response(name28 = "2800")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2800!"

                val actualGreeting = classUnderTest.sampleMethod(2800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 28028, should return 'Hello friend 2801!'" {
                val request = Dependence28Request(index28 = 2801L)
                val response = Dependence28Response(name28 = "2801")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2801!"

                val actualGreeting = classUnderTest.sampleMethod(2801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
