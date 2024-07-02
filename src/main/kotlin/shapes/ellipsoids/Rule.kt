package shapes.ellipsoids
import shapes.Point

interface Rule {
    fun isValidShape(points: List<Point>, radii: List<Double>)
    fun area(points: List<Point>, radii: List<Double>): Double
}