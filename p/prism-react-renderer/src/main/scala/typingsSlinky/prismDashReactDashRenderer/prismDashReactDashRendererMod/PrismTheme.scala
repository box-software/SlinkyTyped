package typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod

import typingsSlinky.prismDashReactDashRenderer.Anon_Languages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismTheme extends js.Object {
  var plain: PrismThemeEntry
  var styles: js.Array[Anon_Languages]
}

object PrismTheme {
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[Anon_Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrismTheme]
  }
}

