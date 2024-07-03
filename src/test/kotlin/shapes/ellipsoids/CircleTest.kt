package shapes.ellipsoids

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CircleTest {

    @Test
    fun testValidCircle() {
        val circle = Circle()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(3.0)
        circle.isValidShape(points, radii)
        val expectedArea = Math.PI * 3.0 * 3.0
        assertEquals(expectedArea, circle.area(points, radii))
    }

    @Test
    fun testInvalidCircleWithZeroRadius() {
        val circle = Circle()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(0.0)
        assertFailsWith<IllegalArgumentException>("Radius cant be equal to 0.") {
            circle.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidCircleWithNegativeRadius() {
        val circle = Circle()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(-3.0)
        assertFailsWith<IllegalArgumentException>("Radius cant be equal to 0.") {
            circle.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidCircleWithMultiplePoints() {
        val circle = Circle()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 1.0))
        val radii = listOf(3.0)
        assertFailsWith<IllegalArgumentException>("Points must have exactly 1 point.") {
            circle.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidCircleWithMultipleRadii() {
        val circle = Circle()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(3.0, 4.0)
        assertFailsWith<IllegalArgumentException>("Circle must have exactly 1 radii.") {
            circle.isValidShape(points, radii)
        }
    }
}
