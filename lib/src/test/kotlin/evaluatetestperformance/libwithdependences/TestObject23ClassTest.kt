package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence23Class
import evaluatetestperformance.dependence.model.Dependence23Request
import evaluatetestperformance.dependence.model.Dependence23Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject23ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence23Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject23Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2300, should return 'Hello friend 2300!'" {
                val request = Dependence23Request(index23 = 2300L)
                val response = Dependence23Response(name23 = "2300")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2300!"

                val actualGreeting = classUnderTest.sampleMethod(2300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 23023, should return 'Hello friend 2301!'" {
                val request = Dependence23Request(index23 = 2301L)
                val response = Dependence23Response(name23 = "2301")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2301!"

                val actualGreeting = classUnderTest.sampleMethod(2301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
