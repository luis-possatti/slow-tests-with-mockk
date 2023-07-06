package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence1Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject1ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject1Class

    init {
        beforeTest {
            classUnderTest = TestObject1Class(Dependence1Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 100, should return 'Hello friend 100!'" {
                val expectedGreeting = "Hello friend 100!"

                val actualGreeting = classUnderTest.sampleMethod(100)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 101, should return 'Hello friend 101!'" {
                val expectedGreeting = "Hello friend 101!"

                val actualGreeting = classUnderTest.sampleMethod(101)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
