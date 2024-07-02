package shapes

abstract class Shape(
    private val _points: List<Point>,
): Movement {
    open val points: List<Point>
        get() = _points.map{ point -> Point(point.x, point.y)}

    override fun move(deltaX: Double, deltaY: Double) =
        _points.forEach { point -> point.move(deltaX, deltaY) }

    abstract fun area(): Double
}