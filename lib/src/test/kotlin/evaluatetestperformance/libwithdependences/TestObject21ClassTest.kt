package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence21Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject21ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject21Class

    init {
        beforeTest {
            classUnderTest = TestObject21Class(Dependence21Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2100, should return 'Hello friend 2100!'" {
                val expectedGreeting = "Hello friend 2100!"

                val actualGreeting = classUnderTest.sampleMethod(2100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2101, should return 'Hello friend 2101!'" {
                val expectedGreeting = "Hello friend 2101!"

                val actualGreeting = classUnderTest.sampleMethod(2101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
