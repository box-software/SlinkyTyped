package typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashNativeDashMaterialDashUi.Anon_IconLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarRightElement extends js.Object {
  var actions: js.UndefOr[js.Array[Element | String]] = js.undefined
  var menu: js.UndefOr[Anon_IconLabels] = js.undefined
}

object ToolBarRightElement {
  @scala.inline
  def apply(actions: js.Array[Element | String] = null, menu: Anon_IconLabels = null): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarRightElement]
  }
}

