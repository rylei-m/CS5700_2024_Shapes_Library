package org.example.shapes.Polygons
import kotlin.math.abs
import shapes.Point

open class Rectangle(
    val topLeft: Point,
    val bottomRight: Point) {

    init {
        require(topLeft.x != bottomRight.x && topLeft.y != bottomRight.y) {"Rectangle cannot have 0 width or height"}
    }
    override fun isValidShape(points: List<Point>) {
        if (topLeft[0] == topRight[0]) {"Rectangle points cannot be equal"}
        if (points.size != 2) throw RuntimeException("Incorrect number of points")
    }

    override fun area(points: List<Point>): Double = abs(bottomRight.x - topLeft.x) * abs(bottomRight.y - topLeft.y)


    fun getTopLeft(): Point = topLeft.clone()
    fun getBottomRight(): Point = bottomRight.clone()
    fun getArea(): Double = (bottomRight.x - topLeft.x) * (bottomRight.y - topLeft.y)
    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        BottomRight.move(deltaX, deltaY)
    }
}