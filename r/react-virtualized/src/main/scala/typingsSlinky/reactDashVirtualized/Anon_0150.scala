package typingsSlinky.reactDashVirtualized

import typingsSlinky.reactDashVirtualized.distEsMasonryMod.emptyObject
import typingsSlinky.reactDashVirtualized.distEsMasonryMod.identity
import typingsSlinky.reactDashVirtualized.distEsMasonryMod.noop
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedBooleans.`false`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`20`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0150 extends js.Object {
  var autoHeight: `false`
  var keyMapper: identity
  var onCellsRendered: noop
  var onScroll: noop
  var overscanByPixels: `20`
  var role: grid
  var scrollingResetTimeInterval: `150`
  var style: emptyObject
  var tabIndex: `0`
}

object Anon_0150 {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => js.Any,
    onCellsRendered: () => Unit,
    onScroll: () => Unit,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: `150`,
    style: emptyObject,
    tabIndex: `0`
  ): Anon_0150 = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], keyMapper = js.Any.fromFunction1(keyMapper), onCellsRendered = js.Any.fromFunction0(onCellsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanByPixels = overscanByPixels.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0150]
  }
}

