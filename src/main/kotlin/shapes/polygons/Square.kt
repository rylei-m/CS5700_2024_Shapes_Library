package shapes.Polygons

import shapes.Point
import kotlin.math.abs

class Square(
    topLeft: Point
    , size: Double
) : Rectangle(topLeft, Point(topLeft.x + size, topLeft.y + size)) {

    init {
        require(size > 0.0) { "The square size must be greater than zero." }
    }

    override fun isValidShape(points: List<Point>) {
        super.isValidShape(points)
        val side1 = abs(points[0].x - points[1].x)
        val side2 = abs(points[1].y - points[2].y)
        require(side1 == side2) {"all sides of a square have to be equal"}
    }

    fun area(): Double = size * size
}