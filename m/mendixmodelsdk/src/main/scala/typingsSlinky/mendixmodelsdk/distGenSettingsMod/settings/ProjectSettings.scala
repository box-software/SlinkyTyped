package typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.Project
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.ProjectDocument
import typingsSlinky.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument because Already inherited
- typings.mendixmodelsdk.distGenSettingsMod.settings.IProjectSettings because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings")
@js.native
class ProjectSettings protected () extends ProjectDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("model")
  var model_FProjectSettings: IModel = js.native
  @JSName("containerAsProject")
  def containerAsProject_MProjectSettings(): Project = js.native
  def settingsParts(): IList[ProjectSettingsPart] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings")
@js.native
object ProjectSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ProjectSettings unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): ProjectSettings = js.native
}

