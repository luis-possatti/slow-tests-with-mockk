package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence7Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject7ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject7Class

    init {
        beforeTest {
            classUnderTest = TestObject7Class(Dependence7Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 700, should return 'Hello friend 700!'" {
                val expectedGreeting = "Hello friend 700!"

                val actualGreeting = classUnderTest.sampleMethod(700)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 701, should return 'Hello friend 701!'" {
                val expectedGreeting = "Hello friend 701!"

                val actualGreeting = classUnderTest.sampleMethod(701)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
