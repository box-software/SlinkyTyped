package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown.LabelSettings

import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 200
    */
  var duration: Double
  /**
    * @default 'horizontal flip'
    */
  var transition: String
  /**
    * @default false
    */
  var variation: `false` | String
}

object _Impl {
  @scala.inline
  def apply(duration: Double, transition: String, variation: `false` | String): _Impl = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

