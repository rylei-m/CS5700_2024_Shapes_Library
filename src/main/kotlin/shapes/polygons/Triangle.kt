package shapes.polygons
import shapes.Point
import kotlin.math.abs

class Triangle {
    fun isValidShape(points: List<Point>) {
        if (points.size <= 2) {
            throw IllegalArgumentException("Triangle must have at least 2 points")
        }
        if (area(points) == 0.0) {
            throw IllegalArgumentException("The area of a triangle cannot be 0")
        }
    }
    fun area(points: List<Point>): Double =
        abs(points[0].x * (points[1].y - points[2].y) + points[1].x * (points[2].y - points[0].y) + points[2].x * (points[0].y - points[1].y)) /2

}