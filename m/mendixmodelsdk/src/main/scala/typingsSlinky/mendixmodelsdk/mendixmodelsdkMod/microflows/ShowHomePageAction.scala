package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/show-home-page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.ShowHomePageAction")
@js.native
class ShowHomePageAction protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.ShowHomePageAction {
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
@JSImport("mendixmodelsdk", "microflows.ShowHomePageAction")
@js.native
object ShowHomePageAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowHomePageAction = js.native
  /**
    * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
    * The new ShowHomePageAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ActionActivity): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowHomePageAction = js.native
}

