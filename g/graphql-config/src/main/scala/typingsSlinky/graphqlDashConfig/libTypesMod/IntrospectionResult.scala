package typingsSlinky.graphqlDashConfig.libTypesMod

import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionResult extends js.Object {
  var data: IntrospectionQuery
  var errors: js.UndefOr[js.Any] = js.undefined
  var extensions: js.UndefOr[js.Object] = js.undefined
}

object IntrospectionResult {
  @scala.inline
  def apply(data: IntrospectionQuery, errors: js.Any = null, extensions: js.Object = null): IntrospectionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResult]
  }
}

