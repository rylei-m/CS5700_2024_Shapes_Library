package shapes
import shapes.Point
import shapes.Movement

class Line(val start: Point, val end: Point) {
    init {
        require(start != end) { "Line length can't be equal to 0." }
    }
    fun getStart(): Point = start.clone()
    fun getEnd(): Point = end.clone()
    fun getSlope(): Double = (end.y - start.y) / (end.x - start.x)
    fun getLength(): Double = Math.hypot(end.x - start.x, end.y - start.y)
    Movement()
}