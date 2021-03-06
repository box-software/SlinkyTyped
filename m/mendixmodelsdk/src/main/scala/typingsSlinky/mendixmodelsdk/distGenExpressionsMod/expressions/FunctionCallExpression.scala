package typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.AppServiceCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicCodeActionParameterValue
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicJavaActionParameterValue
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeListAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.EndEvent
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ExpressionSplitCondition
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataPart
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.GenerateDocumentAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.InspectAttribute
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.LogMessageAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MemberChange
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.RuleCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.TemplateArgument
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationParameterMapping
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.FunctionCallExpression")
@js.native
class FunctionCallExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FFunctionCallExpression: IModel = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def arguments(): IList[Expression] = js.native
  def functionName(): String = js.native
  def functionName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.FunctionCallExpression")
@js.native
object FunctionCallExpression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: BinaryExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: IfExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: IfExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: IfExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): FunctionCallExpression = js.native
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): FunctionCallExpression = js.native
}

