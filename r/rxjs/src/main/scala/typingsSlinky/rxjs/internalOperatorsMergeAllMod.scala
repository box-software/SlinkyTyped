package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/mergeAll", JSImport.Namespace)
@js.native
object internalOperatorsMergeAllMod extends js.Object {
  def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = js.native
}

