package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence26Class
import evaluatetestperformance.dependence.model.Dependence26Request
import evaluatetestperformance.dependence.model.Dependence26Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject26ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence26Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject26Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 2600, should return 'Hello friend 2600!'" {
                val request = Dependence26Request(index26 = 2600L)
                val response = Dependence26Response(name26 = "2600")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2600!"

                val actualGreeting = classUnderTest.sampleMethod(2600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 26026, should return 'Hello friend 2601!'" {
                val request = Dependence26Request(index26 = 2601L)
                val response = Dependence26Response(name26 = "2601")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 2601!"

                val actualGreeting = classUnderTest.sampleMethod(2601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
