package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.blockMod.AlignContent
import typingsSlinky.baseui.blockMod.AlignItems
import typingsSlinky.baseui.blockMod.AlignSelf
import typingsSlinky.baseui.blockMod.BlockOverrides
import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.baseui.blockMod.Flex
import typingsSlinky.baseui.blockMod.FlexDirection
import typingsSlinky.baseui.blockMod.GridAutoFlow
import typingsSlinky.baseui.blockMod.JustifyContent
import typingsSlinky.baseui.blockMod.JustifyItems
import typingsSlinky.baseui.blockMod.JustifySelf
import typingsSlinky.baseui.blockMod.Position
import typingsSlinky.baseui.blockMod.Responsive
import typingsSlinky.baseui.blockMod.Scale
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.styletronDashReact.styletronDashReactMod.$StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_BlockProps359346736 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  /* The following DOM/SVG props were specified: height, src, width */
  def apply(
    $style: $StyleProp[BlockProps] = null,
    alignContent: Responsive[AlignContent] = null,
    alignItems: Responsive[AlignItems] = null,
    alignSelf: Responsive[AlignSelf] = null,
    as: ReactElement = null,
    backgroundColor: Responsive[String] = null,
    bottom: Responsive[Scale] = null,
    color: Responsive[String] = null,
    display: Responsive[typingsSlinky.baseui.blockMod.Display] = null,
    flex: Responsive[Flex] = null,
    flexDirection: Responsive[FlexDirection] = null,
    flexWrap: Responsive[Boolean] = null,
    font: String | js.Array[String] = null,
    grid: Responsive[String] = null,
    gridArea: Responsive[String] = null,
    gridAutoColumns: Responsive[String] = null,
    gridAutoFlow: Responsive[GridAutoFlow] = null,
    gridAutoRows: Responsive[String] = null,
    gridColumn: Responsive[String] = null,
    gridColumnEnd: Responsive[String] = null,
    gridColumnGap: Responsive[Scale] = null,
    gridColumnStart: Responsive[String] = null,
    gridGap: Responsive[Scale] = null,
    gridRow: Responsive[String] = null,
    gridRowEnd: Responsive[String] = null,
    gridRowGap: Responsive[Scale] = null,
    gridRowStart: Responsive[String] = null,
    gridTemplate: Responsive[String] = null,
    gridTemplateAreas: Responsive[String] = null,
    gridTemplateColumns: Responsive[String] = null,
    gridTemplateRows: Responsive[String] = null,
    justifyContent: Responsive[JustifyContent] = null,
    justifyItems: Responsive[JustifyItems] = null,
    justifySelf: Responsive[JustifySelf] = null,
    left: Responsive[Scale] = null,
    margin: Responsive[Scale] = null,
    marginBottom: Responsive[Scale] = null,
    marginLeft: Responsive[Scale] = null,
    marginRight: Responsive[Scale] = null,
    marginTop: Responsive[Scale] = null,
    maxHeight: Responsive[Scale] = null,
    maxWidth: Responsive[Scale] = null,
    minHeight: Responsive[Scale] = null,
    minWidth: Responsive[Scale] = null,
    overflow: Responsive[typingsSlinky.baseui.blockMod.Overflow] = null,
    overrides: BlockOverrides = null,
    padding: Responsive[Scale] = null,
    paddingBottom: Responsive[Scale] = null,
    paddingLeft: Responsive[Scale] = null,
    paddingRight: Responsive[Scale] = null,
    paddingTop: Responsive[Scale] = null,
    placeContent: Responsive[String] = null,
    placeItems: Responsive[String] = null,
    placeSelf: Responsive[String] = null,
    position: Responsive[Position] = null,
    right: Responsive[Scale] = null,
    top: Responsive[Scale] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal()
    if ($style != null) __obj.updateDynamic("$style")($style.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnEnd != null) __obj.updateDynamic("gridColumnEnd")(gridColumnEnd.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridColumnStart != null) __obj.updateDynamic("gridColumnStart")(gridColumnStart.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowEnd != null) __obj.updateDynamic("gridRowEnd")(gridRowEnd.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridRowStart != null) __obj.updateDynamic("gridRowStart")(gridRowStart.asInstanceOf[js.Any])
    if (gridTemplate != null) __obj.updateDynamic("gridTemplate")(gridTemplate.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (placeContent != null) __obj.updateDynamic("placeContent")(placeContent.asInstanceOf[js.Any])
    if (placeItems != null) __obj.updateDynamic("placeItems")(placeItems.asInstanceOf[js.Any])
    if (placeSelf != null) __obj.updateDynamic("placeSelf")(placeSelf.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.react.reactMod.Ref[js.Any] with js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BlockProps
}

