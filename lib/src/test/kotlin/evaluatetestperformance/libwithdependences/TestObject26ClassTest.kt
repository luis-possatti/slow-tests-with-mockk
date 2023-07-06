package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence26Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject26ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject26Class

    init {
        beforeTest {
            classUnderTest = TestObject26Class(Dependence26Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2600, should return 'Hello friend 2600!'" {
                val expectedGreeting = "Hello friend 2600!"

                val actualGreeting = classUnderTest.sampleMethod(2600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2601, should return 'Hello friend 2601!'" {
                val expectedGreeting = "Hello friend 2601!"

                val actualGreeting = classUnderTest.sampleMethod(2601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
