package shapes.polygons

import shapes.Point
import kotlin.math.abs

class Square: Rectangle(), Rule {
    override fun isValidShape(points: List<Point>) {
        super.isValidShape(points: List<Point>) {
            require(abs(points[0].x - points[0].x) == abs(points[0].y - points[1].y)) {"Width and height have to be equal"}
        }
    }
}