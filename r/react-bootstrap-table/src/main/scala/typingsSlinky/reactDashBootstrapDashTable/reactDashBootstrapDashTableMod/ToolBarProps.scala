package typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typingsSlinky.reactDashBootstrapDashTable.Anon_BtnGroup
import typingsSlinky.reactDashBootstrapDashTable.Anon_CloseInsertModal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarProps extends js.Object {
  /**
  	 * Rendered components to use in the toolbar.
  	 */
  var components: ButtonGroupProps with Anon_BtnGroup
  /**
  	 * Event callbacks to use with a custom toolbar.
  	 */
  var event: Anon_CloseInsertModal
}

object ToolBarProps {
  @scala.inline
  def apply(components: ButtonGroupProps with Anon_BtnGroup, event: Anon_CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolBarProps]
  }
}

