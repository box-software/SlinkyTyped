package typingsSlinky.gapiDotClientDotBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends js.Object {
  /** Location's latitude. */
  var lat: js.UndefOr[Double] = js.undefined
  /** Location's longitude. */
  var lng: js.UndefOr[Double] = js.undefined
  /** Location name. */
  var name: js.UndefOr[String] = js.undefined
  /** Location's viewport span. Can be used when rendering a map preview. */
  var span: js.UndefOr[String] = js.undefined
}

object Anon_Lat {
  @scala.inline
  def apply(lat: Int | Double = null, lng: Int | Double = null, name: String = null, span: String = null): Anon_Lat = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lat]
  }
}

