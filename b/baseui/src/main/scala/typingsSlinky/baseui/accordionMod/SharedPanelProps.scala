package typingsSlinky.baseui.accordionMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.TagMod
import typingsSlinky.baseui.Anon_ExpandedBoolean
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPanelProps extends js.Object {
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ Anon_ExpandedBoolean, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.undefined
  var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object SharedPanelProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onChange: /* args */ Anon_ExpandedBoolean => _ = null,
    onClick: /* e */ Event => _ = null,
    onKeyDown: /* e */ KeyboardEvent => _ = null,
    overrides: PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null
  ): SharedPanelProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPanelProps]
  }
}

