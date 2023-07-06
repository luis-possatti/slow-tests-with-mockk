package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence4Class
import evaluatetestperformance.dependence.model.Dependence4Request
import evaluatetestperformance.dependence.model.Dependence4Response
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
/**
 *  SampleKotlinClassTest.
 */
class TestObject4ClassTest : BaseSpec() {

    @MockK
    private lateinit var dependence: Dependence4Class

    @InjectMockKs
    private lateinit var classUnderTest: TestObject4Class

    init {
        "should return correct greeting according to the index" - {
            "when calling with index 400, should return 'Hello friend 400!'" {
                val request = Dependence4Request(index4 = 400L)
                val response = Dependence4Response(name4 = "400")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 400!"

                val actualGreeting = classUnderTest.sampleMethod(400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 404, should return 'Hello friend 401!'" {
                val request = Dependence4Request(index4 = 401L)
                val response = Dependence4Response(name4 = "401")
                every { dependence.getName(request) } returns response

                val expectedGreeting = "Hello friend 401!"

                val actualGreeting = classUnderTest.sampleMethod(401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
