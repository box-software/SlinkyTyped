package typingsSlinky.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  val basename: String
  val custom: Boolean
  val hack: String
  val name: String
  val prefix: String
  val vendor: String
}

object Property {
  @scala.inline
  def apply(basename: String, custom: Boolean, hack: String, name: String, prefix: String, vendor: String): Property = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], hack = hack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Property]
  }
}

@JSImport("css-tree", "property")
@js.native
object property extends js.Object {
  def apply(value: String): Property = js.native
}

