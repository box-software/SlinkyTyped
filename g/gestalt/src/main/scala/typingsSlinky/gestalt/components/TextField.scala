package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon_EventValue
import typingsSlinky.gestalt.gestaltMod.TextFieldProps
import typingsSlinky.gestalt.gestaltStrings.`current-password`
import typingsSlinky.gestalt.gestaltStrings.date
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.email
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.off
import typingsSlinky.gestalt.gestaltStrings.on
import typingsSlinky.gestalt.gestaltStrings.password
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.text
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.url
import typingsSlinky.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.TextField] {
  @JSImport("gestalt", "TextField")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, onBlur, onFocus, placeholder */
  def apply(
    id: String,
    onChange: Anon_EventValue => Unit,
    autoComplete: `current-password` | on | off | username = null,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.TextField] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextFieldProps
}

