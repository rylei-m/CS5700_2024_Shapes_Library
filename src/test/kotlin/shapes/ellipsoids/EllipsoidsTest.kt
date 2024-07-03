package shapes.ellipsoids

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipsoidsTest {

    class MockRule : Rule {
        override fun isValidShape(points: List<Point>, radii: List<Double>) {
            require(points.size == 1) { "Points must have exactly 1 point." }
            require(radii.size == 2) { "Ellipsoid must have exactly 2 radii." }
            require(area(points, radii) != 0.0) { "Area can't be equal to 0." }
        }

        override fun area(points: List<Point>, radii: List<Double>): Double {
            return radii[0] * radii[1] // Dummy implementation for testing
        }
    }

    @Test
    fun testValidEllipsoid() {
        val center = Point(0.0, 0.0)
        val radii = listOf(3.0, 4.0)
        val rule = MockRule()
        val ellipsoid = Ellipsoids(center, radii, rule)
        val expectedArea = 3.0 * 4.0 // As per the dummy implementation
        assertEquals(expectedArea, ellipsoid.area())
    }

    @Test
    fun testInvalidEllipsoidWithZeroArea() {
        val center = Point(0.0, 0.0)
        val radii = listOf(0.0, 4.0)
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Area can't be equal to 0.") {
            Ellipsoids(center, radii, rule)
        }
    }

    @Test
    fun testInvalidEllipsoidWithNegativeRadius() {
        val center = Point(0.0, 0.0)
        val radii = listOf(-3.0, 4.0)
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Area can't be equal to 0.") {
            Ellipsoids(center, radii, rule)
        }
    }

    @Test
    fun testInvalidEllipsoidWithMultiplePoints() {
        val center = Point(0.0, 0.0)
        val points = listOf(center, Point(1.0, 1.0))
        val radii = listOf(3.0, 4.0)
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Points must have exactly 1 point.") {
            rule.isValidShape(points, radii)
        }
    }

    @Test
    fun testInvalidEllipsoidWithSingleRadius() {
        val center = Point(0.0, 0.0)
        val radii = listOf(3.0)
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Ellipsoid must have exactly 2 radii.") {
            Ellipsoids(center, radii, rule)
        }
    }

    @Test
    fun testInvalidEllipsoidWithMultipleRadii() {
        val center = Point(0.0, 0.0)
        val radii = listOf(3.0, 4.0, 5.0)
        val rule = MockRule()
        assertFailsWith<IllegalArgumentException>("Ellipsoid must have exactly 2 radii.") {
            Ellipsoids(center, radii, rule)
        }
    }

    @Test
    fun testMoveEllipsoid() {
        val center = Point(0.0, 0.0)
        val radii = listOf(3.0, 4.0)
        val rule = MockRule()
        val ellipsoid = Ellipsoids(center, radii, rule)
        ellipsoid.move(1.0, 1.0)
        assertEquals(Point(1.0, 1.0), ellipsoid.points[0])
    }
}
