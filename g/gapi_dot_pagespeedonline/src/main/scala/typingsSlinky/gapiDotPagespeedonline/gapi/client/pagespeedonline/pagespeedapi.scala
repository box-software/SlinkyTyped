package typingsSlinky.gapiDotPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiDotPagespeedonline.Anon_Fields
import typingsSlinky.gapiDotPagespeedonline.GoogleApiPageSpeedOnlineResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pagespeedapi extends js.Object {
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: Anon_Fields): HttpRequest[GoogleApiPageSpeedOnlineResource]
}

object pagespeedapi {
  @scala.inline
  def apply(runpagespeed: Anon_Fields => HttpRequest[GoogleApiPageSpeedOnlineResource]): pagespeedapi = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
  
    __obj.asInstanceOf[pagespeedapi]
  }
}

