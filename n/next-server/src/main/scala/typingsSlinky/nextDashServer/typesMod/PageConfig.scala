package typingsSlinky.nextDashServer.typesMod

import typingsSlinky.nextDashServer.Anon_BodyParser
import typingsSlinky.nextDashServer.nextDashServerStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var amp: js.UndefOr[Boolean | hybrid] = js.undefined
  var api: js.UndefOr[Anon_BodyParser] = js.undefined
  var experimentalPrerender: js.UndefOr[Boolean] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(
    amp: Boolean | hybrid = null,
    api: Anon_BodyParser = null,
    experimentalPrerender: js.UndefOr[Boolean] = js.undefined
  ): PageConfig = {
    val __obj = js.Dynamic.literal()
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalPrerender)) __obj.updateDynamic("experimentalPrerender")(experimentalPrerender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageConfig]
  }
}

