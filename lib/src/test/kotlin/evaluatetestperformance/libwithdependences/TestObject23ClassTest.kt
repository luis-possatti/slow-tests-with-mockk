package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence23Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject23ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject23Class

    init {
        beforeTest {
            classUnderTest = TestObject23Class(Dependence23Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 2300, should return 'Hello friend 2300!'" {
                val expectedGreeting = "Hello friend 2300!"

                val actualGreeting = classUnderTest.sampleMethod(2300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 2301, should return 'Hello friend 2301!'" {
                val expectedGreeting = "Hello friend 2301!"

                val actualGreeting = classUnderTest.sampleMethod(2301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
