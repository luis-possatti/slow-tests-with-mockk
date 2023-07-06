package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence19Class
import evaluatetestperformance.dependence.model.Dependence19Request
import evaluatetestperformance.dependence.model.Dependence19Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject19ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence19Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject19Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1900, should return 'Hello friend 1900!'" {
                val request = Dependence19Request(index19 = 1900L)
                val response = Dependence19Response(name19 = "1900")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1900!"

                val actualGreeting = classUnderTest.sampleMethod(1900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 19019, should return 'Hello friend 1901!'" {
                val request = Dependence19Request(index19 = 1901L)
                val response = Dependence19Response(name19 = "1901")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1901!"

                val actualGreeting = classUnderTest.sampleMethod(1901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
