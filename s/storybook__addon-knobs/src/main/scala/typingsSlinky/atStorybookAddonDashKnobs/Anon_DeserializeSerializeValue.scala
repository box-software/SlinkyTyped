package typingsSlinky.atStorybookAddonDashKnobs

import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerializeValue extends js.Object {
  var deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]
  var serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]
}

object Anon_DeserializeSerializeValue {
  @scala.inline
  def apply(
    deserialize: /* value */ SelectTypeKnobValue => SelectTypeKnobValue,
    serialize: /* value */ SelectTypeKnobValue => SelectTypeKnobValue
  ): Anon_DeserializeSerializeValue = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerializeValue]
  }
}

