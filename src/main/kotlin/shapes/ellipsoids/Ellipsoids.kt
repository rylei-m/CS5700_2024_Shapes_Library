package shapes.ellipsoids
import shapes.Point
import shapes.ellipsoids.Rule

class Ellipsoids(
    points: List<Point>,
    val radii: List<Double>,
    private val rule: Rule
): Shape(points) {
    init{
        rule.IsValidShape(points, radii)
    }
    override fun area(): Double = policy.area(points, radii)
}
