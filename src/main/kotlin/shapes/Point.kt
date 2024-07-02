package org.example.shapes

class Point(
    x: Double,
    y: Double): Movement {
        private var _x: Double = x
        private var _y: Double = y
    val x: Double
        get() = this._x
    val y: Double
        get() = _y
    fun clone(): Point = Point(x, y)
    override fun movement(deltaX: Double, deltaY: Double) {
        this._x += deltaX
        this._y += deltaY

    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        return _x == other._x && _y == other._y
    }
}