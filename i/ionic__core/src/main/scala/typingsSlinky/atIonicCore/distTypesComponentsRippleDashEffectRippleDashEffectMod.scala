package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.atIonicCoreStrings.bounded
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/ripple-effect/ripple-effect", JSImport.Namespace)
@js.native
object distTypesComponentsRippleDashEffectRippleDashEffectMod extends js.Object {
  @js.native
  class RippleEffect () extends ComponentInterface {
    var el: HTMLElement = js.native
    /**
      * Sets the type of ripple-effect:
      *
      * - `bounded`: the ripple effect expands from the user's click position
      * - `unbounded`: the ripple effect expands from the center of the button and overflows the container.
      *
      * NOTE: Surfaces for bounded ripples should have the overflow property set to hidden,
      * while surfaces for unbounded ripples should have it set to visible.
      */
    var `type`: bounded | typingsSlinky.atIonicCore.atIonicCoreStrings.unbounded = js.native
    val unbounded: js.Any = js.native
    /**
      * Adds the ripple effect to the parent element.
      *
      * @param x The horizontal coordinate of where the ripple should start.
      * @param y The vertical coordinate of where the ripple should start.
      */
    def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
    @JSName("render")
    def render_MRippleEffect(): js.Any = js.native
  }
  
}

