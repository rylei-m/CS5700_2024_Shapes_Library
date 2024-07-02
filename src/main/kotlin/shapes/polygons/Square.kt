package shapes.Polygons

import shapes.Point
import kotlin.math.abs

class Square(
    private val _topLeft: Point,
    private val _size: Double
) : Rectangle(_topLeft, Point(_topLeft.x + _size, _topLeft.y + _size)) {

    init {
        require(_size > 0.0) { "The square size must be greater than zero." }
    }

    override fun isValidShape(points: List<Point>) {
        super.isValidShape(points)
        val side1 = abs(points[0].x - points[1].x)
        val side2 = abs(points[1].y - points[2].y)
        require(side1 == side2) {"all sides of a square have to be equal"}
    }

    fun area(): Double = _size * _size

    override fun move(deltaX: Double, deltaY: Double) {
        _topLeft.move(deltaX, deltaY)
        _bottomRight.move(deltaX, deltaY)
    }
}