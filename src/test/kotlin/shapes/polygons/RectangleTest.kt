package shapes.polygons

import shapes.Point
import shapes.Polygons.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RectangleTest {

    @Test
    fun testValidRectangle() {
        val rectangle = Rectangle()
        val points = listOf(Point(0.0, 0.0), Point(4.0, 3.0))
        rectangle.isValidShape(points)
    }

    @Test
    fun testInvalidRectangleSamePoints() {
        val rectangle = Rectangle()
        val points = listOf(Point(0.0, 0.0), Point(0.0, 0.0))
        assertFailsWith<IllegalArgumentException>("Rectangle points can't be the same") {
            rectangle.isValidShape(points)
        }
    }

    @Test
    fun testInvalidRectangleLessPoints() {
        val rectangle = Rectangle()
        val points = listOf(Point(0.0, 0.0))
        assertFailsWith<IllegalArgumentException>("Rectangle needs to have exactly 2 points") {
            rectangle.isValidShape(points)
        }
    }

    @Test
    fun testInvalidRectangleMorePoints() {
        val rectangle = Rectangle()
        val points = listOf(Point(0.0, 0.0), Point(4.0, 3.0), Point(2.0, 1.5))
        assertFailsWith<IllegalArgumentException>("Rectangle needs to have exactly 2 points") {
            rectangle.isValidShape(points)
        }
    }

    @Test
    fun testAreaCalculation() {
        val rectangle = Rectangle()
        val points = listOf(Point(0.0, 0.0), Point(4.0, 3.0))
        val expectedArea = 12.0
        assertEquals(expectedArea, rectangle.area(points))
    }

    @Test
    fun testAreaCalculationWithNegativeCoordinates() {
        val rectangle = Rectangle()
        val points = listOf(Point(-1.0, -1.0), Point(3.0, 2.0))
        val expectedArea = 12.0
        assertEquals(expectedArea, rectangle.area(points))
    }
}
