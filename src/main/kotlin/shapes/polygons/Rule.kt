package shapes.polygons
import shapes.Point

interface Rule {
    fun isValidShape(points: List<Point>)
    fun area(points: List<Point>): Double
}

