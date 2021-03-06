package typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod

import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null
  var initialCount: ArgumentValue
  var kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Stream
  var label: String
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
}

object Stream {
  @scala.inline
  def apply(
    initialCount: ArgumentValue,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null
  ): Stream = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

