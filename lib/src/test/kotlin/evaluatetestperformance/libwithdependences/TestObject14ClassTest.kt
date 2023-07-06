package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence14Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject14ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject14Class

    init {
        beforeTest {
            classUnderTest = TestObject14Class(Dependence14Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1400, should return 'Hello friend 1400!'" {
                val expectedGreeting = "Hello friend 1400!"

                val actualGreeting = classUnderTest.sampleMethod(1400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1401, should return 'Hello friend 1401!'" {
                val expectedGreeting = "Hello friend 1401!"

                val actualGreeting = classUnderTest.sampleMethod(1401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
