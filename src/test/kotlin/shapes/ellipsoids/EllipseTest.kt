package shapes.ellipsoids

import shapes.Point
import shapes.Ellipsoids.Ellipse
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTest {

    @Test
    fun testValidEllipse() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(3.0, 4.0)
        ellipse.isValidShape(points, radii)
        val expectedArea = Math.PI * 3.0 * 4.0
        assertEquals(expectedArea, ellipse.area(points, radii))
    }

    @Test
    fun testInvalidEllipseWithZeroArea() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(0.0, 4.0)
        assertFailsWith<IllegalArgumentException>("area cant be equal to 0.") {
            ellipse.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidEllipseWithNegativeRadius() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(-3.0, 4.0)
        assertFailsWith<IllegalArgumentException>("area cant be equal to 0.") {
            ellipse.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidEllipseWithMultiplePoints() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0), Point(1.0, 1.0))
        val radii = listOf(3.0, 4.0)
        assertFailsWith<IllegalArgumentException>("Points must have exactly 1 point.") {
            ellipse.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidEllipseWithSingleRadius() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(3.0)
        assertFailsWith<IllegalArgumentException>("Ellipse must have exactly 2 radii.") {
            ellipse.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidEllipseWithMultipleRadii() {
        val ellipse = Ellipse()
        val points = listOf(Point(0.0, 0.0))
        val radii = listOf(3.0, 4.0, 5.0)
        assertFailsWith<IllegalArgumentException>("Ellipse must have exactly 2 radii.") {
            ellipse.isValidShape(points, radii)
        }
    }
}
