package typingsSlinky.chromeDashApps.chrome.clipboard

import typingsSlinky.chromeDashApps.Anon_TEXTHTML
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.textHtml
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.textPlain
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalItems extends js.Object {
  /**
    * Content of the additional data item.
    * Either the plain text string if *type* is 'textPlain' or
    * markup string if *type* is 'textHtml'.
    * The data can not exceed 2MB.
    */
  var data: String
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: ToStringLiteral[Anon_TEXTHTML, String, Exclude[String, textPlain | textHtml]]
}

object AdditionalItems {
  @scala.inline
  def apply(
    data: String,
    `type`: ToStringLiteral[Anon_TEXTHTML, String, Exclude[String, textPlain | textHtml]]
  ): AdditionalItems = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalItems]
  }
}

