package shapes.polygons
import shapes.Point
import shapes.polygons.Rule
import java.awt.Shape

class Polygons(
    points: List<Point>,
    private val rule: Rule
): Shape(points) {
    init {
        rule.isValidShape(points)
    }

    override fun area(): Double = rule.area(points)

}