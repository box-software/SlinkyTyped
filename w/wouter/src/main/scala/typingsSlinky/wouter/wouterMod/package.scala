package typingsSlinky.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wouterMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLAnchorElement
  import typingsSlinky.react.reactMod.AnchorHTMLAttributes
  import typingsSlinky.std.Omit
  import typingsSlinky.wouter.wouterBooleans.`false`
  import typingsSlinky.wouter.wouterBooleans.`true`
  import typingsSlinky.wouter.wouterStrings.href

  type DefaultParams = StringDictionary[String]
  type LinkProps = (Omit[AnchorHTMLAttributes[HTMLAnchorElement], href]) with NavigationalProps
  type LocationHook = js.Function1[/* options */ js.UndefOr[LocationHookOptions], LocationTuple]
  type LocationTuple = js.Tuple2[Path, PushCallback]
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  type NoMatch = js.Tuple2[`false`, Null]
  type Params[T /* <: DefaultParams */] = T
  type Path = String
  type PushCallback = js.Function2[/* to */ Path, /* replace */ js.UndefOr[Boolean], Unit]
  type RedirectProps = NavigationalProps with js.Object
}
