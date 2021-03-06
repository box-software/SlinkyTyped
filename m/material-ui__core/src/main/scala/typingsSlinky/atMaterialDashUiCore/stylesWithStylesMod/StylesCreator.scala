package typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod

import typingsSlinky.atMaterialDashUiCore.Anon_Index
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesCreator extends js.Object {
  var options: Anon_Index = js.native
  var themingEnabled: Boolean = js.native
  def create(theme: Theme, name: String): StyleRules[String] = js.native
}

object StylesCreator {
  @scala.inline
  def apply(create: (Theme, String) => StyleRules[String], options: Anon_Index, themingEnabled: Boolean): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesCreator]
  }
}

