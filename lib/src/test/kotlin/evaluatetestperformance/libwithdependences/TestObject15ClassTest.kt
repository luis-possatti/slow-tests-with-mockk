package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence15Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject15ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject15Class

    init {
        beforeTest {
            classUnderTest = TestObject15Class(Dependence15Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1500, should return 'Hello friend 1500!'" {
                val expectedGreeting = "Hello friend 1500!"

                val actualGreeting = classUnderTest.sampleMethod(1500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1501, should return 'Hello friend 1501!'" {
                val expectedGreeting = "Hello friend 1501!"

                val actualGreeting = classUnderTest.sampleMethod(1501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
