package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.DatabaseConstraint")
@js.native
class DatabaseConstraint protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.DatabaseConstraint {
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
@JSImport("mendixmodelsdk", "pages.DatabaseConstraint")
@js.native
object DatabaseConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseConstraint = js.native
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.0.1
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseSourceBase): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseConstraint = js.native
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    */
  def createInDatabaseSourceBaseUnderDatabaseConstraints(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseSourceBase): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseConstraint = js.native
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.1.0 and higher
    */
  def createInSelectorDatabaseSourceUnderDatabaseConstraints(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SelectorDatabaseSource): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DatabaseConstraint = js.native
}

