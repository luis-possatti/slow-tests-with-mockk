package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence2Class
import evaluatetestperformance.dependence.model.Dependence2Request
import evaluatetestperformance.dependence.model.Dependence2Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject2ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence2Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject2Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 200, should return 'Hello friend 200!'" {
                val request = Dependence2Request(index2 = 200L)
                val response = Dependence2Response(name2 = "200")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 200!"

                val actualGreeting = classUnderTest.sampleMethod(200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 202, should return 'Hello friend 201!'" {
                val request = Dependence2Request(index2 = 201L)
                val response = Dependence2Response(name2 = "201")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 201!"

                val actualGreeting = classUnderTest.sampleMethod(201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
