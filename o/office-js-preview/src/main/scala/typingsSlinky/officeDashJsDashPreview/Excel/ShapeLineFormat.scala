package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.Anon_Expand
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ShapeLineFormatData
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ShapeLineFormatLoadOptions
import typingsSlinky.officeDashJsDashPreview.Excel.Interfaces.ShapeLineFormatUpdateData
import typingsSlinky.officeDashJsDashPreview.OfficeExtension.ClientObject
import typingsSlinky.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LongDash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LongDashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LongDashDotDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RoundDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Single
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Solid
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SquareDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SystemDash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SystemDashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SystemDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickBetweenThin
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThin
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThick
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineFormat")
@js.native
class ShapeLineFormat () extends ClientObject {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeLineFormat: RequestContext = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin = js.native
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: Double = js.native
  /**
    *
    * Represents whether or not the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: Boolean = js.native
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeLineFormat = js.native
  def load(options: ShapeLineFormatLoadOptions): ShapeLineFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ShapeLineFormat = js.native
  def load(propertyNames: String): ShapeLineFormat = js.native
  def load(propertyNames: js.Array[String]): ShapeLineFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ShapeLineFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeLineFormatUpdateData): Unit = js.native
  def set(properties: ShapeLineFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeLineFormat): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeLineFormatData = js.native
}

