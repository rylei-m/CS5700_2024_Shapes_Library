package shapes.polygons
import shapes.Point
import kotlin.math.abs

class Triangle: Rule {
    override fun isValidShape(points: List<Point>) {
        require(points.size == 3) {"Triangle must have exactly 3 points"}
        require(area(points) != 0.0) { "Triangle must have a area" }
    }
    override fun area(points: List<Point>): Double =
        abs(points[0].x * (points[1].y - points[2].y) +
                points[1].x * (points[2].y - points[0].y) +
                points[2].x * (points[0].y - points[1].y)) /2
}