package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence22Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject22ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject22Class

    init {
        beforeTest {
            classUnderTest = TestObject22Class(Dependence22Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2200, should return 'Hello friend 2200!'" {
                val expectedGreeting = "Hello friend 2200!"

                val actualGreeting = classUnderTest.sampleMethod(2200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2201, should return 'Hello friend 2201!'" {
                val expectedGreeting = "Hello friend 2201!"

                val actualGreeting = classUnderTest.sampleMethod(2201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
