package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Consent
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyConsentHeaders extends js.Object {
  var body: Consent
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Consent
}

object Anon_BodyConsentHeaders {
  @scala.inline
  def apply(
    body: Consent,
    id: String,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Consent,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyConsentHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyConsentHeaders]
  }
}

