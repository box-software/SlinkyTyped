package typingsSlinky.gapiDotClientDotPartners.gapi.client.partners

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackEntireCompany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(request: Anon_AccesstokenAltBearertokenCallbackEntireCompany): Request[ListOffersHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertokenCallbackEntireCompany => Request[ListOffersHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[HistoryResource]
  }
}

