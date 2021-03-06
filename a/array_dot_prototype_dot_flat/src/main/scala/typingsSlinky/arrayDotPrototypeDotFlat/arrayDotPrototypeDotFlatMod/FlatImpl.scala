package typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatMod

import typingsSlinky.arrayDotPrototypeDotFlat.Array
import typingsSlinky.arrayDotPrototypeDotFlat.ReadonlyArray
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`0`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`1`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`2`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`3`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`4`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`5`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`6`
import typingsSlinky.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatImpl extends js.Object {
  def apply(receiver: ReadonlyArray[_]): Array[_] = js.native
  def apply(receiver: ReadonlyArray[_], depth: Double): Array[_] = js.native
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = js.native
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = js.native
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = js.native
  def apply[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = js.native
  def apply[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
  def apply[U](
    receiver: ReadonlyArray[
      (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
    ],
    depth: `2`
  ): Array[U] = js.native
  def apply[U](
    receiver: ReadonlyArray[
      (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
        (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
      ])
    ],
    depth: `3`
  ): Array[U] = js.native
  def apply[U](
    receiver: ReadonlyArray[
      (Array[
        (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[Array[Array[U]] | ReadonlyArray[ReadonlyArray[U]]])
      ]) | (ReadonlyArray[
        (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
          (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
        ])
      ])
    ],
    depth: `4`
  ): Array[U] = js.native
}

