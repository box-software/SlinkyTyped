package typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: TagMod[Any]
  var search: js.UndefOr[String] = js.undefined
}

object HighligherProps {
  @scala.inline
  def apply(children: TagMod[Any], search: String = null): HighligherProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighligherProps]
  }
}

