package typingsSlinky.reactDashNativeDashMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
    * Optional: Custom filename for attachment
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The absolute path of the file from which to read data.
    */
  var path: String
  /**
    * Mime Type: jpg, png, doc, ppt, html, pdf, csv
    */
  var `type`: String
}

object Anon_Name {
  @scala.inline
  def apply(path: String, `type`: String, name: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

