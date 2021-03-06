package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientMod.CustomResource
import typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientMod.CustomResourceType
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeCustomResourceType[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: CustomResourceType
}

object Anon_BodyHeadersOptionsResourceTypeCustomResourceType {
  @scala.inline
  def apply[T /* <: CustomResource */](body: T, resourceType: CustomResourceType, headers: Headers = null, options: Options = null): Anon_BodyHeadersOptionsResourceTypeCustomResourceType[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeCustomResourceType[T]]
  }
}

