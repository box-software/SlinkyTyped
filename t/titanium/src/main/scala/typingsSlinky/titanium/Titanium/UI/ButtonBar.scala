package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.AnimationOption
import typingsSlinky.titanium.BarItemType
import typingsSlinky.titanium.Dimension
import typingsSlinky.titanium.Gradient
import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.Proxy
import typingsSlinky.titanium.Titanium.UI.iOS.PreviewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An iOS button bar component.
		 */
@js.native
trait ButtonBar extends Proxy {
  /**
  			 * Whether the view should be "hidden" from (i.e., ignored by) the accessibility service.
  			 */
  var accessibilityHidden: Boolean = js.native
  /**
  			 * Briefly describes what performing an action (such as a click) on the view will do.
  			 */
  var accessibilityHint: String = js.native
  /**
  			 * A succint label identifying the view for the device's accessibility service.
  			 */
  var accessibilityLabel: String = js.native
  /**
  			 * A string describing the value (if any) of the view for the device's accessibility service.
  			 */
  var accessibilityValue: String = js.native
  /**
  			 * Coordinate of the view about which to pivot an animation.
  			 */
  var anchorPoint: Point = js.native
  /**
  			 * Current position of the view during an animation.
  			 */
  val animatedCenter: Point = js.native
  /**
  			 * Background color of the view, as a color name or hex triplet.
  			 */
  var backgroundColor: String = js.native
  /**
  			 * A background gradient for the view.
  			 */
  var backgroundGradient: Gradient = js.native
  /**
  			 * Background image for the view, specified as a local file path or URL.
  			 */
  var backgroundImage: String = js.native
  /**
  			 * Size of the left end cap.
  			 */
  var backgroundLeftCap: Double = js.native
  /**
  			 * Determines whether to tile a background across a view.
  			 */
  var backgroundRepeat: Boolean = js.native
  /**
  			 * Size of the top end cap.
  			 */
  var backgroundTopCap: Double = js.native
  /**
  			 * Border color of the view, as a color name or hex triplet.
  			 */
  var borderColor: String = js.native
  /**
  			 * Radius for the rounded corners of the view's border.
  			 */
  var borderRadius: Double = js.native
  /**
  			 * Border width of the view.
  			 */
  var borderWidth: Double = js.native
  /**
  			 * View's bottom position, in platform-specific units.
  			 */
  var bottom: Double | String = js.native
  /**
  			 * View's center position, in the parent view's coordinates.
  			 */
  var center: Point = js.native
  /**
  			 * View's clipping behavior.
  			 */
  var clipMode: Double = js.native
  /**
  			 * View height, in platform-specific units.
  			 */
  var height: Double | String = js.native
  /**
  			 * Adds a horizontal parallax effect to the view
  			 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  			 * Determines whether the layout has wrapping behavior.
  			 */
  var horizontalWrap: Boolean = js.native
  /**
  			 * Index of the currently selected button.
  			 */
  var index: Double = js.native
  /**
  			 * Array of labels for the button bar.
  			 */
  var labels: js.Array[BarItemType | String] = js.native
  /**
  			 * Specifies how the view positions its children.
  			 * One of: 'composite', 'vertical', or 'horizontal'.
  			 */
  var layout: String = js.native
  /**
  			 * View's left position, in platform-specific units.
  			 */
  var left: Double | String = js.native
  /**
  			 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque). Defaults to 1.0 (opaque).
  			 */
  var opacity: Double = js.native
  /**
  			 * The preview context used in the 3D-Touch feature "Peek and Pop".
  			 */
  var previewContext: PreviewContext = js.native
  /**
  			 * Background color of the wrapper view when this view is used as either <Titanium.UI.ListView.pullView> or <Titanium.UI.TableView.headerPullView>.
  			 * Defaults to `undefined`. Results in a light grey background color on the wrapper view.
  			 */
  var pullBackgroundColor: String = js.native
  /**
  			 * The bounding box of the view relative to its parent, in system units.
  			 */
  val rect: Dimension = js.native
  /**
  			 * View's right position, in platform-specific units.
  			 */
  var right: Double | String = js.native
  /**
  			 * The size of the view in system units.
  			 */
  val size: Dimension = js.native
  /**
  			 * The view's tintColor
  			 */
  var tintColor: String = js.native
  /**
  			 * The view's top position.
  			 */
  var top: Double | String = js.native
  /**
  			 * Determines whether view should receive touch events.
  			 */
  var touchEnabled: Boolean = js.native
  /**
  			 * Transformation matrix to apply to the view.
  			 */
  var transform: Matrix2D | Matrix3D = js.native
  /**
  			 * Adds a vertical parallax effect to the view
  			 */
  var verticalMotionEffect: js.Any = js.native
  /**
  			 * Determines the color of the shadow.
  			 */
  var viewShadowColor: String = js.native
  /**
  			 * Determines the offset for the shadow of the view.
  			 */
  var viewShadowOffset: Point = js.native
  /**
  			 * Determines the blur radius used to create the shadow.
  			 */
  var viewShadowRadius: Double = js.native
  /**
  			 * Determines whether the view is visible.
  			 */
  var visible: Boolean = js.native
  /**
  			 * View's width, in platform-specific units.
  			 */
  var width: Double | String = js.native
  /**
  			 * Z-index stack order position, relative to other sibling views.
  			 */
  var zIndex: Double = js.native
  /**
  			 * Animates this view.
  			 */
  def animate(animation: js.Any): Unit = js.native
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Translates a point from this view's coordinate system to another view's coordinate system.
  			 */
  def convertPointToView(point: Point, destinationView: js.Any): Point = js.native
  /**
  			 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  			 * view tree.
  			 */
  def finishLayout(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.accessibilityHidden> property.
  			 */
  def getAccessibilityHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.accessibilityHint> property.
  			 */
  def getAccessibilityHint(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.accessibilityLabel> property.
  			 */
  def getAccessibilityLabel(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.accessibilityValue> property.
  			 */
  def getAccessibilityValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.anchorPoint> property.
  			 */
  def getAnchorPoint(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.animatedCenter> property.
  			 */
  def getAnimatedCenter(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundColor> property.
  			 */
  def getBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundGradient> property.
  			 */
  def getBackgroundGradient(): Gradient = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundImage> property.
  			 */
  def getBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundLeftCap> property.
  			 */
  def getBackgroundLeftCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundRepeat> property.
  			 */
  def getBackgroundRepeat(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.backgroundTopCap> property.
  			 */
  def getBackgroundTopCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.borderColor> property.
  			 */
  def getBorderColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.borderRadius> property.
  			 */
  def getBorderRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.borderWidth> property.
  			 */
  def getBorderWidth(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.bottom> property.
  			 */
  def getBottom(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.center> property.
  			 */
  def getCenter(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.clipMode> property.
  			 */
  def getClipMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.height> property.
  			 */
  def getHeight(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.horizontalMotionEffect> property.
  			 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.horizontalWrap> property.
  			 */
  def getHorizontalWrap(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.index> property.
  			 */
  def getIndex(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.labels> property.
  			 */
  def getLabels(): js.Array[BarItemType | String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.layout> property.
  			 */
  def getLayout(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.left> property.
  			 */
  def getLeft(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.opacity> property.
  			 */
  def getOpacity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.previewContext> property.
  			 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.pullBackgroundColor> property.
  			 */
  def getPullBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.rect> property.
  			 */
  def getRect(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.right> property.
  			 */
  def getRight(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.size> property.
  			 */
  def getSize(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.tintColor> property.
  			 */
  def getTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.top> property.
  			 */
  def getTop(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.touchEnabled> property.
  			 */
  def getTouchEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.transform> property.
  			 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.verticalMotionEffect> property.
  			 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  			 * Returns the matching view of a given view ID.
  			 */
  def getViewById(id: String): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.viewShadowColor> property.
  			 */
  def getViewShadowColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.viewShadowOffset> property.
  			 */
  def getViewShadowOffset(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.viewShadowRadius> property.
  			 */
  def getViewShadowRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.visible> property.
  			 */
  def getVisible(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.width> property.
  			 */
  def getWidth(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ButtonBar.zIndex> property.
  			 */
  def getZIndex(): Double = js.native
  /**
  			 * Hides this view.
  			 */
  def hide(): Unit = js.native
  def hide(options: AnimationOption): Unit = js.native
  /**
  			 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  			 */
  def insertAt(params: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.accessibilityHidden> property.
  			 */
  def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.accessibilityHint> property.
  			 */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.accessibilityLabel> property.
  			 */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.accessibilityValue> property.
  			 */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.anchorPoint> property.
  			 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundColor> property.
  			 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundGradient> property.
  			 */
  def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundImage> property.
  			 */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundLeftCap> property.
  			 */
  def setBackgroundLeftCap(backgroundLeftCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundRepeat> property.
  			 */
  def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.backgroundTopCap> property.
  			 */
  def setBackgroundTopCap(backgroundTopCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.borderColor> property.
  			 */
  def setBorderColor(borderColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.borderRadius> property.
  			 */
  def setBorderRadius(borderRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.borderWidth> property.
  			 */
  def setBorderWidth(borderWidth: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.bottom> property.
  			 */
  def setBottom(bottom: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.bottom> property.
  			 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.center> property.
  			 */
  def setCenter(center: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.clipMode> property.
  			 */
  def setClipMode(clipMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.height> property.
  			 */
  def setHeight(height: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.height> property.
  			 */
  def setHeight(height: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.horizontalMotionEffect> property.
  			 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.horizontalWrap> property.
  			 */
  def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.index> property.
  			 */
  def setIndex(index: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.labels> property.
  			 */
  def setLabels(labels: js.Array[BarItemType | String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.layout> property.
  			 */
  def setLayout(layout: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.left> property.
  			 */
  def setLeft(left: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.left> property.
  			 */
  def setLeft(left: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.opacity> property.
  			 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.previewContext> property.
  			 */
  def setPreviewContext(previewContext: PreviewContext): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.pullBackgroundColor> property.
  			 */
  def setPullBackgroundColor(pullBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.right> property.
  			 */
  def setRight(right: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.right> property.
  			 */
  def setRight(right: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.tintColor> property.
  			 */
  def setTintColor(tintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.top> property.
  			 */
  def setTop(top: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.top> property.
  			 */
  def setTop(top: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.touchEnabled> property.
  			 */
  def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.transform> property.
  			 */
  def setTransform(transform: Matrix2D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.transform> property.
  			 */
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.verticalMotionEffect> property.
  			 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.viewShadowColor> property.
  			 */
  def setViewShadowColor(viewShadowColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.viewShadowOffset> property.
  			 */
  def setViewShadowOffset(viewShadowOffset: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.viewShadowRadius> property.
  			 */
  def setViewShadowRadius(viewShadowRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.visible> property.
  			 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.width> property.
  			 */
  def setWidth(width: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.width> property.
  			 */
  def setWidth(width: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ButtonBar.zIndex> property.
  			 */
  def setZIndex(zIndex: Double): Unit = js.native
  /**
  			 * Makes this view visible.
  			 */
  def show(): Unit = js.native
  def show(options: AnimationOption): Unit = js.native
  /**
  			 * Starts a batch update of this view's layout properties.
  			 */
  def startLayout(): Unit = js.native
  /**
  			 * Returns an image of the rendered view, as a Blob.
  			 */
  def toImage(): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, _]): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, _], honorScaleFactor: Boolean): Blob = js.native
  /**
  			 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  			 * they have been updated.
  			 */
  def updateLayout(params: js.Any): Unit = js.native
}

