package shapes.Ellipsoids
import shapes.Point
import kotlin.math.PI
import shapes.Shape

open class Ellipse(
    center: Point,
    private val radiusX: Double,
    private val radiusY: Double,
) : Shape(listOf(center)) {
    init {
        require(radiusX > 0.0 && radiusY > 0.0) {"Ellipse radii must be greater than zero"}
    }
    override fun area(): Double = PI * radiusX * radiusY
    override fun move(deltaX: Double, deltaY: Double) {
        points[0].move(deltaX, deltaY)
    }
    fun getRadii(): Pair<Double, Double> = Pair(radiusX, radiusY)
}
