package typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.2.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
abstract class RemoteEntitySourceDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FRemoteEntitySourceDocument: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MRemoteEntitySourceDocument(): FolderBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
object RemoteEntitySourceDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

