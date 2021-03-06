package typingsSlinky.gapiDotClientDotAdsense.gapi.client.adsense

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdsense.Anon_AccountIdAlertId
import typingsSlinky.gapiDotClientDotAdsense.Anon_AccountIdAlt
import typingsSlinky.gapiDotClientDotAdsense.Anon_AlertId
import typingsSlinky.gapiDotClientDotAdsense.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: Anon_AccountIdAlertId): Request[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: Anon_AlertId): Request[Unit] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: Anon_AccountIdAlt): Request[Alerts] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: Anon_AltFields): Request[Alerts] = js.native
}

