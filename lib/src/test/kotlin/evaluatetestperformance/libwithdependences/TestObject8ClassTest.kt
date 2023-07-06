package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence8Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject8ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject8Class

    init {
        beforeTest {
            classUnderTest = TestObject8Class(Dependence8Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 800, should return 'Hello friend 800!'" {
                val expectedGreeting = "Hello friend 800!"

                val actualGreeting = classUnderTest.sampleMethod(800)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 801, should return 'Hello friend 801!'" {
                val expectedGreeting = "Hello friend 801!"

                val actualGreeting = classUnderTest.sampleMethod(801)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
