package typingsSlinky.uuidDash1345.uuidDash1345Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  var variant: String
  var version: String
  def toBuffer(): Buffer
}

object UUID {
  @scala.inline
  def apply(toBuffer: () => Buffer, variant: String, version: String): UUID = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UUID]
  }
}

