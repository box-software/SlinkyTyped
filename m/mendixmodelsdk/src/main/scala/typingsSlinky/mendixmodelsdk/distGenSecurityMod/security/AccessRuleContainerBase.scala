package typingsSlinky.mendixmodelsdk.distGenSecurityMod.security

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AccessRule
import typingsSlinky.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
abstract class AccessRuleContainerBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAccessRuleContainerBase: IModel = js.native
  def accessRules(): IList[AccessRule] = js.native
  def containerAsProjectSecurity(): ProjectSecurity = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
object AccessRuleContainerBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

