package shapes.polygons

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class PolygonsTest {

    class MockRule : Rule {
        override fun isValidShape(points: List<Point>) {
            require(points.size >= 3) { "Polygon must have at least 3 points" }
        }

        override fun area(points: List<Point>): Double {
            return points.size.toDouble() // Dummy implementation for testing
        }
    }

    @Test
    fun testValidPolygon() {
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        val rule = MockRule()
        val polygon = Polygons(points, rule)
        assertEquals(points, polygon.points)
    }

    @Test
    fun testInvalidPolygon() {
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0))
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Polygon must have at least 3 points") {
            Polygons(points, rule)
        }
    }

    @Test
    fun testAreaCalculation() {
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        val rule = MockRule()
        val polygon = Polygons(points, rule)
        val expectedArea = 3.0 // As per the dummy implementation
        assertEquals(expectedArea, polygon.area())
    }
}
