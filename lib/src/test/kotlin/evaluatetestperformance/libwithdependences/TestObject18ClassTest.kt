package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence18Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject18ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject18Class

    init {
        beforeTest {
            classUnderTest = TestObject18Class(Dependence18Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1800, should return 'Hello friend 1800!'" {
                val expectedGreeting = "Hello friend 1800!"

                val actualGreeting = classUnderTest.sampleMethod(1800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1801, should return 'Hello friend 1801!'" {
                val expectedGreeting = "Hello friend 1801!"

                val actualGreeting = classUnderTest.sampleMethod(1801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
