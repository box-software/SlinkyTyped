package typingsSlinky.textDashBuffer

import typingsSlinky.textDashBuffer.textDashBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
  var undo: js.UndefOr[skip] = js.undefined
}

object Anon_NormalizeLineEndings {
  @scala.inline
  def apply(normalizeLineEndings: js.UndefOr[Boolean] = js.undefined, undo: skip = null): Anon_NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NormalizeLineEndings]
  }
}

