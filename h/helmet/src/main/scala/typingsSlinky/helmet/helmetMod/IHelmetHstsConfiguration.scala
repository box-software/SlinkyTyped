package typingsSlinky.helmet.helmetMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHstsConfiguration extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeSubDomains: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use includeSubDomains instead. (Uppercase "D")
    */
  var includeSubdomains: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
}

object IHelmetHstsConfiguration {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    includeSubDomains: js.UndefOr[Boolean] = js.undefined,
    includeSubdomains: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    setIf: (/* req */ Request[ParamsDictionary], /* res */ Response) => Boolean = null
  ): IHelmetHstsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubDomains)) __obj.updateDynamic("includeSubDomains")(includeSubDomains.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubdomains)) __obj.updateDynamic("includeSubdomains")(includeSubdomains.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (setIf != null) __obj.updateDynamic("setIf")(js.Any.fromFunction2(setIf))
    __obj.asInstanceOf[IHelmetHstsConfiguration]
  }
}

