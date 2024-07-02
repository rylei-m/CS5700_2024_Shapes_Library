package shapes.ellipsoids
import shapes.Point
import shapes.Shape

class Ellipsoids(
    points: List<Point>,
    private val radii: List<Double>,
    private val rule: Rule,
): Shape(points) {
    init {
        rule.isValidShape(points, radii)
    }
    override fun area(): Double = rule.area(points, radii)
}
