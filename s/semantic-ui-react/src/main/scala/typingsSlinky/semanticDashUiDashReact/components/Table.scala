package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsTableTableMod.TableProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsCollectionsTableTableRowMod.TableRowProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.internally
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    basic: Boolean | very = null,
    celled: Boolean | internally = null,
    collapsing: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    columns: SemanticWIDTHS = null,
    compact: Boolean | very = null,
    definition: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    footerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRows: SemanticShorthandCollection[TableRowProps] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | very = null,
    renderBodyRow: (/* data */ js.Any, /* index */ Double) => _ = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    size: small | large = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stackable: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    structured: js.UndefOr[Boolean] = js.undefined,
    tableData: js.Array[_] = null,
    textAlign: center | left | right = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(definition)) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (footerRow != null) __obj.updateDynamic("footerRow")(footerRow.asInstanceOf[js.Any])
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (renderBodyRow != null) __obj.updateDynamic("renderBodyRow")(js.Any.fromFunction2(renderBodyRow))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (!js.isUndefined(structured)) __obj.updateDynamic("structured")(structured.asInstanceOf[js.Any])
    if (tableData != null) __obj.updateDynamic("tableData")(tableData.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

