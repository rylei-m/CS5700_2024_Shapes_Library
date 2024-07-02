package org.example.shapes.Ellipsoids
import shapes.Point
import kotlin.math.PI
import shapes.Shape
import shapes.ellipsoids.Ellipsoids

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


/*
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) {"ellipse must have 1 point"}
        require(radii.size == 2) {"Ellipse must have 1 radii"}
        require(area(points,radii) != 0.0) {"Ellipse cannot have 0 radii"}
    }
    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[1]
 */