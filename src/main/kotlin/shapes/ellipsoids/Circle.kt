package shapes.Ellipsoids
import shapes.Point
import kotlin.math.PI
import shapes.ellipsoids.Ellipsoids

class Circle: Ellipse(), Rule {
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) {"Circles must have 1 point"}
        require(radii.size == 1) {"Circles must have 1 radii"}
        require(radii[0] != 0.0) {"Circles cannot have 0 radii"}
    }
    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[0]
}