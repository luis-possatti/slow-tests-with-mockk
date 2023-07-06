package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence29Class
import evaluatetestperformance.dependence.model.Dependence29Request
import evaluatetestperformance.dependence.model.Dependence29Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject29ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence29Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject29Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2900, should return 'Hello friend 2900!'" {
                val request = Dependence29Request(index29 = 2900L)
                val response = Dependence29Response(name29 = "2900")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2900!"

                val actualGreeting = classUnderTest.sampleMethod(2900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 29029, should return 'Hello friend 2901!'" {
                val request = Dependence29Request(index29 = 2901L)
                val response = Dependence29Response(name29 = "2901")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2901!"

                val actualGreeting = classUnderTest.sampleMethod(2901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
