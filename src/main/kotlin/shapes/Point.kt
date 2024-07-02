package org.example.shapes

data class Point(var x: Double, var y: Double) {
    fun clone(): Point = Point(x,y)
    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}