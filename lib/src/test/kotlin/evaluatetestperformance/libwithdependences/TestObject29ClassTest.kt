package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence29Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject29ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject29Class

    init {
        beforeTest {
            classUnderTest = TestObject29Class(Dependence29Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2900, should return 'Hello friend 2900!'" {
                val expectedGreeting = "Hello friend 2900!"

                val actualGreeting = classUnderTest.sampleMethod(2900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2901, should return 'Hello friend 2901!'" {
                val expectedGreeting = "Hello friend 2901!"

                val actualGreeting = classUnderTest.sampleMethod(2901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
