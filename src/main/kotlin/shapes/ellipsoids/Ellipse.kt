package org.example.shapes.Ellipsoids
import shapes.Point
import kotlin.math.PI
import shapes.ellipsoids.Ellipsoids

class Ellipse: Rule {
    override fun isValidShape(points: List<Point>, radii: List<Double>) {
        require(points.size == 1) {"ellipse must have 1 point"}
        require(radii.size == 2) {"Ellipse must have 1 radii"}
        require(area(points,radii) != 0.0) {"Ellipse cannot have 0 radii"}
    }
    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[1]
}