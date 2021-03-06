package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLocParametersReadonly
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexSignatureBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def apply(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  def from(params: Anon_CommentsLocParametersReadonly): TSIndexSignature = js.native
}

