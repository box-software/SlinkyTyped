package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.FormDataRequestHandling")
@js.native
class FormDataRequestHandling protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataRequestHandling {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.FormDataRequestHandling")
@js.native
object FormDataRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataRequestHandling = js.native
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataRequestHandling = js.native
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataRequestHandling = js.native
  /**
    * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
    * The new FormDataRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataRequestHandling = js.native
}

