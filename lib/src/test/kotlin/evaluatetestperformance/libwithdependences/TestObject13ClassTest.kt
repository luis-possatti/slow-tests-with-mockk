package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence13Class
import evaluatetestperformance.dependence.model.Dependence13Request
import evaluatetestperformance.dependence.model.Dependence13Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject13ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence13Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject13Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1300, should return 'Hello friend 1300!'" {
                val request = Dependence13Request(index13 = 1300L)
                val response = Dependence13Response(name13 = "1300")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1300!"

                val actualGreeting = classUnderTest.sampleMethod(1300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 13013, should return 'Hello friend 1301!'" {
                val request = Dependence13Request(index13 = 1301L)
                val response = Dependence13Response(name13 = "1301")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1301!"

                val actualGreeting = classUnderTest.sampleMethod(1301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
