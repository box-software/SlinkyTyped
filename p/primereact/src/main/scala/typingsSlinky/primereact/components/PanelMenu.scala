package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsMenuitemMenuItemMod.MenuItem
import typingsSlinky.primereact.componentsPanelmenuPanelMenuMod.PanelMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.panelmenuMod.PanelMenu] {
  @JSImport("primereact/panelmenu", "PanelMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    model: js.Array[MenuItem] = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.panelmenuMod.PanelMenu] = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.panelmenuMod.PanelMenu] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.panelmenuMod.PanelMenu](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PanelMenuProps
}

