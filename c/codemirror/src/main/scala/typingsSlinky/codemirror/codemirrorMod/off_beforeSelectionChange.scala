package typingsSlinky.codemirror.codemirrorMod

import typingsSlinky.codemirror.Anon_Anchor
import typingsSlinky.codemirror.codemirrorStrings.beforeSelectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "off")
@js.native
object off_beforeSelectionChange extends js.Object {
  def apply(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* selection */ Anon_Anchor, Unit]
  ): Unit = js.native
}

