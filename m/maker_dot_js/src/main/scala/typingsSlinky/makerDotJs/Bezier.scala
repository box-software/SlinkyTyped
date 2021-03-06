package typingsSlinky.makerDotJs

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bezierDashJs.BezierJs.ABC
import typingsSlinky.bezierDashJs.BezierJs.Point
import typingsSlinky.bezierDashJs.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bezier")
@js.native
class Bezier protected ()
  extends typingsSlinky.bezierDashJs.BezierJs.Bezier {
  def this(points: js.Array[Point]) = this()
}

@JSGlobal("Bezier")
@js.native
object Bezier
  extends Instantiable1[/* points */ js.Array[Point], typingsSlinky.bezierDashJs.BezierJs.Bezier] {
  def cubicFromPoints(S: Point, B: Point, E: Point): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
  def cubicFromPoints(S: Point, B: Point, E: Point, t: Double, d1: Double): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
  def fromSVG(svgString: String): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
  def getABC(n: Double, S: Point, B: Point, E: Point, t: Double): ABC = js.native
  def getUtils(): Typeofutils = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
  def quadraticFromPoints(p1: Point, p2: Point, p3: Point, t: Double): typingsSlinky.bezierDashJs.BezierJs.Bezier = js.native
}

