package org.example.shapes.Polygons

class Rectangle(
    val topLeft: Point,
    val topRight: Point) {

    init {
        require(topLeft.x != bottomRight.x && topLeft.y != bottomRight.y) {"Rectangle cannot have 0 width or height"}
    }

    fun getTopLeft(): Point = topLeft.clone()
    fun getBottomRight(): Point = bottomRight.clone()
    fun getArea(): Double = (bottomRight.x - topLeft.x) * (bottomRight.y - topLeft.y)
    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        BottomRight.move(deltaX, deltaY)
    }
}