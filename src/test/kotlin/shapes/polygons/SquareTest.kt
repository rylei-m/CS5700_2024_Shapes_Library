package shapes.polygons

import shapes.Point
import kotlin.test.Test
import kotlin.test.assertFailsWith

class SquareTest {

    @Test
    fun testValidSquare() {
        val square = Square()
        val points = listOf(Point(0.0, 0.0), Point(2.0, 0.0), Point(2.0, 2.0), Point(0.0, 2.0))
        square.isValidShape(points)
    }

    @Test
    fun testInvalidSquareDifferentWidthHeight() {
        val square = Square()
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0), Point(3.0, 2.0), Point(0.0, 2.0))
        assertFailsWith<IllegalArgumentException>("Width and height have to be equal") {
            square.isValidShape(points)
        }
    }

    @Test
    fun testInvalidSquareLessPoints() {
        val square = Square()
        val points = listOf(Point(0.0, 0.0), Point(2.0, 0.0), Point(2.0, 2.0))
        assertFailsWith<IllegalArgumentException> {
            square.isValidShape(points)
        }
    }

    @Test
    fun testInvalidSquareMorePoints() {
        val square = Square()
        val points = listOf(Point(0.0, 0.0), Point(2.0, 0.0), Point(2.0, 2.0), Point(0.0, 2.0), Point(1.0, 1.0))
        assertFailsWith<IllegalArgumentException> {
            square.isValidShape(points)
        }
    }
}
