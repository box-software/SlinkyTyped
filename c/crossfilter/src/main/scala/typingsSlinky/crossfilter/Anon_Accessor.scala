package typingsSlinky.crossfilter

import typingsSlinky.crossfilter.CrossFilter.Bisector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Accessor extends js.Object {
  def apply[T](array: js.Array[T], value: T, lo: Double, hi: Double): Double = js.native
  def by[T, U](accessor: js.Function1[/* x */ T, U]): Bisector[T, U] = js.native
}

