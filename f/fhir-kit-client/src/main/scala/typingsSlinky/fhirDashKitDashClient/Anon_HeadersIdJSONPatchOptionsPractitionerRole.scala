package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.PractitionerRole
import typingsSlinky.jsonDashPatch.jsonDashPatchMod.OpPatch
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdJSONPatchOptionsPractitionerRole extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: PractitionerRole
}

object Anon_HeadersIdJSONPatchOptionsPractitionerRole {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: PractitionerRole,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdJSONPatchOptionsPractitionerRole = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdJSONPatchOptionsPractitionerRole]
  }
}

