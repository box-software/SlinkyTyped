package typingsSlinky.reactDashSelect

import typingsSlinky.reactDashSelect.srcAccessibilityMod.InstructionsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextEvent extends js.Object {
  var context: js.UndefOr[InstructionsContext] = js.undefined
  var event: String
}

object Anon_ContextEvent {
  @scala.inline
  def apply(event: String, context: InstructionsContext = null): Anon_ContextEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextEvent]
  }
}

