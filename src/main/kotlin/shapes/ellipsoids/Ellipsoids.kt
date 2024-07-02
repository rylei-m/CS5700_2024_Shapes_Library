package shapes.ellipsoids
import shapes.Point
import shapes.Shape

class Ellipsoids(
    center: Point,
    private val radii: List<Double>,
    private val rule: Rule,
): Shape(listOf(center)) {
    init {
        rule.isValidShape(points, radii)
    }
    override fun area(): Double = rule.area(points, radii)

    override fun move(deltaX: Double, deltaY: Double) {
        points[0].move(deltaX, deltaY)
    }
}
