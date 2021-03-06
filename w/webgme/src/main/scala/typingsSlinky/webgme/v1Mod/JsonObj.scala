package typingsSlinky.webgme.v1Mod

import typingsSlinky.webgme.Anon_Guid
import typingsSlinky.webgme.GmeCommon.RelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObj extends js.Object {
   // guid tree of hashes
  var bases: js.Any
  var containment: JsonContainment
  var metaSheets: js.Any
   //
  var nodes: js.Any
  var relids: js.Array[RelId]
  var root: Anon_Guid
}

object JsonObj {
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[RelId],
    root: Anon_Guid
  ): JsonObj = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonObj]
  }
}

