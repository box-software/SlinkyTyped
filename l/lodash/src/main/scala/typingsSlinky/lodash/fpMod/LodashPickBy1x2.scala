package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.Dictionary
import typingsSlinky.lodash.lodashMod.ValueKeyIteratee
import typingsSlinky.lodash.lodashMod.ValueKeyIterateeTypeGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy1x2[T] extends js.Object {
  def apply(predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
}

