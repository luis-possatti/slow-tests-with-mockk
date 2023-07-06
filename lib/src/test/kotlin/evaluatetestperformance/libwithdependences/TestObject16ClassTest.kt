package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence16Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject16ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject16Class

    init {
        beforeTest {
            classUnderTest = TestObject16Class(Dependence16Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1600, should return 'Hello friend 1600!'" {
                val expectedGreeting = "Hello friend 1600!"

                val actualGreeting = classUnderTest.sampleMethod(1600)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1601, should return 'Hello friend 1601!'" {
                val expectedGreeting = "Hello friend 1601!"

                val actualGreeting = classUnderTest.sampleMethod(1601)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
