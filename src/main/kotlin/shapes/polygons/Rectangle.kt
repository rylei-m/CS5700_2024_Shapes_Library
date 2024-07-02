package shapes.Polygons
import kotlin.math.abs
import shapes.Point
import shapes.Shape
import shapes.polygons.Rule

open class Rectangle(
    private val _topLeft: Point,
    private val _bottomRight: Point
) : Shape(listOf(_topLeft, _bottomRight)), Rule {

    init {
        require(_topLeft.x != _bottomRight.x && _topLeft.y != _bottomRight.y) {
            "Rectangle cannot have 0 width or height"
        }
    }

    val topLeft: Point
        get() = _topLeft.clone();

    val bottomRight: Point
        get() = _bottomRight.clone();

    override fun area(): Double =abs(_bottomRight.x -_topLeft.x) * abs(_bottomRight.y -_topLeft.y)

    override fun move(deltaX: Double, deltaY: Double) {
        _topLeft.move(deltaX, deltaY)
        _bottomRight.move(deltaX, deltaY)
    }

    fun getTopLeft(): Point = _topLeft.clone()
    fun getBottomRight(): Point = _bottomRight.clone()
    override fun isValidShape(points: List<Point>) {
        TODO("Not yet implemented")
    }

    override fun area(points: List<Point>): Double {
        TODO("Not yet implemented")
    }

}
