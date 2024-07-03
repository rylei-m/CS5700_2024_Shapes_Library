package shapes

import kotlin.test.Test
import kotlin.test.assertEquals


class MockShape(points: List<Point>) : Shape(points) {
    override fun area(): Double {
        // Just a dummy implementation for testing purposes
        return 42.0
    }
}

class ShapeTest {
    @Test
    fun testGetPoints() {
        val points = listOf(Point(1.0, 2.0), Point(3.0, 4.0))
        val shape = MockShape(points)
        val shapePoints = shape.points
        assertEquals(points.size, shapePoints.size)
        for (i in points.indices) {
            assertEquals(points[i], shapePoints[i])
        }
    }

    @Test
    fun testMoveShape() {
        val points = listOf(Point(1.0, 2.0), Point(3.0, 4.0))
        val shape = MockShape(points)
        shape.move(1.0, 1.0)
        val movedPoints = shape.points
        assertEquals(Point(2.0, 3.0), movedPoints[0])
        assertEquals(Point(4.0, 5.0), movedPoints[1])
    }

    @Test
    fun testArea() {
        val shape = MockShape(listOf(Point(1.0, 2.0), Point(3.0, 4.0)))
        assertEquals(42.0, shape.area())
    }
}
