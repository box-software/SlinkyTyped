package typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.0.0: deprecated
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttributeType because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.INumericAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IDecimalAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IFloatAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ICurrencyAttributeType because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CurrencyAttributeType")
@js.native
class CurrencyAttributeType protected () extends FloatAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCurrencyAttributeType: IModel = js.native
  @JSName("containerAsAttribute")
  def containerAsAttribute_MCurrencyAttributeType(): Attribute = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CurrencyAttributeType")
@js.native
object CurrencyAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CurrencyAttributeType = js.native
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: Attribute): CurrencyAttributeType = js.native
}

