package typingsSlinky.mdast.mdastMod

import typingsSlinky.mdast.mdastStrings.listItem
import typingsSlinky.unist.unistMod.Data
import typingsSlinky.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends Parent {
  var checked: js.UndefOr[Boolean] = js.undefined
  @JSName("children")
  var children_ListItem: js.Array[BlockContent]
  var spread: js.UndefOr[Boolean] = js.undefined
  @JSName("type")
  var type_ListItem: listItem
}

object ListItem {
  @scala.inline
  def apply(
    children: js.Array[BlockContent],
    `type`: listItem,
    checked: js.UndefOr[Boolean] = js.undefined,
    data: Data = null,
    position: Position = null,
    spread: js.UndefOr[Boolean] = js.undefined
  ): ListItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

