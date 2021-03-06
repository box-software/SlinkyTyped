package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreMod.Color
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/list-header/list-header", JSImport.Namespace)
@js.native
object distTypesComponentsListDashHeaderListDashHeaderMod extends js.Object {
  @js.native
  class ListHeader () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    @JSName("render")
    def render_MListHeader(): js.Any = js.native
  }
  
}

