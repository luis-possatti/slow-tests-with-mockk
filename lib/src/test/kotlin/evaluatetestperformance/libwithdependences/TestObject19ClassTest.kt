package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence19Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject19ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject19Class

    init {
        beforeTest {
            classUnderTest = TestObject19Class(Dependence19Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1900, should return 'Hello friend 1900!'" {
                val expectedGreeting = "Hello friend 1900!"

                val actualGreeting = classUnderTest.sampleMethod(1900)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1901, should return 'Hello friend 1901!'" {
                val expectedGreeting = "Hello friend 1901!"

                val actualGreeting = classUnderTest.sampleMethod(1901)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
