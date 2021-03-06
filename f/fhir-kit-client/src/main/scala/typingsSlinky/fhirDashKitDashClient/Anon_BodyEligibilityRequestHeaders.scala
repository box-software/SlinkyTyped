package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.EligibilityRequest
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyEligibilityRequestHeaders extends js.Object {
  var body: EligibilityRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.EligibilityRequest
}

object Anon_BodyEligibilityRequestHeaders {
  @scala.inline
  def apply(
    body: EligibilityRequest,
    id: String,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.EligibilityRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyEligibilityRequestHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyEligibilityRequestHeaders]
  }
}

