package typingsSlinky.atReachTabs.atReachTabsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'onChange'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait TabsProps extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var children: TagMod[Any]
  var defaultIndex: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    as: String = null,
    defaultIndex: Int | Double = null,
    index: Int | Double = null,
    onChange: /* index */ Double => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

