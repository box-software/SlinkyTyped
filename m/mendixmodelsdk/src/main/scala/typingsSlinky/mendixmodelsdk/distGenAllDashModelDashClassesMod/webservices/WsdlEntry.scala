package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.WsdlEntry")
@js.native
class WsdlEntry protected ()
  extends typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlEntry {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.WsdlEntry")
@js.native
object WsdlEntry extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlEntry = js.native
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription): typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlEntry = js.native
}

