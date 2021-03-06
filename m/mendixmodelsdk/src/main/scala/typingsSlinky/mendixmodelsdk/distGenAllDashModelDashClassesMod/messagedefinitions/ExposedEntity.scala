package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
@js.native
class ExposedEntity protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedEntity {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.ExposedEntity")
@js.native
object ExposedEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'children' property
    * of the parent mappings.Element element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInElementUnderChildren(container: Element): typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
    * of the parent EntityMessageDefinition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInEntityMessageDefinitionUnderExposedEntity(
    container: typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition
  ): typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
  /**
    * Creates and returns a new ExposedEntity instance in the SDK and on the server.
    * The new ExposedEntity will be automatically stored in the 'elements' property
    * of the parent jsonstructures.JsonStructure element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = js.native
}

