package shapes.Polygons
import kotlin.math.abs
import shapes.Point
import shapes.polygons.Rule

open class Rectangle(
    val topLeft: Point,
    val bottomRight: Point
) : Rule {

    init {
        require(topLeft.x != bottomRight.x && topLeft.y != bottomRight.y) {
            "Rectangle cannot have 0 width or height"
        }
    }

    override fun isValidShape(points: List<Point>)
    {
        require(points.size == 2) {"Rectangle points cannot be equal"}
        require(points[0] != points[1]) {"Incorrect number of points"}
    }

    override fun area(
        points: List<Point>): Double = abs(
        bottomRight.x - topLeft.x) * abs(
        bottomRight.y - topLeft.y)

    fun getTopLeft(): Point = topLeft.clone()
    fun getBottomRight(): Point = bottomRight.clone()
    fun getArea(): Double = abs(bottomRight.x - topLeft.x) * abs(bottomRight.y - topLeft.y)
    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        bottomRight.move(deltaX, deltaY)
    }
}