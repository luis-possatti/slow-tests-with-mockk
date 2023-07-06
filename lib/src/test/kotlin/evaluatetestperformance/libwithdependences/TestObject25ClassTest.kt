package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence25Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject25ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject25Class

    init {
        beforeTest {
            classUnderTest = TestObject25Class(Dependence25Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2500, should return 'Hello friend 2500!'" {
                val expectedGreeting = "Hello friend 2500!"

                val actualGreeting = classUnderTest.sampleMethod(2500)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2501, should return 'Hello friend 2501!'" {
                val expectedGreeting = "Hello friend 2501!"

                val actualGreeting = classUnderTest.sampleMethod(2501)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
