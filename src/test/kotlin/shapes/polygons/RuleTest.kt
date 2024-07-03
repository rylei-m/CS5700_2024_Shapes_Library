package shapes.polygons

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class MockRule : Rule {
    override fun isValidShape(points: List<Point>) {
        require(points.isNotEmpty()) { "Shape must have at least one point" }
    }

    override fun area(points: List<Point>): Double {
        return points.size.toDouble() // Dummy implementation for testing
    }
}

class RuleTest {

    @Test
    fun testValidShape() {
        val rule = MockRule()
        val points = listOf(Point(0.0, 0.0))
        rule.isValidShape(points)
    }

    @Test
    fun testInvalidShape() {
        val rule = MockRule()
        val points = emptyList<Point>()
        assertFailsWith<IllegalArgumentException>("Shape must have at least one point") {
            rule.isValidShape(points)
        }
    }

    @Test
    fun testAreaCalculation() {
        val rule = MockRule()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 1.0))
        val expectedArea = 2.0 // As per the dummy implementation
        assertEquals(expectedArea, rule.area(points))
    }
}
