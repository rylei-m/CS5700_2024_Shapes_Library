package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LineTest {
    @Test
    fun testGetStart() {
        val start = Point(1.0, 2.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        assertEquals(start, line.start)
    }

    @Test
    fun testGetEnd() {
        val start = Point(1.0, 2.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        assertEquals(end, line.end)
    }

    @Test
    fun testSlope() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        assertEquals(1.0, line.slope())
    }

    @Test
    fun testSlopeVerticalLine() {
        val line = Line(Point(1.0, 2.0), Point(1.0, 4.0))
        assertFailsWith<IllegalArgumentException> { line.slope() }
    }

    @Test
    fun testGetLength() {
        val line = Line(Point(1.0, 2.0), Point(4.0, 6.0))
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testMove() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.move(1.0, 1.0)
        assertEquals(Point(2.0, 3.0), line.start)
        assertEquals(Point(4.0, 5.0), line.end)
    }
}
