package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelChangesClientAction")
@js.native
class CancelChangesClientAction protected ()
  extends typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelChangesClientAction")
@js.native
object CancelChangesClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionButtonUnderAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ActionButton): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionItemUnderAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ActionItem): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DynamicImageViewer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInGridActionButtonUnderAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridActionButton): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInListViewUnderClickAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.StaticImageViewer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.CancelChangesClientAction = js.native
}

