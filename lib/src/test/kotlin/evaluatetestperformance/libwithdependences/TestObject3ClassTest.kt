package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence3Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject3ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject3Class

    init {
        beforeTest {
            classUnderTest = TestObject3Class(Dependence3Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 300, should return 'Hello friend 300!'" {
                val expectedGreeting = "Hello friend 300!"

                val actualGreeting = classUnderTest.sampleMethod(300)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 301, should return 'Hello friend 301!'" {
                val expectedGreeting = "Hello friend 301!"

                val actualGreeting = classUnderTest.sampleMethod(301)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
