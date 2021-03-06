package typingsSlinky.baseui.breadcrumbsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var overrides: js.UndefOr[BreadcrumbsOverrides] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(ariaLabel: String = null, children: TagMod[Any] = null, overrides: BreadcrumbsOverrides = null): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

