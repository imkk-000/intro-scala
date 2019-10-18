trait Base
case class Point(x: Int, y: Int) extends Base
case class Line(start: Point, end: Point) extends Base

object Main {
    def main(args: Array[String]): Unit = {
        val obj: Base = Line(Point(0, 1), Point(1, 2))
        obj match {
            case Point(_, _) =>
                println("It's Point")
            case Line(Point(0, 0), _) =>
                println("It's Line start with (0, 0)")
            case Line(_, _) =>
                println("It's Line")
        }
    }
}
