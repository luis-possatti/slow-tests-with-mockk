package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence3Class
import evaluatetestperformance.dependence.model.Dependence3Request
import evaluatetestperformance.dependence.model.Dependence3Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject3ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence3Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject3Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 300, should return 'Hello friend 300!'" {
                val request = Dependence3Request(index3 = 300L)
                val response = Dependence3Response(name3 = "300")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 300!"

                val actualGreeting = classUnderTest.sampleMethod(300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 303, should return 'Hello friend 301!'" {
                val request = Dependence3Request(index3 = 301L)
                val response = Dependence3Response(name3 = "301")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 301!"

                val actualGreeting = classUnderTest.sampleMethod(301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
