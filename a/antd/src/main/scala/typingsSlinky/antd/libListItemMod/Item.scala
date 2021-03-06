package typingsSlinky.antd.libListItemMod

import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item
  extends Component[ListItemProps, js.Any, js.Any] {
  def isFlexMode(): Boolean = js.native
  def isItemContainsTextNode(): js.UndefOr[scala.Nothing] = js.native
  def renderItem(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

