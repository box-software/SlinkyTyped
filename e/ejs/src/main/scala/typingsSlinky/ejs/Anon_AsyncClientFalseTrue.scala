package typingsSlinky.ejs

import typingsSlinky.ejs.ejsBooleans.`false`
import typingsSlinky.ejs.ejsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncClientFalseTrue extends js.Object {
  var async: js.UndefOr[`false`] = js.undefined
  var client: `true`
}

object Anon_AsyncClientFalseTrue {
  @scala.inline
  def apply(client: `true`, async: `false` = null): Anon_AsyncClientFalseTrue = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncClientFalseTrue]
  }
}

