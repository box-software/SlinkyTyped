package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
class WebServiceOperationSimpleParameterMapping protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationSimpleParameterMapping {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
object WebServiceOperationSimpleParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationSimpleParameterMapping = js.native
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationSimpleParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent SimpleRequestHandling element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.SimpleRequestHandling): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationSimpleParameterMapping = js.native
}

