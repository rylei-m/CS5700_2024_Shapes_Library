package shapes

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PointTest {
    @Test
    fun testGetX() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.x)
    }

    @Test
    fun testGetY() {
        val point = Point(3.0, 4.0)
        assertEquals(4.0, point.y)
    }

    @Test
    fun testClone() {
        val point = Point(3.0, 4.0)
        val clone = point.clone()
        assertEquals(point, clone)
    }

    @Test
    fun testMove() {
        val point = Point(3.0, 4.0)
        point.move(1.0, 1.0)
        assertEquals(4.0, point.x)
        assertEquals(5.0, point.y)
    }

    @Test
    fun testEquals() {
        val point1 = Point(3.0, 4.0)
        val point2 = Point(3.0, 4.0)
        val point3 = Point(5.0, 6.0)
        assertTrue(point1 == point2)
        assertTrue(point1 != point3)
    }

    @Test
    fun testHashCode() {
        val point1 = Point(3.0, 4.0)
        val point2 = Point(3.0, 4.0)
        val point3 = Point(5.0, 6.0)
        assertEquals(point1.hashCode(), point2.hashCode())
        assertTrue(point1.hashCode() != point3.hashCode())
    }

    @Test
    fun testToString() {
        val point = Point(3.0, 4.0)
        assertEquals("Point(x=3.0, y=4.0)", point.toString())
    }
}
