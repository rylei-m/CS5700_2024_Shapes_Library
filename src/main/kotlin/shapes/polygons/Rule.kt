package shapes.polygons
import shape.Point

interface Rule {
    fun isValidShape(points: List<Point>)
    fun area(points: List<Point>): Double
}

