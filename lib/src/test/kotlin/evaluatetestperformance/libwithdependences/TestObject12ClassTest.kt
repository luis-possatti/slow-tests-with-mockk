package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence12Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject12ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject12Class

    init {
        beforeTest {
            classUnderTest = TestObject12Class(Dependence12Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1200, should return 'Hello friend 1200!'" {
                val expectedGreeting = "Hello friend 1200!"

                val actualGreeting = classUnderTest.sampleMethod(1200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1201, should return 'Hello friend 1201!'" {
                val expectedGreeting = "Hello friend 1201!"

                val actualGreeting = classUnderTest.sampleMethod(1201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
