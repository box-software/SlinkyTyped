package typingsSlinky.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrint): Request[ProductPurchase]
}

object ProductsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyOauthtokenPackageNamePrettyPrint => Request[ProductPurchase]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

