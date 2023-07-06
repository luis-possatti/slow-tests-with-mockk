package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence17Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject17ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject17Class

    init {
        beforeTest {
            classUnderTest = TestObject17Class(Dependence17Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1700, should return 'Hello friend 1700!'" {
                val expectedGreeting = "Hello friend 1700!"

                val actualGreeting = classUnderTest.sampleMethod(1700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1701, should return 'Hello friend 1701!'" {
                val expectedGreeting = "Hello friend 1701!"

                val actualGreeting = classUnderTest.sampleMethod(1701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
