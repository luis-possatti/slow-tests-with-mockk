package evaluatetestperformance.libwithdependences

import evaluatetestperformance.BaseSpec
import evaluatetestperformance.dependence.Dependence2Class
import io.kotest.matchers.shouldBe
/**
 *  SampleKotlinClassTest.
 */
class TestObject2ClassTest : BaseSpec() {

    private lateinit var classUnderTest: TestObject2Class

    init {
        beforeTest {
            classUnderTest = TestObject2Class(Dependence2Class())
        }

        "should return correct greeting according to the index" - {
            "when calling with index 200, should return 'Hello friend 200!'" {
                val expectedGreeting = "Hello friend 200!"

                val actualGreeting = classUnderTest.sampleMethod(200)

                actualGreeting shouldBe expectedGreeting
            }

            "when calling with index 201, should return 'Hello friend 201!'" {
                val expectedGreeting = "Hello friend 201!"

                val actualGreeting = classUnderTest.sampleMethod(201)

                actualGreeting shouldBe expectedGreeting
            }
        }
    }
}
