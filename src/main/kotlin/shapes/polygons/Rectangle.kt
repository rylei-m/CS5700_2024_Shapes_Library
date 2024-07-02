package shapes.Polygons
import kotlin.math.abs
import shapes.Point
import shapes.Shape
import shapes.polygons.Rule

open class Rectangle: Rule {
    override fun isValidShape(points: List<Point>) {
        require(points.size == 2) {"Rectangle needs to have exactly 2 points"}
        require(points[0] != points[1]) {"Rectangle points cant be the same"}
    }
    override fun area(points: List<Point>): Double = abs(points[1].x - points[0].x) * abs(points[1].y - points[0].y)
}
