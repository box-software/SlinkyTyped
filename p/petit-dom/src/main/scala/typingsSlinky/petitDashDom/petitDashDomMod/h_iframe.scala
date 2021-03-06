package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLIFrameElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.iframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_iframe extends js.Object {
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe): ElementNode[iframe, E] = js.native
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe, children: Content*): ElementNode[iframe, E] = js.native
  def apply[E /* <: HTMLIFrameElement */](`type`: iframe, props: Props[E], children: Content*): ElementNode[iframe, E] = js.native
}

