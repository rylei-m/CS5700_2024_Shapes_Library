package shapes.Ellipsoids
import shapes.Point
import kotlin.math.PI
import shapes.Shape
import shapes.ellipsoids.Rule

open class Ellipse: Rule {
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) { "Points must have exactly 1 point." }
        require(radii.size == 2) { "Ellipse must have exactly 2 radii." }
        require(area(points,radii) != 0.0) { "area cant be equal to 0." }
    }

    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[1]
}
