package typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/validation-feedback relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
@js.native
class ValidationFeedbackAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FValidationFeedbackAction: IModel = js.native
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  def association(): IAssociationBase | Null = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationQualifiedName(): String | Null = js.native
  @JSName("association")
  def association_Any(): js.Any = js.native
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  def attribute(): IAttribute | Null = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String | Null = js.native
  @JSName("attribute")
  def attribute_Any(): js.Any = js.native
  def feedbackTemplate(): TextTemplate = js.native
  def feedbackTemplate(newValue: TextTemplate): js.Any = js.native
  def objectVariableName(): String = js.native
  def objectVariableName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
@js.native
object ValidationFeedbackAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ValidationFeedbackAction = js.native
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * The new ValidationFeedbackAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ValidationFeedbackAction = js.native
}

