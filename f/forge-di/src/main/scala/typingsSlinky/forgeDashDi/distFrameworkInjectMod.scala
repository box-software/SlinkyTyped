package typingsSlinky.forgeDashDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDashDi.distFrameworkDependencyMod.Dependency
import typingsSlinky.forgeDashDi.forgeDashDiStrings.__FORGE_DEPENDENCY_HINTS__
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/inject", JSImport.Namespace)
@js.native
object distFrameworkInjectMod extends js.Object {
  val HINT_PROPERTY: __FORGE_DEPENDENCY_HINTS__ = js.native
  def default[T](hints: StringDictionary[String | Partial[Dependency]]): js.Function1[/* target */ T, T] = js.native
}

