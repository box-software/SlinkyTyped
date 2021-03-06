package typingsSlinky.atOracleOraclejet.ojinputtextMod

import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.Anon_Regexp
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import typingsSlinky.atOracleOraclejet.ojmessagingMod.^
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputPasswordSettableProperties extends inputBaseSettableProperties[String | Null, String | Null, String | Null]

object ojInputPasswordSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String | Null]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    readonly: Boolean,
    required: Boolean,
    translations: Anon_Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    rawValue: String = null,
    validators: js.Array[(Validator[String | Null]) | RegisteredValidator] = null,
    value: String = null
  ): ojInputPasswordSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputPasswordSettableProperties]
  }
}

