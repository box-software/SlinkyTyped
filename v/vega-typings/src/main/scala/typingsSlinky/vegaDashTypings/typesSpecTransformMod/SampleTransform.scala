package typingsSlinky.vegaDashTypings.typesSpecTransformMod

import typingsSlinky.vegaDashTypings.typesSpecSignalMod.SignalRef
import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.sample
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleTransform extends _Transforms {
  var size: Double | SignalRef
  var `type`: sample
}

object SampleTransform {
  @scala.inline
  def apply(size: Double | SignalRef, `type`: sample): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleTransform]
  }
}

