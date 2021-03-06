package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Encounter
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyEncounterHeaders extends js.Object {
  var body: Encounter
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Encounter
}

object Anon_BodyEncounterHeaders {
  @scala.inline
  def apply(
    body: Encounter,
    id: String,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Encounter,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyEncounterHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyEncounterHeaders]
  }
}

