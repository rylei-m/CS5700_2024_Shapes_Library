package shapes.ellipsoids

import org.example.shapes.Ellipsoids.Ellipse
import shapes.Point
import kotlin.math.PI
import shapes.ellipsoids.Rule

class Circle(
    center: Point,
    radius: Double
): Ellipse(center, radius, radius) {
    init {
        require(radius > 0) {"Circle radius must be greater than zero."}
    }
    override fun area(points: List<Point>, radius: List<Double>): Double = PI * radius * radius
}
/*
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) {"Circles must have 1 point"}
        require(radii.size == 1) {"Circles must have 1 radii"}
        require(radii[0] != 0.0) {"Circles cannot have 0 radii"}
    }
*/