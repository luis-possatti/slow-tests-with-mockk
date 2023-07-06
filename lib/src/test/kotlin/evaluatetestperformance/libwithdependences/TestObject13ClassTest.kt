package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence13Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject13ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject13Class

    init {
        beforeTest {
            classUnderTest = TestObject13Class(Dependence13Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 1300, should return 'Hello friend 1300!'" {
                val expectedGreeting = "Hello friend 1300!"

                val actualGreeting = classUnderTest.sampleMethod(1300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 1301, should return 'Hello friend 1301!'" {
                val expectedGreeting = "Hello friend 1301!"

                val actualGreeting = classUnderTest.sampleMethod(1301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
