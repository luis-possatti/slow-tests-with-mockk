package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence30Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject30ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject30Class

    init {
        beforeTest {
            classUnderTest = TestObject30Class(Dependence30Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 3000, should return 'Hello friend 3000!'" {
                val expectedGreeting = "Hello friend 3000!"

                val actualGreeting = classUnderTest.sampleMethod(3000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 3001, should return 'Hello friend 3001!'" {
                val expectedGreeting = "Hello friend 3001!"

                val actualGreeting = classUnderTest.sampleMethod(3001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
