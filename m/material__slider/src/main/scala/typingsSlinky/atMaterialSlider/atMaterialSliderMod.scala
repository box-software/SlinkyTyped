package typingsSlinky.atMaterialSlider

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialSlider.adapterMod.MDCSliderAdapter
import typingsSlinky.atMaterialSlider.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider", JSImport.Namespace)
@js.native
object atMaterialSliderMod extends js.Object {
  @js.native
  class MDCSlider ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCSliderAdapter, default] {
    var disabled: Boolean = js.native
    var max: Double = js.native
    var min: Double = js.native
    var step: Double = js.native
    var value: Double = js.native
    def initialize(): Unit = js.native
    def layout(): Unit = js.native
    def stepDown(): Unit = js.native
    def stepDown(amount: Double): Unit = js.native
    def stepUp(): Unit = js.native
    def stepUp(amount: Double): Unit = js.native
  }
  
  @js.native
  class MDCSliderFoundation () extends default
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typingsSlinky.atMaterialSlider.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialSlider.constantsMod.strings = js.native
  }
  
}

