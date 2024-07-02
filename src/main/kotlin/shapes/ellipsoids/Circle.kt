package shapes.ellipsoids

import shapes.Ellipsoids.Ellipse
import shapes.Point
import kotlin.math.PI

class Circle: Ellipse(), Rule {
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) { "Points must have exactly 1 point." }
        require(radii.size == 1) { "Circle must have exactly 1 radii." }
        require(radii[0] != 0.0) { "Radius cant be equal to 0." }
    }

    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[0]
}

