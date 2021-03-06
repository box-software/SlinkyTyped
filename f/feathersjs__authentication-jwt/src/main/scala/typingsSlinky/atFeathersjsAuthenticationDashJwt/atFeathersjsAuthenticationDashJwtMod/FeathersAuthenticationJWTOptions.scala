package typingsSlinky.atFeathersjsAuthenticationDashJwt.atFeathersjsAuthenticationDashJwtMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Application
import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationJWTOptions extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: Instantiable2[
    /* app */ Application[js.Object], 
    /* options */ js.Any, 
    typingsSlinky.atFeathersjsAuthenticationDashJwt.atFeathersjsAuthenticationDashJwtMod.Verifier
  ] = js.native
  /**
    * the entity that you pull from if an 'id' is present in the payload
    */
  var entity: String = js.native
  /**
    * a passport-jwt option determining where to parse the JWT
    */
  @JSName("jwtFromRequest")
  var jwtFromRequest_Original: JwtFromRequestFunction = js.native
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: String = js.native
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  /**
    * Your main secret provided to passport-jwt
    */
  var secretOrKey: String = js.native
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
  /**
    * a passport-jwt option determining where to parse the JWT
    */
  def jwtFromRequest(req: Request[ParamsDictionary]): String | Null = js.native
}

