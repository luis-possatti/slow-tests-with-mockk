package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence11Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject11ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject11Class

    init {
        beforeTest {
            classUnderTest = TestObject11Class(Dependence11Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1100, should return 'Hello friend 1100!'" {
                val expectedGreeting = "Hello friend 1100!"

                val actualGreeting = classUnderTest.sampleMethod(1100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1101, should return 'Hello friend 1101!'" {
                val expectedGreeting = "Hello friend 1101!"

                val actualGreeting = classUnderTest.sampleMethod(1101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
