package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsBreadcrumbBreadCrumbMod.BreadCrumbProps
import typingsSlinky.primereact.componentsMenuitemMenuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadCrumb
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.breadcrumbMod.BreadCrumb] {
  @JSImport("primereact/breadcrumb", "BreadCrumb")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    home: js.Any = null,
    model: js.Array[MenuItem] = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.breadcrumbMod.BreadCrumb] = {
    val __obj = js.Dynamic.literal()
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.breadcrumbMod.BreadCrumb] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.breadcrumbMod.BreadCrumb](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BreadCrumbProps
}

