package typingsSlinky.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenManagerOptions extends BaseClientOptions {
  var headers: js.UndefOr[js.Any] = js.undefined
}

object TokenManagerOptions {
  @scala.inline
  def apply(baseUrl: String, clientId: String = null, headers: js.Any = null): TokenManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenManagerOptions]
  }
}

