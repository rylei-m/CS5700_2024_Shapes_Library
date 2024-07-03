package shapes.polygons

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TriangleTest {

    @Test
    fun testValidTriangle() {
        val triangle = Triangle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        triangle.isValidShape(points)
    }

    @Test
    fun testInvalidTriangleWithLessPoints() {
        val triangle = Triangle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0))
        assertFailsWith<IllegalArgumentException>("Triangle must have exactly 3 points") {
            triangle.isValidShape(points)
        }
    }

    @Test
    fun testInvalidTriangleWithMorePoints() {
        val triangle = Triangle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0), Point(1.0, 1.0))
        assertFailsWith<IllegalArgumentException>("Triangle must have exactly 3 points") {
            triangle.isValidShape(points)
        }
    }

    @Test
    fun testInvalidTriangleWithZeroArea() {
        val triangle = Triangle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(2.0, 0.0))
        assertFailsWith<IllegalArgumentException>("Triangle must have an area") {
            triangle.isValidShape(points)
        }
    }

    @Test
    fun testAreaCalculation() {
        val triangle = Triangle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        val expectedArea = 0.5
        assertEquals(expectedArea, triangle.area(points))
    }

    @Test
    fun testAreaCalculationForDifferentPoints() {
        val triangle = Triangle()
        val points = listOf(Point(1.0, 1.0), Point(4.0, 1.0), Point(1.0, 5.0))
        val expectedArea = 6.0
        assertEquals(expectedArea, triangle.area(points))
    }
}
