package shapes

import kotlin.test.Test
import kotlin.test.assertEquals

class PointMovementTest {
    @Test
    fun testMovePoint() {
        val point = Point(3.0, 4.0)
        point.move(1.0, 1.0)
        assertEquals(4.0, point.x)
        assertEquals(5.0, point.y)
    }

    @Test
    fun testMovePointNegative() {
        val point = Point(3.0, 4.0)
        point.move(-1.0, -2.0)
        assertEquals(2.0, point.x)
        assertEquals(2.0, point.y)
    }
}


class LineMovementTest {
    @Test
    fun testMoveLine() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.move(1.0, 1.0)
        assertEquals(Point(2.0, 3.0), line.start)
        assertEquals(Point(4.0, 5.0), line.end)
    }

    @Test
    fun testMoveLineNegative() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.move(-1.0, -2.0)
        assertEquals(Point(0.0, 0.0), line.start)
        assertEquals(Point(2.0, 2.0), line.end)
    }
}

