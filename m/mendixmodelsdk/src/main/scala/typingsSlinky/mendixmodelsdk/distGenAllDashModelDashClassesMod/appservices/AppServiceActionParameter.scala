package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.AppServiceActionParameter")
@js.native
class AppServiceActionParameter protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.AppServiceActionParameter")
@js.native
object AppServiceActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
    * of the parent AppServiceAction element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction): typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter = js.native
}

