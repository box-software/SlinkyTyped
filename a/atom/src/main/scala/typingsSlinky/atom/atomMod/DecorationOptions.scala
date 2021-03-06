package typingsSlinky.atom.atomMod

import typingsSlinky.atom.atomStrings.`line-number`
import typingsSlinky.atom.atomStrings.after
import typingsSlinky.atom.atomStrings.before
import typingsSlinky.atom.atomStrings.block
import typingsSlinky.atom.atomStrings.cursor_
import typingsSlinky.atom.atomStrings.gutter
import typingsSlinky.atom.atomStrings.head
import typingsSlinky.atom.atomStrings.highlight
import typingsSlinky.atom.atomStrings.line
import typingsSlinky.atom.atomStrings.overlay
import typingsSlinky.atom.atomStrings.tail
import typingsSlinky.atom.atomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationOptions extends SharedDecorationOptions {
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[String] = js.undefined
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[line | `line-number` | text | highlight | overlay | gutter | block | cursor_] = js.undefined
}

object DecorationOptions {
  @scala.inline
  def apply(
    avoidOverflow: js.UndefOr[Boolean] = js.undefined,
    `class`: String = null,
    gutterName: String = null,
    item: js.Object = null,
    omitEmptyLastRow: js.UndefOr[Boolean] = js.undefined,
    onlyEmpty: js.UndefOr[Boolean] = js.undefined,
    onlyHead: js.UndefOr[Boolean] = js.undefined,
    onlyNonEmpty: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    position: head | tail | before | after = null,
    style: js.Object = null,
    `type`: line | `line-number` | text | highlight | overlay | gutter | block | cursor_ = null
  ): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverflow)) __obj.updateDynamic("avoidOverflow")(avoidOverflow.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (gutterName != null) __obj.updateDynamic("gutterName")(gutterName.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(omitEmptyLastRow)) __obj.updateDynamic("omitEmptyLastRow")(omitEmptyLastRow.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyEmpty)) __obj.updateDynamic("onlyEmpty")(onlyEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyHead)) __obj.updateDynamic("onlyHead")(onlyHead.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyNonEmpty)) __obj.updateDynamic("onlyNonEmpty")(onlyNonEmpty.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationOptions]
  }
}

