package typingsSlinky.sanctuary

import typingsSlinky.sanctuary.sanctuaryMod.Fn
import typingsSlinky.sanctuary.sanctuaryMod.Profunctor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_R[B, C, A, D] extends js.Object {
  def apply(r: Fn[B, C]): Fn[A, D] = js.native
  def apply(r: Profunctor[B, C]): Profunctor[A, D] = js.native
}

