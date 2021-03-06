package typingsSlinky.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateStrings.`inline`
import typingsSlinky.slate.slateStrings.block
import typingsSlinky.slate.slateStrings.document
import typingsSlinky.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slate.slateMod.DocumentProperties
  - typings.slate.slateMod.BlockProperties
  - typings.slate.slateMod.InlineProperties
  - typings.slate.slateMod.TextProperties
*/
trait NodeProperties extends js.Object

object NodeProperties {
  @scala.inline
  def DocumentProperties(
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: List[Node] | js.Array[Node] = null,
    `object`: document = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def BlockProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Block | Text | Inline]) | (js.Array[Block | Text | Inline]) = null,
    `object`: block = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def InlineProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Inline | Text]) | (js.Array[Inline | Text]) = null,
    `object`: `inline` = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def TextProperties(
    key: String = null,
    marks: Set[Mark] | js.Array[Mark] = null,
    `object`: text = null,
    text: String = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
}

