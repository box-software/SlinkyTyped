package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.Anon_Expand
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ChartMapOptionsData
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ChartMapOptionsLoadOptions
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ChartMapOptionsUpdateData
import typingsSlinky.officeDashJsDashPreview.OfficeExtension.ClientObject
import typingsSlinky.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Albers
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BestFit
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.City
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continent
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Country
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.County
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DataOnly
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mercator
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Miller
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Robinson
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ShowAll
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.State
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the properties for a region map chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapOptions")
@js.native
class ChartMapOptions () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = js.native
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = js.native
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartMapOptions = js.native
  def load(options: ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartMapOptions = js.native
  def load(propertyNames: String): ChartMapOptions = js.native
  def load(propertyNames: js.Array[String]): ChartMapOptions = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartMapOptions): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartMapOptionsUpdateData): Unit = js.native
  def set(properties: ChartMapOptionsUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartMapOptionsData = js.native
}

