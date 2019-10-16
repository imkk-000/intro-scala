class Point(var x: Int = 0, var y: Int = 0) {
    def move(dx: Int, dy: Int): Unit = {
        calc(dx, dy)
    }
    private def calc(dx: Int, dy: Int): Unit = {
        x += dx
        y += dy
    }
    override def toString: String = s"($x, $y)"
}

val p1 = new Point
p1.move(1, 2)
println(p1)

val p2 = new Point(y = 1)
p2.move(1, 2)
println(p2)
