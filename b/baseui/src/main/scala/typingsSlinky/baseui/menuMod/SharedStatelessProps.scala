package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatelessProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.undefined
  var focusMenu: js.UndefOr[js.Function1[/* event */ FocusEvent | MouseEvent | KeyboardEvent, _]] = js.undefined
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]] = js.undefined
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  var items: ItemsT
  var noResultsMsg: js.UndefOr[TagMod[Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], _]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], _]] = js.undefined
  var rootRef: js.UndefOr[Ref[_]] = js.undefined
  var unfocusMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object SharedStatelessProps {
  @scala.inline
  def apply(
    items: ItemsT,
    activedescendantId: String = null,
    focusMenu: /* event */ FocusEvent | MouseEvent | KeyboardEvent => _ = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps = null,
    highlightedIndex: Int | Double = null,
    noResultsMsg: TagMod[Any] = null,
    onBlur: /* event */ SyntheticFocusEvent[HTMLElement] => _ = null,
    onFocus: /* event */ SyntheticFocusEvent[HTMLElement] => _ = null,
    rootRef: Ref[_] = null,
    unfocusMenu: () => _ = null
  ): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId.asInstanceOf[js.Any])
    if (focusMenu != null) __obj.updateDynamic("focusMenu")(js.Any.fromFunction1(focusMenu))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2(getRequiredItemProps))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (unfocusMenu != null) __obj.updateDynamic("unfocusMenu")(js.Any.fromFunction0(unfocusMenu))
    __obj.asInstanceOf[SharedStatelessProps]
  }
}

