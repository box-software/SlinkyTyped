package typingsSlinky.passportDashVkontakte.passportDashVkontakteMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-vkontakte", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.passportMod.Strategy {
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def this(options: StrategyOptions, verify: VerifyFunctionWithParams) = this()
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}

