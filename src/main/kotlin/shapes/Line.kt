package shapes
import shapes.Point
import shapes.Movement
import kotlin.math.sqrt
import kotlin.math.pow

class Line(
    private val _start: Point,
    private val _end: Point
): Movement {
    init {
        require(_start != _end) { "Line length can't be equal to 0." }
    }
    val start: Point
        get() = _start.clone()

    val end: Point
        get() = _end.clone()

    fun getStart(): Point = start.clone()
    fun getEnd(): Point = end.clone()
    fun getSlope(): Double = (end.y - start.y) / (end.x - start.x)
    fun getLength(): Double = sqrt((_end.x - _start.x).pow(2) + (_end.y - _start.y).pow(2))

    override fun move(deltaX: Double, deltaY: Double) {
        _start.move(deltaX, deltaY)
        _end.move(deltaX, deltaY)
    }
    override fun toString(): String = "Line($start, $end)"
}