package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedLocObjectOptional extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var `object`: ExpressionKind
  var optional: js.UndefOr[Boolean] = js.undefined
  var property: IdentifierKind | ExpressionKind
}

object Anon_CommentsComputedLocObjectOptional {
  @scala.inline
  def apply(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): Anon_CommentsComputedLocObjectOptional = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsComputedLocObjectOptional]
  }
}

