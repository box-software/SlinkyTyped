package typingsSlinky.baseui.tabsMod

import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/tabs", "StatefulTabs")
@js.native
class StatefulTabs ()
  extends Component[StatefulTabsProps, State, js.Any] {
  def getInitialKey(): js.Any = js.native
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, changes: State): Unit = js.native
  def onTabChange(newState: State): Unit = js.native
}

