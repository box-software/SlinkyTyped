package typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atReactDashNativeDashCommunityCli.Anon_AssetsHooksParams
import typingsSlinky.atReactDashNativeDashCommunityCli.Anon_Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDependencyConfig extends js.Object {
  // An array of commands that ship with the dependency
  var commands: js.Array[Command]
  // Additional dependency settings
  var dependency: js.UndefOr[Anon_AssetsHooksParams] = js.undefined
  // Haste config defined by legacy `rnpm`
  var haste: js.UndefOr[Anon_Platforms] = js.undefined
  // An array of extra platforms to load
  var platforms: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UserDependencyConfig {
  @scala.inline
  def apply(
    commands: js.Array[Command],
    dependency: Anon_AssetsHooksParams = null,
    haste: Anon_Platforms = null,
    platforms: StringDictionary[js.Any] = null
  ): UserDependencyConfig = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (haste != null) __obj.updateDynamic("haste")(haste.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDependencyConfig]
  }
}

