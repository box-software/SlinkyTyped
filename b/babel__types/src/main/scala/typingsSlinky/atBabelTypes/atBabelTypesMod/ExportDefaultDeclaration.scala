package typingsSlinky.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ExportDefaultDeclaration
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: FunctionDeclaration | TSDeclareFunction | ClassDeclaration | Expression
  @JSName("type")
  var type_ExportDefaultDeclaration: typingsSlinky.atBabelTypes.atBabelTypesStrings.ExportDefaultDeclaration
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: FunctionDeclaration | TSDeclareFunction | ClassDeclaration | Expression,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.ExportDefaultDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

@JSImport("@babel/types", "exportDefaultDeclaration")
@js.native
object exportDefaultDeclaration extends js.Object {
  def apply(declaration: ClassDeclaration): ExportDefaultDeclaration = js.native
  def apply(declaration: Expression): ExportDefaultDeclaration = js.native
  def apply(declaration: FunctionDeclaration): ExportDefaultDeclaration = js.native
  def apply(declaration: TSDeclareFunction): ExportDefaultDeclaration = js.native
}

