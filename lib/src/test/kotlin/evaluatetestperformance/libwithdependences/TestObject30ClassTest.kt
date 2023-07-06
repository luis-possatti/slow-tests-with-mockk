package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence30Class
import evaluatetestperformance.dependence.model.Dependence30Request
import evaluatetestperformance.dependence.model.Dependence30Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject30ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence30Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject30Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 3000, should return 'Hello friend 3000!'" {
                val request = Dependence30Request(index30 = 3000L)
                val response = Dependence30Response(name30 = "3000")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 3000!"

                val actualGreeting = classUnderTest.sampleMethod(3000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 30030, should return 'Hello friend 3001!'" {
                val request = Dependence30Request(index30 = 3001L)
                val response = Dependence30Response(name30 = "3001")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 3001!"

                val actualGreeting = classUnderTest.sampleMethod(3001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
