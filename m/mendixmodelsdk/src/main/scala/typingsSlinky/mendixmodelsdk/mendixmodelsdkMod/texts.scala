package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticLabel
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Title
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AssociationDeleteBehavior
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule
import typingsSlinky.mendixmodelsdk.distGenEnumerationsMod.enumerations.EnumerationValue
import typingsSlinky.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.Microflow
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.TextTemplate
import typingsSlinky.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidgetWithPlaceholder
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Button
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CallNanoflowClientAction
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ControlBarButton
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DropDown
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DropDownButtonItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridColumn
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.InputWidget
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Label
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.LoginTextBox
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MasterDetailDetailRegion
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Page
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.PageSettings
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ReferenceSelector
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SearchField
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.TextArea
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.BasicReportAggregate
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.BasicReportColumn
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportButton
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportChart
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportChartSeries
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeField
import typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "texts")
@js.native
object texts extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @js.native
  class SystemText protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.texts.SystemText {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  @js.native
  class SystemTextCollection protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.texts.SystemTextCollection {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.texts.Text {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class Translation protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.texts.Translation {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object SystemText extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.SystemText = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.SystemTextCollection): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.SystemText = js.native
  }
  
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.SystemTextCollection = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: Button): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    def createInClientTemplateUnderFallback(container: ClientTemplate): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: DataView): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: GridColumn): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: InputWidget): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: Label): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: MenuItem): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      */
    def createInPageSettingsUnderFormTitle(container: PageSettings): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: Page): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: ReportButton): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: ReportChart): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: ReportChart): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: SearchField): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: SearchField): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: StaticLabel): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.SystemText): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: TabPage): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: TextArea): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: TextTemplate): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: Title): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text = js.native
  }
  
  /* static members */
  @js.native
  object Translation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Translation = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text): typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Translation = js.native
  }
  
}

