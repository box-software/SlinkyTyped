package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.settings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.ModelerSettings")
@js.native
class ModelerSettings protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.ModelerSettings {
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
@JSImport("mendixmodelsdk", "settings.ModelerSettings")
@js.native
object ModelerSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ModelerSettings = js.native
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * The new ModelerSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ModelerSettings = js.native
}

