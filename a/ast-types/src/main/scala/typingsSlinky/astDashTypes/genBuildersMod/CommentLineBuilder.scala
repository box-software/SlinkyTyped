package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_Leading
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentLineBuilder extends js.Object {
  def apply(value: String): CommentLine = js.native
  def apply(value: String, leading: Boolean): CommentLine = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): CommentLine = js.native
  def from(params: Anon_Leading): CommentLine = js.native
}

