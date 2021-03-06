package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import typingsSlinky.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdImpltype extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var impltype: FlowTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var supertype: FlowTypeKind
  var typeParameters: TypeParameterDeclarationKind | Null
}

object Anon_CommentsIdImpltype {
  @scala.inline
  def apply(
    id: IdentifierKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): Anon_CommentsIdImpltype = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], supertype = supertype.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsIdImpltype]
  }
}

