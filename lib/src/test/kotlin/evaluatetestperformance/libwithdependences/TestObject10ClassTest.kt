package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence10Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject10ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject10Class

    init {
        beforeTest {
            classUnderTest = TestObject10Class(Dependence10Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1000, should return 'Hello friend 1000!'" {
                val expectedGreeting = "Hello friend 1000!"

                val actualGreeting = classUnderTest.sampleMethod(1000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1001, should return 'Hello friend 1001!'" {
                val expectedGreeting = "Hello friend 1001!"

                val actualGreeting = classUnderTest.sampleMethod(1001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
