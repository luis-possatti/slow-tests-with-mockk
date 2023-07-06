package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence27Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject27ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject27Class

    init {
        beforeTest {
            classUnderTest = TestObject27Class(Dependence27Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2700, should return 'Hello friend 2700!'" {
                val expectedGreeting = "Hello friend 2700!"

                val actualGreeting = classUnderTest.sampleMethod(2700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2701, should return 'Hello friend 2701!'" {
                val expectedGreeting = "Hello friend 2701!"

                val actualGreeting = classUnderTest.sampleMethod(2701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
