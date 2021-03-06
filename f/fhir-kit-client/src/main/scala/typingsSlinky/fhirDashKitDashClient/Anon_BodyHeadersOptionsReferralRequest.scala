package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.ReferralRequest
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsReferralRequest extends js.Object {
  var body: ReferralRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.ReferralRequest
}

object Anon_BodyHeadersOptionsReferralRequest {
  @scala.inline
  def apply(
    body: ReferralRequest,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.ReferralRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsReferralRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsReferralRequest]
  }
}

