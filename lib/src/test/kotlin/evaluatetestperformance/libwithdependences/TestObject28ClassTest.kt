package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence28Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject28ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject28Class

    init {
        beforeTest {
            classUnderTest = TestObject28Class(Dependence28Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2800, should return 'Hello friend 2800!'" {
                val expectedGreeting = "Hello friend 2800!"

                val actualGreeting = classUnderTest.sampleMethod(2800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2801, should return 'Hello friend 2801!'" {
                val expectedGreeting = "Hello friend 2801!"

                val actualGreeting = classUnderTest.sampleMethod(2801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
