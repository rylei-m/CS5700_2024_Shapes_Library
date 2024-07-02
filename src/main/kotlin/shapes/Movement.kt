package shapes

// interface defines a group of methods that must be implemented by a class that implement it
interface Movement {
    fun move(deltaX: Double, deltaY: Double): Unit
}