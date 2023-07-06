package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence9Class
import evaluatetestperformance.dependence.model.Dependence9Request
import evaluatetestperformance.dependence.model.Dependence9Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject9ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence9Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject9Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 900, should return 'Hello friend 900!'" {
                val request = Dependence9Request(index9 = 900L)
                val response = Dependence9Response(name9 = "900")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 900!"

                val actualGreeting = classUnderTest.sampleMethod(900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 909, should return 'Hello friend 901!'" {
                val request = Dependence9Request(index9 = 901L)
                val response = Dependence9Response(name9 = "901")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 901!"

                val actualGreeting = classUnderTest.sampleMethod(901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
