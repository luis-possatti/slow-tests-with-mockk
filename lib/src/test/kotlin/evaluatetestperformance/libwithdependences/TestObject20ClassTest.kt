package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence20Class
import evaluatetestperformance.dependence.model.Dependence20Request
import evaluatetestperformance.dependence.model.Dependence20Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject20ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence20Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject20Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2000, should return 'Hello friend 2000!'" {
                val request = Dependence20Request(index20 = 2000L)
                val response = Dependence20Response(name20 = "2000")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2000!"

                val actualGreeting = classUnderTest.sampleMethod(2000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 20020, should return 'Hello friend 2001!'" {
                val request = Dependence20Request(index20 = 2001L)
                val response = Dependence20Response(name20 = "2001")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2001!"

                val actualGreeting = classUnderTest.sampleMethod(2001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
