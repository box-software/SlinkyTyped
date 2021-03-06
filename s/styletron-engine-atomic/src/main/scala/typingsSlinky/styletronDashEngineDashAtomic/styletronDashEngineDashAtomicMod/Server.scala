package typingsSlinky.styletronDashEngineDashAtomic.styletronDashEngineDashAtomicMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.FontFace
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.KeyframesObject
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Server")
@js.native
class Server () extends StandardEngine {
  def this(opts: ServerOptions) = this()
  var fontFaceRules: String = js.native
  var keyframesRules: String = js.native
  var styleRules: StringDictionary[String] = js.native
  def getCss(): String = js.native
  def getStylesheets(): js.Array[Sheet] = js.native
  def getStylesheetsHtml(): String = js.native
  def getStylesheetsHtml(className: String): String = js.native
  /* CompleteClass */
  override def renderFontFace(fontFace: FontFace): String = js.native
  /* CompleteClass */
  override def renderKeyframes(keyframes: KeyframesObject): String = js.native
  /* CompleteClass */
  override def renderStyle(style: StyleObject): String = js.native
}

