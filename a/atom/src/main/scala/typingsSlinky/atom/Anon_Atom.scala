package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atom extends js.Object {
  var newValue: native | experimental | poll | typingsSlinky.atom.atomStrings.atom
  var oldValue: js.UndefOr[native | experimental | poll | typingsSlinky.atom.atomStrings.atom] = js.undefined
}

object Anon_Atom {
  @scala.inline
  def apply(
    newValue: native | experimental | poll | typingsSlinky.atom.atomStrings.atom,
    oldValue: native | experimental | poll | typingsSlinky.atom.atomStrings.atom = null
  ): Anon_Atom = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Atom]
  }
}

