package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence5Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject5ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject5Class

    init {
        beforeTest {
            classUnderTest = TestObject5Class(Dependence5Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 500, should return 'Hello friend 500!'" {
                val expectedGreeting = "Hello friend 500!"

                val actualGreeting = classUnderTest.sampleMethod(500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 501, should return 'Hello friend 501!'" {
                val expectedGreeting = "Hello friend 501!"

                val actualGreeting = classUnderTest.sampleMethod(501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
