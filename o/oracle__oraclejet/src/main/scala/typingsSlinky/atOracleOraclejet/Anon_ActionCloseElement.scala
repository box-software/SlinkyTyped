package typingsSlinky.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.close
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCloseElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
  def endCallback(): Unit
}

object Anon_ActionCloseElement {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionCloseElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionCloseElement]
  }
}

