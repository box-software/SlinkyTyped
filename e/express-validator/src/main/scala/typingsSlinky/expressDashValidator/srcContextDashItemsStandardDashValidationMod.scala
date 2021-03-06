package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.Meta
import typingsSlinky.expressDashValidator.srcBaseMod.StandardValidator
import typingsSlinky.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typingsSlinky.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/standard-validation", JSImport.Namespace)
@js.native
object srcContextDashItemsStandardDashValidationMod extends js.Object {
  @js.native
  class StandardValidation protected () extends ContextItem {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
    var message: js.Any = js.native
    val negated: js.Any = js.native
    val options: js.Any = js.native
    val validator: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

