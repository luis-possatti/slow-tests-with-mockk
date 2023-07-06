package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence9Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject9ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject9Class

    init {
        beforeTest {
            classUnderTest = TestObject9Class(Dependence9Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 900, should return 'Hello friend 900!'" {
                val expectedGreeting = "Hello friend 900!"

                val actualGreeting = classUnderTest.sampleMethod(900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 901, should return 'Hello friend 901!'" {
                val expectedGreeting = "Hello friend 901!"

                val actualGreeting = classUnderTest.sampleMethod(901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
