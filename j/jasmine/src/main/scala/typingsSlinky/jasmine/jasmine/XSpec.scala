package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSpec extends js.Object {
  var id: Double
  def runs(): Unit
}

object XSpec {
  @scala.inline
  def apply(id: Double, runs: () => Unit): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], runs = js.Any.fromFunction0(runs))
  
    __obj.asInstanceOf[XSpec]
  }
}

