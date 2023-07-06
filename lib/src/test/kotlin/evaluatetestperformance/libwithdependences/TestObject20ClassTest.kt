package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence20Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject20ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject20Class

    init {
        beforeTest {
            classUnderTest = TestObject20Class(Dependence20Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2000, should return 'Hello friend 2000!'" {
                val expectedGreeting = "Hello friend 2000!"

                val actualGreeting = classUnderTest.sampleMethod(2000)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2001, should return 'Hello friend 2001!'" {
                val expectedGreeting = "Hello friend 2001!"

                val actualGreeting = classUnderTest.sampleMethod(2001)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
