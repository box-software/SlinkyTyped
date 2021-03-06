package typingsSlinky.atFeathersjsAuthenticationDashLocal.atFeathersjsAuthenticationDashLocalMod

import typingsSlinky.atFeathersjsAuthenticationDashLocal.Anon_Message
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Application
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Paginated
import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-local", "LocalVerifier")
@js.native
class LocalVerifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
  def _comparePassword[T](entity: T, password: String): js.Promise[T] = js.native
   // compares password using bcrypt
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
   // normalizes result from service to account for pagination
  def verify(
    req: Request[ParamsDictionary],
    username: String,
    password: String,
    done: js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Anon_Message], 
      Unit
    ]
  ): Unit = js.native
}

