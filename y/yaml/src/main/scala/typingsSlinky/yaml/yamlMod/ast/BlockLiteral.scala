package typingsSlinky.yaml.yamlMod.ast

import typingsSlinky.yaml.yamlStrings.BIN
import typingsSlinky.yaml.yamlStrings.BLOCK_LITERAL
import typingsSlinky.yaml.yamlStrings.HEX
import typingsSlinky.yaml.yamlStrings.OCT
import typingsSlinky.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockLiteral
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_BlockLiteral: js.UndefOr[typingsSlinky.yaml.yamlMod.cst.BlockLiteral] = js.undefined
  @JSName("type")
  var type_BlockLiteral: BLOCK_LITERAL
}

object BlockLiteral {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: BLOCK_LITERAL,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.BlockLiteral = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): BlockLiteral = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockLiteral]
  }
}

