package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourceChildLink extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object CustomDataSourceChildLink {
  @scala.inline
  def apply(href: String = null, `type`: String = null): CustomDataSourceChildLink = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataSourceChildLink]
  }
}

