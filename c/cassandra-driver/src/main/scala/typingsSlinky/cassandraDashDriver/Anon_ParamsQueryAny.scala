package typingsSlinky.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParamsQueryAny extends js.Object {
  var params: js.UndefOr[js.Any] = js.undefined
  var query: String
}

object Anon_ParamsQueryAny {
  @scala.inline
  def apply(query: String, params: js.Any = null): Anon_ParamsQueryAny = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParamsQueryAny]
  }
}

