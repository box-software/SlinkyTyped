package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListShimmeredDetailsListDotTypesMod.IShimmeredDetailsListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListShimmeredDetailsListDotTypesMod.IShimmeredDetailsListStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListShimmeredDetailsListDotTypesMod.IShimmeredDetailsListStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShimmeredDetailsList
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ShimmeredDetailsList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    ariaLabelForShimmer: String = null,
    detailsListStyles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    enableShimmer: js.UndefOr[Boolean] = js.undefined,
    onRenderCustomPlaceholder: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, TagMod[Any]]]) => TagMod[Any] = null,
    removeFadingOverlay: js.UndefOr[Boolean] = js.undefined,
    shimmerLines: Int | Double = null,
    shimmerOverlayStyles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    styles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelForShimmer != null) __obj.updateDynamic("ariaLabelForShimmer")(ariaLabelForShimmer.asInstanceOf[js.Any])
    if (detailsListStyles != null) __obj.updateDynamic("detailsListStyles")(detailsListStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(enableShimmer)) __obj.updateDynamic("enableShimmer")(enableShimmer.asInstanceOf[js.Any])
    if (onRenderCustomPlaceholder != null) __obj.updateDynamic("onRenderCustomPlaceholder")(js.Any.fromFunction3(onRenderCustomPlaceholder))
    if (!js.isUndefined(removeFadingOverlay)) __obj.updateDynamic("removeFadingOverlay")(removeFadingOverlay.asInstanceOf[js.Any])
    if (shimmerLines != null) __obj.updateDynamic("shimmerLines")(shimmerLines.asInstanceOf[js.Any])
    if (shimmerOverlayStyles != null) __obj.updateDynamic("shimmerOverlayStyles")(shimmerOverlayStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IShimmeredDetailsListProps
}

