package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.GlobalVariableRef")
@js.native
class GlobalVariableRef protected ()
  extends typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.GlobalVariableRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.GlobalVariableRef")
@js.native
object GlobalVariableRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.GlobalVariableRef = js.native
  /**
    * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
    * The new GlobalVariableRef will be automatically stored in the 'variable' property
    * of the parent VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRefExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.GlobalVariableRef = js.native
}

