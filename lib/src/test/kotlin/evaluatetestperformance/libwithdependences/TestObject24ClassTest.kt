package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence24Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject24ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject24Class

    init {
        beforeTest {
            classUnderTest = TestObject24Class(Dependence24Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2400, should return 'Hello friend 2400!'" {
                val expectedGreeting = "Hello friend 2400!"

                val actualGreeting = classUnderTest.sampleMethod(2400)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2401, should return 'Hello friend 2401!'" {
                val expectedGreeting = "Hello friend 2401!"

                val actualGreeting = classUnderTest.sampleMethod(2401)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
