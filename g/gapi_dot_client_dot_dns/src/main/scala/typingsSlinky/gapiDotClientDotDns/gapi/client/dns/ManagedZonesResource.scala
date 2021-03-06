package typingsSlinky.gapiDotClientDotDns.gapi.client.dns

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDns.Anon_Alt
import typingsSlinky.gapiDotClientDotDns.Anon_AltDnsName
import typingsSlinky.gapiDotClientDotDns.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesResource extends js.Object {
  /** Create a new ManagedZone. */
  def create(request: Anon_AltFieldsKey): Request[ManagedZone]
  /** Delete a previously created ManagedZone. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Fetch the representation of an existing ManagedZone. */
  def get(request: Anon_Alt): Request[ManagedZone]
  /** Enumerate ManagedZones that have been created but not yet deleted. */
  def list(request: Anon_AltDnsName): Request[ManagedZonesListResponse]
}

object ManagedZonesResource {
  @scala.inline
  def apply(
    create: Anon_AltFieldsKey => Request[ManagedZone],
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[ManagedZone],
    list: Anon_AltDnsName => Request[ManagedZonesListResponse]
  ): ManagedZonesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ManagedZonesResource]
  }
}

