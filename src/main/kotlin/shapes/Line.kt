package org.example.shapes

class Line(val start: Point, val end: Point) {
    init {

    }
    fun getStart(): Point = start.clone()
    fun getEnd(): Point = end.clone()
    fun getSlope(): Double = 0.00 // slope math
    fun getLength(): Double = 0.00 //slope math
    fun move(){
        //movement
    }
}