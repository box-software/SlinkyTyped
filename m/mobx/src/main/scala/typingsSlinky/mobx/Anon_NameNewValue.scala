package typingsSlinky.mobx

import typingsSlinky.mobx.libTypesObservableobjectMod.IObjectDidChange
import typingsSlinky.mobx.mobxStrings.update
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNewValue extends IObjectDidChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: update
}

object Anon_NameNewValue {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, oldValue: js.Any, `type`: update): Anon_NameNewValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNewValue]
  }
}

