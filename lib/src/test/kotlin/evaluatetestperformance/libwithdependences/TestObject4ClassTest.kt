package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence4Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject4ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject4Class

    init {
        beforeTest {
            classUnderTest = TestObject4Class(Dependence4Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 400, should return 'Hello friend 400!'" {
                val expectedGreeting = "Hello friend 400!"

                val actualGreeting = classUnderTest.sampleMethod(400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 401, should return 'Hello friend 401!'" {
                val expectedGreeting = "Hello friend 401!"

                val actualGreeting = classUnderTest.sampleMethod(401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
