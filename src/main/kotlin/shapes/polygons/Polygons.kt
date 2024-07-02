package shapes.polygons
import shapes.Point
import shapes.Shape

class Polygons(
    private val points: List<Point>,
    private val rule: Rule
): Shape {
    init {
        rule.isValidShape(points)
    }

    override fun area(): Double = rule.area(points)

}