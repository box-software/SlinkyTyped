package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsViewsItemItemMod.ItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[ItemDescriptionProps] = null,
    extra: SemanticShorthandItem[ItemExtraProps] = null,
    header: SemanticShorthandItem[ItemHeaderProps] = null,
    image: SemanticShorthandItem[ItemImageProps] = null,
    meta: SemanticShorthandItem[ItemMetaProps] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ItemProps
}

