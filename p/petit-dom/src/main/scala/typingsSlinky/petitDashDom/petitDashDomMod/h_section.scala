package typingsSlinky.petitDashDom.petitDashDomMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Content
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
import typingsSlinky.petitDashDom.petitDashDomStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_section extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: section): ElementNode[section, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: section, children: Content*): ElementNode[section, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: section, props: Props[E], children: Content*): ElementNode[section, E] = js.native
}

