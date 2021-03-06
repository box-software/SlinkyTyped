package typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var Prism: PrismLib
  var theme: PrismTheme
}

object DefaultProps {
  @scala.inline
  def apply(Prism: PrismLib, theme: PrismTheme): DefaultProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultProps]
  }
}

@JSImport("prism-react-renderer", "defaultProps")
@js.native
object defaultProps extends TopLevel[DefaultProps]

