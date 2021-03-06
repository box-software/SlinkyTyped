package typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesGridGridCellDotTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonDotClassNamesMod.IButtonClassNames
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridCellProps[T] extends js.Object {
  /**
    * Optional, the CSS class used for when the cell is disabled
    */
  var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional, the CSS class used for when the cell is selected
    */
  var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional, className(s) to apply
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional, if the this option should be diabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    */
  var getClassNames: js.UndefOr[
    js.Function9[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      IButtonClassNames
    ]
  ] = js.undefined
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The option that will be made available to the user
    */
  var item: T
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.undefined
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ SyntheticKeyboardEvent[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.undefined
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.undefined
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.undefined
  /**
    * The accessible role for this option
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Optional, if the cell is currently selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The render callback to handle rendering the item
    */
  def onRenderItem(item: T): Element
}

object IGridCellProps {
  @scala.inline
  def apply[T](
    id: String,
    item: T,
    onRenderItem: T => Element,
    cellDisabledStyle: js.Array[String] = null,
    cellIsSelectedStyle: js.Array[String] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => IButtonClassNames = null,
    index: Int | Double = null,
    label: String = null,
    onClick: /* item */ T => Unit = null,
    onFocus: /* item */ T => Unit = null,
    onHover: /* item */ js.UndefOr[T] => Unit = null,
    onKeyDown: /* ev */ SyntheticKeyboardEvent[HTMLButtonElement] => Unit = null,
    onMouseEnter: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean = null,
    onMouseLeave: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    onMouseMove: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean = null,
    onWheel: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    role: String = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IGridCellProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
    if (cellDisabledStyle != null) __obj.updateDynamic("cellDisabledStyle")(cellDisabledStyle.asInstanceOf[js.Any])
    if (cellIsSelectedStyle != null) __obj.updateDynamic("cellIsSelectedStyle")(cellIsSelectedStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction9(getClassNames))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridCellProps[T]]
  }
}

