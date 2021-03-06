package typingsSlinky.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPathTree extends js.Object {
  def getDistTo(vertex: Double): Double
  def hasDistTo(vertex: Double): Boolean
  def pathTo(vertex: Double): js.Array[Double]
}

object ShortestPathTree {
  @scala.inline
  def apply(getDistTo: Double => Double, hasDistTo: Double => Boolean, pathTo: Double => js.Array[Double]): ShortestPathTree = {
    val __obj = js.Dynamic.literal(getDistTo = js.Any.fromFunction1(getDistTo), hasDistTo = js.Any.fromFunction1(hasDistTo), pathTo = js.Any.fromFunction1(pathTo))
  
    __obj.asInstanceOf[ShortestPathTree]
  }
}

