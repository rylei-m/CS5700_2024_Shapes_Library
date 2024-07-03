package shapes.ellipsoids

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MockRule : Rule {
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.isNotEmpty()) { "Shape must have at least one point" }
        require(radii.isNotEmpty()) { "Shape must have at least one radius" }
    }

    override fun area(points: List<Point>, radii: List<Double>): Double {
        return points.size.toDouble() * radii.sum() // Dummy implementation for testing
    }
}

class RuleTest {

    @Test
    fun testValidShape() {
        val rule = MockRule()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(1.0)
        rule.isValidShape(points, radii)
    }

    @Test
    fun testInvalidShapeNoPoints() {
        val rule = MockRule()
        val points = emptyList<Point>()
        val radii = listOf(1.0)
        assertFailsWith<IllegalArgumentException>("Shape must have at least one point") {
            rule.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidShapeNoRadii() {
        val rule = MockRule()
        val points = listOf(Point(0.0, 0.0))
        val radii = emptyList<Double>()
        assertFailsWith<IllegalArgumentException>("Shape must have at least one radius") {
            rule.isValidShape(points, radii)
        }
    }

    @Test
    fun testAreaCalculation() {
        val rule = MockRule()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 1.0))
        val radii = listOf(1.0, 2.0)
        val expectedArea = points.size.toDouble() * radii.sum() // Dummy implementation
        assertEquals(expectedArea, rule.area(points, radii))
    }
}
