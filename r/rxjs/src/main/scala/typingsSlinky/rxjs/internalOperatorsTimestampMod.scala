package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timestamp", JSImport.Namespace)
@js.native
object internalOperatorsTimestampMod extends js.Object {
  @js.native
  class Timestamp[T] protected ()
    extends typingsSlinky.rxjs.internalTypesMod.Timestamp[T] {
    def this(value: T, timestamp: Double) = this()
    /* CompleteClass */
    override var timestamp: Double = js.native
    /* CompleteClass */
    override var value: T = js.native
  }
  
  def timestamp[T](): OperatorFunction[T, Timestamp[T]] = js.native
  def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp[T]] = js.native
}

