package shapes.ellipsoids

import shapes.Ellipsoids.Ellipse
import shapes.Point
import kotlin.math.PI

class Circle(
    center: Point,
    radius: Double
): Ellipse(center, radius, radius) {
    init {
        require(radius > 0) {"Circle radius must be greater than zero."}
    }
    override fun area(points: List<Point>, radius: List<Double>): Double = PI * radius * radius
}
