package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence16Class
import evaluatetestperformance.dependence.model.Dependence16Request
import evaluatetestperformance.dependence.model.Dependence16Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject16ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence16Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject16Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 1600, should return 'Hello friend 1600!'" {
                val request = Dependence16Request(index16 = 1600L)
                val response = Dependence16Response(name16 = "1600")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1600!"

                val actualGreeting = classUnderTest.sampleMethod(1600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 16016, should return 'Hello friend 1601!'" {
                val request = Dependence16Request(index16 = 1601L)
                val response = Dependence16Response(name16 = "1601")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 1601!"

                val actualGreeting = classUnderTest.sampleMethod(1601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
