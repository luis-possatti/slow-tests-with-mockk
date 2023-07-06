package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence6Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject6ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject6Class

    init {
        beforeTest {
            classUnderTest = TestObject6Class(Dependence6Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 600, should return 'Hello friend 600!'" {
                val expectedGreeting = "Hello friend 600!"

                val actualGreeting = classUnderTest.sampleMethod(600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 601, should return 'Hello friend 601!'" {
                val expectedGreeting = "Hello friend 601!"

                val actualGreeting = classUnderTest.sampleMethod(601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
