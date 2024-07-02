package shapes.ellipsoids

import shapes.Ellipsoids.Ellipse
import shapes.Point
import kotlin.math.PI

class Circle(
    private val _center: Point,
    private val _radius: Double
): Ellipse(_center, _radius, _radius) {
    init {
        require(_radius > 0) {"Circle radius must be greater than zero."}
    }

    val center: Point
        get() = _center
    val radius: Double
        get() = _radius
    override fun area(): Double = PI * _radius * _radius

    override fun move(deltaX: Double, deltaY: Double) {
        _center.move(deltaX, deltaY)
    }
}
