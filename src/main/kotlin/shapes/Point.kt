package org.example.shapes

class Point(
    x: Double,
    y: Double): Movement {
        private var _x: Double = x
        private var _y: Double = y
    val x: Double
        get() = _x
    val y: Double
        get() = _y
    fun clone(): Point = Point(_x, _y)
    override fun movement(deltaX: Double, deltaY: Double) {
        _x += deltaX
        _y += deltaY

    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        return _x == other._x && _y == other._y
    }

    // 31 cause hashcode needs a prime number and 31 is most standard
    override fun hashCode(): Int {
        return 31 * _x.hashCode() + _y.hashCode()
    }
    override fun toString(): String {
        return "Point(x=$_x, y=$_y)"
    }
}