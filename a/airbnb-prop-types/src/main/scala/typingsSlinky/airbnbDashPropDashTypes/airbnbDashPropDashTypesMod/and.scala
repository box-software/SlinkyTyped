package typingsSlinky.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "and")
@js.native
object and extends js.Object {
  def apply[T](propTypes: js.Array[Validator[_]]): Requireable[T] = js.native
  def apply[T](propTypes: js.Array[Validator[_]], name: String): Requireable[T] = js.native
  def apply[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A with B] = js.native
  def apply[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A with B] = js.native
  def apply[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A with B with C] = js.native
  def apply[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A with B with C] = js.native
}

