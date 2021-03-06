package typingsSlinky.atAngularForms.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(
    validate: AbstractControl => ValidationErrors | Null,
    registerOnValidatorChange: /* fn */ js.Function0[Unit] => Unit = null
  ): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(js.Any.fromFunction1(registerOnValidatorChange))
    __obj.asInstanceOf[AsyncValidator]
  }
}

